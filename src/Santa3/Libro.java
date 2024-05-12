package Santa3;

import java.util.Scanner;

public class Libro {

    private String titulo;
    private String autor;
    private int fecha;
    Scanner scn= new Scanner(System.in);

    public Libro(String titulo,String autor,int fecha){
        this.titulo=titulo;
        this.autor=autor;
        this.fecha=fecha;
    }




    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", fecha=" + fecha +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
