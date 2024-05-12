package EjerciciosPoo3;

public class Humano extends Personaje{


    public Humano(String nombre) {
        super(nombre,"Humano");
    }
    @Override
    String habilidadEspecial() {
        return "Aprender rapido.";
    }


    public String getRaza() {
        return raza;
    }
}
