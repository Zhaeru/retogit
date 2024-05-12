package EjerciciosPoo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

    Scanner scn = new Scanner(System.in);
    String titulo, autor;
    int ejemplares;

    //constuctor con parametros
    Libro libro1 = new Libro("Don quijote","Cervantes",5,0);

    //constructor sin parametros
    Libro libro2 = new Libro();

    titulo=scn.nextLine();
    autor=scn.nextLine();
    ejemplares=scn.nextInt();

    //usadno el setter
    libro2.setTitulo(titulo);
    //usando el getter
        System.out.println(libro1.getTitulo());

    //Usando el toString

        System.out.println(libro1);

    //Usando el prestamo
        if(libro1.prestar()){
            System.out.println("Se ha hecho el libro de "+libro1.getTitulo());
        }


    //USando la devolucion

        if (libro1.devolver()){
            System.out.println("Se ha devuelto con exito "+libro1.getTitulo());
        }

    System.out.println(libro1);


    }
}
