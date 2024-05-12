package proyectodaw;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args){

        //Variables
        double sec;
        double segundos;
        double min;
        double minutos;
        double horas;
        int segundo;
        int minuto;
        int hora;

        Scanner scn= new Scanner (System.in);

        //Pedido por consola

        System.out.println("Introduzca una cantidad de segundos.");
        sec = scn.nextDouble();


        //Conversión a horas

        min = sec/60;
        segundos= sec%60;
        horas=min/60;
        minutos= min%60;

        //Mostrado por consola

        hora=(int) horas;
        minuto=(int) minutos;
        segundo=(int) segundos;

        System.out.println("Este es el resultado de los segundos introducidos:");
        System.out.println(hora +(" horas, ") + minuto +(" minutos y ") + segundo +(" segundos"));
    }
}
