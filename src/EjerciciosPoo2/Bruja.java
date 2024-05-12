package EjerciciosPoo2;



public class Bruja extends Personaje implements Magico{


    public Bruja(String nombre) {
        super(nombre);
    }

    @Override
    public void lanzarHechizo(String hechizo) {
        System.out.println(getNombre()+" lanza "+hechizo);
    }

    @Override
    public void movimiento(String zona) {
        System.out.println(getNombre()+" se mueve hacia "+zona);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }
}
