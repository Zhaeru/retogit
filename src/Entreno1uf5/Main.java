package Entreno1uf5;

import java.util.Scanner;

public class Main {

    public static void main(String []args){

        int opcion;
        Temperatura lista = new Temperatura();
        Scanner scn= new Scanner(System.in);

        do {
            System.out.println("Introduzca la opcion deseada:\n1-Añadir temperatura\n2-Mostrar temperatura media\n3.Mostrar temperaturas extremas\n4-Salir");

            opcion = scn.nextInt();

            switch(opcion){
                case 1:
                    lista.agregar();
                    break;
                case 2:
                    lista.mostrarMedia();
                    break;
                case 3:
                    lista.mostrarExtremos();
                    break;

            }
        }while(opcion!=4);







    }
}
