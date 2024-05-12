package Entreno2uf4;

public class Persona {

    private String nombre, apellido, dni;
    private int edad,altura;
    private double peso;

    //Constructor por defecto
    public  Persona(){

    }
    // Constructor con parametros
    public Persona(String nombre, String apellido, String dni, int edad, int altura, double peso){

        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.edad=edad;
        this.altura=altura;
        this.peso=peso;

    }
    //Constructor copia

    public Persona(Persona p){

        nombre=p.nombre;
        apellido=p.apellido;
        dni=p.dni;
        edad=p.edad;
        altura=p.altura;
        peso=p.peso;
    }

    //Metodo IMC

    public double calcularIMC(){
        double cIMC;
        cIMC=this.peso/(((double)this.altura/(double)100)*((double)this.altura/(double)100));
        if(cIMC<18.5){
            System.out.println("El IMC es inferior a lo normal");
        }else if (cIMC>=18.5 && cIMC<=24.9){
            System.out.println("El IMC es normal");
        }else if (cIMC>=25.0 && cIMC<=29.9){
            System.out.println("El IMC es superior a lo normal");
        }else if (cIMC>30){
            System.out.println("Obesidad");
        }
        return cIMC;
    }
    //Metodo toString

    public String toString(){
        return "nombre: "+this.nombre+" apellido: "+this.apellido+" dni: "+this.dni+" edad: "+this.edad+" altura: "+this.altura+" peso: "+this.peso;
    }

    //Metodo Getter

    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getDni(){
        return this.dni;
    }
    public int getEdad(){
        return this.edad;
    }
    public int getAltura(){
        return this.altura;
    }
    public double getPeso(){
        return this.peso;
    }

    //Metodo Setter

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setDni(String dni){
        this.dni=dni;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setAltura(int altura){
        this.altura=altura;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }
}
