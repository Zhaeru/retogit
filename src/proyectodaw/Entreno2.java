package proyectodaw;

import java.util.Scanner;

public class Entreno2 {
    public static void main(String[] args) {

        //Variables
        int num1;
        int num2;
        int resta;
        boolean paridad1;
        boolean paridad2;
        boolean condicion1;
        boolean condicion2;
        boolean igualdad;
        boolean menor0;
        Scanner scn = new Scanner(System.in);

        //Introducir numeros
        System.out.println("Introduce un numero");
        num1 = scn.nextInt();
        System.out.println("Introduce otro numero");
        num2 = scn.nextInt();


        //Operaciones
        resta = num1 - num2;
        igualdad= num1 == num2;
        menor0= resta < 0;
        paridad1 = (num1 % 2) == 0;
        paridad2 = (num2 % 2) == 0;
        condicion1 = (num1 > (2 * num2)) && (num1 < 8);
        condicion2 = igualdad || menor0;
        if (paridad1 && paridad2) {
            System.out.println("-Los dos numeros son pares");
        } else {
            System.out.println("-Los dos numeros no son pares");

        }
        if (condicion1) {
            System.out.println("-El primer numero es mas grande que el doble del segundo y menor que 8");
            System.out.print(num1);
            System.out.print(" > ");
            System.out.print(2*num2);
            System.out.print("; y ;");
            System.out.print(num1+ " < 8");
        } else {
            System.out.println("-El primer numero no es mas grande que el doble del segundo y menor que 8");
            System.out.print(num1);
            System.out.print(" >/ ");
            System.out.print(2*num2);
            System.out.print("; y ;");
            System.out.println(num1+ " </ 8");

        }
        if (condicion2) {
            if(igualdad) {
                System.out.println("-El primer numero es igual al segundo");
                System.out.print(num1);
                System.out.print(" = ");
                System.out.println(num2);
                System.out.println("-Pero la resta de ambos no es menor que 0");
                System.out.print(resta);
                System.out.println(" </ 0");
            } else {
                System.out.println("-La resta de ambos es menor que 0");
                System.out.print(resta);
                System.out.println(" < 0");
                System.out.println("-Pero el primero numero no es igual al segundo");
                System.out.print(num1);
                System.out.print(" =/ ");
                System.out.println(num2);
            }
        } else{
            System.out.println("-Ni el primer numero es igual al segundo");
            System.out.print(num1);
            System.out.print(" =/ ");
            System.out.println(num2);
            System.out.println("-Ni la resta de ambos es menor que 0");
            System.out.print(resta);
            System.out.println(" </ 0");
        }
    }
}

