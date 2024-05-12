package Entreno3uf4;

public class Triangulo extends Figura {


    public Triangulo(){

    }

    public Triangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
         altura=getAltura();
         base=getBase();
        double area = (double) (base*altura)/2;
        return area;
    }

    @Override
    public int getBase() {
        return super.getBase();
    }

    @Override
    public int getAltura() {
        return super.getAltura();
    }

    @Override
    public void setBase(int base) {
        super.setBase(base);
    }

    @Override
    public void setAltura(int altura) {
        super.setAltura(altura);
    }
}
