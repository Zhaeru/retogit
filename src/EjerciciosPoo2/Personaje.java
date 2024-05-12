package EjerciciosPoo2;

public abstract class Personaje {

    protected String nombre;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public abstract void movimiento(String zona);

    public String getNombre() {
        return nombre;
    }
}
