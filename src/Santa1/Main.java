package Santa1;

public class Main {


    public static void main(String[] args){


        Centralita centralita= new Centralita();

        LlamadaLocal algeciras= new LlamadaLocal(123,321,3600);
        LlamadaLocal madrid= new LlamadaLocal(456,654,7800);

        centralita.agregarLocal(algeciras);
        centralita.agregarLocal(madrid);

        LlamadaNacional estonia= new LlamadaNacional(900,1009,3600,'A');
        LlamadaNacional portugal= new LlamadaNacional(400,1004,7800,'b');

        centralita.agregarNacional(estonia);
        centralita.agregarNacional(portugal);

        System.out.println("Coste acumulado:"+centralita.getCosteAcumulado());

        algeciras.mostrarDatos();
        madrid.mostrarDatos();
        estonia.mostrarDatos();
        portugal.mostrarDatos();



    }
}
