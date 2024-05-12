package proyectodaw;

import java.util.Scanner;

public class Reto4 {
    public static void main(String[]args){

        //Variables
        int num;
        int base10;
        int restos;
        String resultado="";
        String base2="";
        Scanner scn = new Scanner(System.in);

        //Pedir por consola
        System.out.println("Introduzca un numero entero positivo para convertirlo en binario");
        base10= scn.nextInt();
        num=base10;
        //Operacion de Restos

        do{
            restos=base10%2;
            resultado+=String.valueOf(restos);
            base10=base10/2;
             if (base10==1){
                 resultado+=String.valueOf(base10);
             }
        }while(base10>1);
        //Inversión para el binario

        for (int i = resultado.length()-1; i>=0;--i){
            base2+=resultado.charAt(i);
        };

        System.out.printf("El binario de %d es %s", num, base2);
    }
}
