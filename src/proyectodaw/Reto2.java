package proyectodaw;


import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args){

        //Variables
        float valor0;
        float iva;
        float valor1;
        String moneda;

        Scanner scn= new Scanner (System.in);

        //Pedir por consola
        System.out.println("Introduzca el precio del artículo sin impuestos");
        valor0= scn.nextFloat();
        System.out.println("Introduzca, ahora, el valor del impuesto aplicado a ese articulo (IVA)");
        iva=scn.nextFloat();
        System.out.println("Introduzca, por último, el simbolo o el nombre de su moneda, p.e.: €,$ (o escriba ''null'' para dejarlo en blanco");
        moneda= scn.next();

        //Calculador
        valor1 = valor0 + ((valor0 * iva)/100);



        //Mostrar por consola
        System.out.printf("El precio del artículo con un valor de impuestos del %.2f porciento es de %.2f %s",iva, valor1, moneda);
        System.out.println();
        System.out.printf("El precio del articulo fuera de impuestos es de %.2f %s",valor0, moneda);




    }
}
