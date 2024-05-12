package clasesobjetos;

public class Main {

    public static void main (String[] args){

    Libro libro1 = new Libro("467-765", "Don Quijote","Cervantes",600);
    Libro libro2 = new Libro("678-556","El señor de los anillos","Tolquien",400);

    System.out.println(libro1);
    System.out.println(libro2);

    libro1.calcularNumeroHojas(libro2);







    }
}
