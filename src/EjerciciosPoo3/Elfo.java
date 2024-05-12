package EjerciciosPoo3;

public class Elfo extends Personaje{

    private final String raza= "Elfo";
    public Elfo(String nombre) {
        super(nombre,"Elfo");
    }
    @Override
    String habilidadEspecial() {
        return "Arco.";
    }


    public String getRaza() {
        return raza;
    }
}
