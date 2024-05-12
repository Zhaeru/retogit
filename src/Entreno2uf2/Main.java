package Entreno2uf2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scn= new Scanner(System.in);
        int hipoteca;
        int tiempo;
        int interes;

        System.out.println("Introduzca la cantidad de dinero que necesita.");
        hipoteca=scn.nextInt();
        System.out.println("Introduzca en cuantos años la quiere pagar.");
        tiempo = scn.nextInt();
        System.out.println("Introduzca el tipo de interes que le aplicara el banco.");
        interes= scn.nextInt();
        if(conceder(hipoteca, tiempo)) {
            tabla(hipoteca, tiempo, interes);
        }else {
            System.out.println("Impoteca NO concedida.");

        }


    }
    static boolean conceder(int hipoteca, int tiempo){
        boolean concede;
        concede=(hipoteca<500000 && tiempo< 40);
         return concede;
        }


    static void tabla(int hipoteca, int tiempo, int interes) {

        int meses= tiempo*12;
        int total = hipoteca + (hipoteca*interes/100);
        int [] array= new int [meses];
        for(int i=0;i<array.length;i++) {

            array[i]=total/meses;

            System.out.println("Mes "+(i+1)+" Cuota "+array[i]);

        }



    }

}







