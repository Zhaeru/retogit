package Entreno1uf4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



    Asignatura asignatura1 = new Asignatura(1);
    Asignatura asignatura2 = new Asignatura(2);
    Asignatura asignatura3 = new Asignatura(3);


    Alumno alumno1= new Alumno(asignatura1, asignatura2, asignatura3);
    Alumno alumno2= new Alumno(asignatura1, asignatura2, asignatura3);


    Profesor profesor1 = new Profesor();

    System.out.println("Notas de alumno1");
    profesor1.ponerNotas(alumno1);
    System.out.println(profesor1.calcularMedia(alumno1));

    System.out.println("Notas de alumno2");
    profesor1.ponerNotas(alumno2);
    System.out.println(profesor1.calcularMedia(alumno2));








    }
}
