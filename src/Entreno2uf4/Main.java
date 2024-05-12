package Entreno2uf4;

import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        String nombre, apellido, dni;
        int edad, altura;
        double peso;

        Scanner scn = new Scanner(System.in);
        Persona persona1 = new Persona();

        System.out.println("Introduzca el nombre de la persona.");
        persona1.setNombre(scn.nextLine());


        System.out.println("Introduzca el apellido de la persona.");
        persona1.setApellido(scn.nextLine());


        System.out.println("Introduzca el dni de la persona.");
        persona1.setDni(scn.next());


        System.out.println("Introduzca la edad de la persona.");
        persona1.setEdad(scn.nextInt());


        System.out.println("Introduzca la altura de la persona.");
        persona1.setAltura(scn.nextInt());


        System.out.println("Introduzca el peso de la persona.");
        persona1.setPeso(scn.nextDouble());

        System.out.println("El IMC de "+persona1.getNombre()+" es: "+persona1.calcularIMC());



    }
}
