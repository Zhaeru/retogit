package proyectodaw;

import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args){

        //Variables
        float sueldobruto;
        float pagas;
        float sueldobrutoA;
        float sueldobrutoM;
        float sueldonetoA;
        float sueldonetoM;

        Scanner scn= new Scanner(System.in);

        //Pedir por consola

        System.out.println("Introduzca su sueldo bruto anual");
        sueldobruto= scn.nextFloat();
        System.out.println("A continuación, introduzca el numero de pagas");
        pagas= scn.nextFloat();

        //Calculos = sueldo bruto y neto anual y mensual.

        sueldobrutoM = sueldobruto/pagas;
        sueldobrutoA = sueldobrutoM*12;
        sueldonetoA = sueldobrutoA - (sueldobrutoA*15/100);
        sueldonetoM = sueldonetoA/12;

        //Mostrar por consola

        System.out.printf("El valor de su sueldo anual bruto es de %.2f y mensualmente es %.2f . Con un IRP del 15 porciento, su sueldo anual neto seria de %.2f y mensualmente seria de %.2f .", sueldobrutoA,sueldobrutoM,sueldonetoA,sueldonetoM);

    }
}
