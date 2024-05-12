package Entreno1uf5;

import java.util.ArrayList;
import java.util.Scanner;

public class Temperatura {

    private ArrayList<Integer> lista;
    Scanner scn = new Scanner(System.in);
    int opcion;

    public Temperatura() {
        lista = new ArrayList<>();
    }

    public void agregar() {
        System.out.println("Introduzca una temperatura a añadir");
        opcion = scn.nextInt();
        lista.add(opcion);

    }

    public void mostrarMedia() {
        double media = 0;
        for (Integer i : lista) {
            media = media + i;
        }
        System.out.println("La media de temepraturas es " + media / lista.size());
    }

    public void mostrarExtremos() {
        int alto = 0;
        int bajo = 1000;
        for (Integer i : lista) {
            if (i > alto) {
                alto = i;

            }
            if (i < bajo) {
                bajo = i;
            }
        }
        System.out.println("Temp mas alta: " + alto + "\nTemp mas baja: " + bajo);
    }
}
