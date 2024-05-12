package Entreno3uf4;

public class Cuadrado extends Figura{


    private double area;
    private double perimetro;
    public Cuadrado() {
    }

    public Cuadrado(int base, int altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        altura=getAltura();
        base=getBase();
         area =(base*altura);
        return area;
    }
    public double calcularPerimetro(){
        altura=getAltura();
        base=getBase();
        perimetro = (2*altura)+(2*base);
        return perimetro;
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

