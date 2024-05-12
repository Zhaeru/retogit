package EjerciciosPoo;

public class Libro {

    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestamos;

    //Contructor por defecto (vacio)

    public  Libro(){


    }
    //Constructor con parametros

    public  Libro(String titulo, String autor, int ejemplares, int prestamos){
        this.titulo=titulo;
        this.autor=autor;
        this.ejemplares=ejemplares;
        this.prestamos=prestamos;

    }
    //Metodo prestamo

    public boolean prestar(){
        boolean prestado = true;
        if(prestamos<ejemplares){

            prestamos=prestamos+1;
        }else{
            prestado = false;

        }
        return prestado;
    }

    //Metodo devoluciones

    public boolean devolver(){
        boolean devolucion = true;
        if(prestamos!= 0){

            prestamos=prestamos-1;
        }else{
            devolucion = false;

        }
        return devolucion;
    }

    //Getters

    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getEjemplares(){
        return this.ejemplares;
    }
    public int getPrestamos(){
        return this.prestamos;
    }

    //Setters

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public void setEjemplares(int ejemplares){
        this.ejemplares=ejemplares;
    }
    public void setPrestamos(int prestamos){
        this.prestamos=prestamos;
    }

    //Metodo toString

    public String toString(){
        return " "+this.autor;
    }
}
