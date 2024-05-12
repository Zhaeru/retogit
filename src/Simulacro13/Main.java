package Simulacro13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int num;

        Scanner scn= new Scanner(System.in);

        System.out.println("Introduzca el exponente con el que desea trabajar.");
        num=scn.nextInt();

        System.out.println("El resultado es: "+calcularPotencia(num));

    }

    public static int calcularPotencia(int num){
        int resultado;
        if(num ==0){
            resultado=1;
        }else{
            resultado=2*calcularPotencia(num-1);

        }


        return resultado;
    }

}
