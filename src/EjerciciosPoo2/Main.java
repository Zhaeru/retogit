package EjerciciosPoo2;

public class Main {

    public static void main(String[] args){

        Mago mago = new Mago("Harry Potter");
        Bruja bruja = new Bruja("Hernione");

        mago.lanzarHechizo("Flipendo");
        bruja.lanzarHechizo("Repelo");

        mago.movimiento("delante");
        bruja.movimiento("atras");
    }
}
