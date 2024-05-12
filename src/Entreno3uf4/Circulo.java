package Entreno3uf4;

public class Circulo extends Figura {

    private double radio;
    private double diametro;
    private double area;

    public Circulo(){

    }
    public Circulo(double radio){
        this.radio=radio;
    }


    @Override
    public double calcularArea() {
        radio=getRadio();
        area= 3.14*radio*radio;
        return area;
    }
    public double calcularDiametro(){
        radio=getRadio();
        diametro=2*radio;
        return diametro;
    }

    public double getRadio(){
        return this.radio;
    }
    public double getDiametro(){
        return this.diametro;
    }
    public double getArea(){
        return this.area;
    }
    public void setRadio(double radio){
        this.radio=radio;
    }
    public void setDiametro(double diametro){
        this.diametro=diametro;
    }
    public void setArea(double area){
        this.area=area;
    }

}

