package Interactivos;

import java.util.Scanner;

import static javax.swing.text.html.HTML.Attribute.N;

public class Invertir {
    public static void main(String[] args){

        int num;
        String cadena;
        int N;
        Scanner scn= new Scanner(System.in);
        System.out.println("Introduzca un numero.");
        num= scn.nextInt();

        cadena = String.valueOf(num);
        N = cadena.length();

        invertir(num,N);

    }
    static void invertir(int num,int N){
        int resto;

        if(N==1){
            resto=num%10;
            System.out.print(resto);
        }else{
            resto=num%10;
            num=num/10;
            System.out.print(resto);
            invertir(num,N-1);
        }


    }
}