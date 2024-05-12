package EjerciciosPoo3;

public abstract class Personaje {

    protected String nombre;
    protected String raza;

    public Personaje(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    abstract String habilidadEspecial();

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                habilidadEspecial()+
                '}';
    }
}
