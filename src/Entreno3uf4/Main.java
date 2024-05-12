package Entreno3uf4;

import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            Triangulo triangulo1 = new Triangulo(3, 4);
            Cuadrado cuadrado1 = new Cuadrado(5, 6);
            Circulo circulo1 = new Circulo(5);

            System.out.println("La base del triangulo es "+triangulo1.getBase());
            System.out.println("La base del cuadrado es "+cuadrado1.getBase());
            System.out.println("El radio del circulo es "+circulo1.getBase());

            int opcion;

            Scanner scn = new Scanner(System.in);

            System.out.println("Introduzca una del as opciones. 1.Triangulo 2. Cuadrado 3. Circulo");
            opcion= scn.nextInt();
            switch(opcion){
                case 1:
                    Triangulo triangulo2 = new Triangulo();
                    System.out.println("Introduzca base del triangulo.");
                    triangulo2.setBase(scn.nextInt());
                    System.out.println("Introduzca altura del triangulo.");
                    triangulo2.setAltura(scn.nextInt());
                    System.out.println("El area del triangulo es: "+triangulo2.calcularArea());
                    break;
                case 2:
                    Cuadrado cuadrado2 = new Cuadrado();
                    System.out.println("Introduzca base del cuadrado.");
                    cuadrado2.setBase(scn.nextInt());
                    System.out.println("Introduzca altura del cuadrado.");
                    cuadrado2.setAltura(scn.nextInt());
                    System.out.println("El area del cuadrado es: "+cuadrado2.calcularArea());
                    System.out.println("El perimetro del cuadrado es: "+cuadrado2.calcularPerimetro());
                    break;
                case 3:
                    Circulo circulo2 = new Circulo();
                    System.out.println("Introduzca radio del circulo.");
                    circulo2.setRadio(scn.nextInt());
                    System.out.println("El area del circulo es: "+circulo2.calcularArea());
                    System.out.println("El diametro del circulo es: "+circulo2.calcularDiametro());
                    break;



            }


        }
}
