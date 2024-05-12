package EjerciciosPoo3;

public class Hobbit extends Personaje{



    private final String raza= "Hobbit";

    public Hobbit(String nombre) {
        super(nombre,"Hobbit");
    }
    @Override
    String habilidadEspecial() {
        return "Esconderse.";
    }


    public String getRaza() {
        return raza;
    }
}
