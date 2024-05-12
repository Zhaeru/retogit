package EjerciciosPoo1;

public class Libro {

    private String titulo;
    private Autor autor;
    private int precio;

    public Libro() {
    }

    public Libro(String titulo, Autor autor, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println("Titulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nPrecio: " + getPrecio());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
