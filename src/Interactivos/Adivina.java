package Interactivos;

import java.util.Scanner;

import static javax.swing.text.html.HTML.Attribute.N;

public class Adivina {
    public static void main(String[] args) {

        int num;

        Scanner scn = new Scanner(System.in);
        System.out.println("Introduzca un numero a adivinar");
        num = scn.nextInt();
        adivino(num);

    }

    static void adivino(int n) {

        int adivina = (int) (Math.random() * 101) + 1;
        int respuesta;
        int intentos = 0;
        int mayor = 101;
        int menor = 1;
        Scanner scn = new Scanner(System.in);

        do {
            intentos = intentos + 1;
            System.out.println("¿El numero que has pensado es mayor o menor que " + adivina + " ?" + "\n1.Mayor." + "\n2.Menor.");
            respuesta = scn.nextInt();
            switch (respuesta) {
                case 1:
                    menor = adivina;
                    adivina = (int) ((Math.random() * (mayor - menor)) + menor);
                    break;
                case 2:
                    mayor = adivina;
                    adivina = (int) ((Math.random() * (mayor - menor)) + menor);
                    break;
                default:
                    System.out.println("Error.");
                    break;
            }
        } while (adivina != n);
        System.out.println("El numero que has pensado es " + adivina + "\nNumero de intentos: " + intentos);
    }
}