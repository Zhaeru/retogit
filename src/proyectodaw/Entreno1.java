package proyectodaw;

import java.util.Scanner;

public class Entreno1 {
    public static void main(String[] args){

        //Variables
        int num1;
        int num2;
        int num3;
        int suma;
        boolean comparacion;
        Scanner scn = new Scanner(System.in);

        //Introducir numero por consola
        System.out.println("Introduzca el primer numero");
        num1=scn.nextInt();
        System.out.println("Introduzca el segundo numero");
        num2=scn.nextInt();
        System.out.println("Introduce el ultimo numero");
        num3=scn.nextInt();

        //Operaciones
        suma= num1 + num2;
        comparacion= suma == num3;

        //Mostrar resultado por consola
        if(comparacion){
            System.out.println("Los dos primeros son la suma del tercero");
            System.out.print(suma);
            System.out.print(" = ");
            System.out.print(num3);
        } else {
            System.out.println("Los dos primeros no son la suma del tercero");
            System.out.print(suma);
            System.out.print(" =/ ");
            System.out.print(num3);
        }


    }
}
