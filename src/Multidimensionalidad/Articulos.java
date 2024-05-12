package Multidimensionalidad;

public class Articulos {

    private double precio;
    private String nombre;
    private int stock;

    public Articulos(double precio, String nombre, int stock) {
        this.precio = precio;
        this.nombre = nombre;
        this.stock= stock;
    }
    public Articulos(String nombre){
        this.nombre= nombre;
    }

    @Override
    public String toString() {
        return "Articulos{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
