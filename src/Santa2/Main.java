package Santa2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){


        int opcion;
        Cd anastasia= new Cd();
        Scanner scn= new Scanner(System.in);
        String titulo=null;
        String artista=null;


        System.out.println("En este Cd hay 10 pistas.\n1.Devuelve la cancion de una pista.\n2.Numero de canciones.\n3.Introduce una cancion en una pista.\n4.Agrega una cancion.\n5.Elimina una cancion");
        opcion=scn.nextInt();

        switch(opcion){
            case 1:
                System.out.println("¿Que cancion quieres escuchar?");
                opcion=scn.nextInt();
                anastasia.dameCancion(opcion);
                break;
            case 2:
                System.out.println("¿Que pista quieres escuchar?");
                anastasia.numeroCanciones();
                break;
            case 3:
                System.out.println("¿Que cancion y donde la quieres introducir?");
                titulo=scn.nextLine();
                artista=scn.nextLine();
                Cancion cancion= new Cancion(titulo,artista);
                opcion=scn.nextInt();
                anastasia.grabaCancion(opcion,cancion);
                break;
            case 4:
                System.out.println("¿Que cancion quieres introducir?");
                titulo=scn.nextLine();
                artista=scn.nextLine();
                Cancion cancion1= new Cancion(titulo,artista);
                anastasia.agrega(cancion1);
                break;
            case 5:
                System.out.println("¿Que cancion quieres escuchar?");
                opcion=scn.nextInt();
                anastasia.elimina(opcion);
                break;


        }
    }
}
