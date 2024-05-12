package EjerciciosPoo1;

public class Main {

    public static void main(String[] args){

        Autor autor1= new Autor("Pepe","Gmail",'M');
        Libro libro1= new Libro("Vientos del aberno",autor1,30);

        libro1.mostrarDetalles();


    }
}
