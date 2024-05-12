package EjerciciosMatrices;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {


        int[][] matriz = null;
        int opcion;

        Scanner scn = new Scanner(System.in);

        do {
            System.out.println("Bienvenido al juego de la Matriz.\nPor favor, introduzca una de las siguientes opciones:");
            System.out.println("1.Introducir una matriz.\n2.Suma una fila.\n3.Suma una columna.\n4.Suma la diagonal principal.\n5.Suma la diagonalinversa.\n6.La media de la matriz.");

            opcion = scn.nextInt();
            if (matriz == null && opcion != 1) {
                System.out.println("No tienes ninguna matriz creada.");
            } else {

                switch (opcion) {

                    case 1:
                        matriz = new int[4][4];
                        for (int i = 0; i < matriz.length; i++) {
                            for (int j = 0; j < matriz[i].length; j++) {
                                System.out.println("Introduzca el numero [" + (i) + "] [" + (j) + "].");
                                matriz[i][j] = scn.nextInt();
                                System.out.println(matriz[i][j]);
                            }
                            System.out.println();
                        }
                        break;
                    case 2:
                        System.out.println("¿Que fila quiere sumar?:");
                        int fila = scn.nextInt();
                        int sumaf = 0;
                        for (int j = 0; j < matriz[fila - 1].length; j++) {
                            sumaf = sumaf + matriz[fila-1][j];
                        }
                        System.out.println("La suma de la fila " + fila + " es: " + sumaf);
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("¿Que columna quiere sumar?:");
                        int columna = scn.nextInt();
                        int sumac = 0;
                        for (int i = 0; i < matriz.length; i++) {
                            sumac = sumac + matriz[i][columna-1];
                        }
                        System.out.println("La suma de la columna " + columna + " es: " + sumac);
                        System.out.println();
                        break;
                    case 4:
                        int sumadp = 0;
                        for (int i = 0; i < matriz.length; i++) {
                            for (int j = 0; j < matriz[i].length; j++) {
                                if (i == j) {
                                    sumadp = sumadp + matriz[i][j];
                                }
                            }
                        }
                        System.out.println("La suma de la diagonal principal es: " + sumadp);
                        System.out.println();
                        break;
                    case 5:
                        int sumadi = 0;
                        for (int i = 0; i < matriz.length; i++) {
                            for (int j = 0; j < matriz[i].length; j++) {
                                if (i + j == matriz[i].length) {
                                    sumadi = sumadi + matriz[i][j];
                                }
                            }
                        }
                        System.out.println("La suma de la diagonal inversa es: " + sumadi);
                        System.out.println();
                        break;
                    case 6:
                        int sumam = 0;
                        int count= 0;
                        for (int i = 0; i < matriz.length; i++) {
                            for (int j = 0; j < matriz[i].length; j++) {
                                sumam = sumam + matriz[i][j];
                                count++;
                            }
                        }
                        System.out.println("La media de la matriz es: " + sumam/count);
                        System.out.println();
                        break;
                }
            }
        } while (opcion > 0 && opcion < 7);


    }
}
