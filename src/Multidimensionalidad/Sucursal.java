package Multidimensionalidad;

import java.util.Arrays;

public class Sucursal {

    private double ventas;
    private Articulos[] listaArticulos;
    private String nombre;

    public Sucursal(){
        this.listaArticulos = new Articulos[5];
    }

    public Sucursal(double ventas, Articulos[] listaVenta, String nombre) {
        this.ventas = ventas;
        this.listaArticulos = listaVenta;
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Sucursal{" +
                "ventas=" + ventas +
                ", listaVenta=" + Arrays.toString(listaArticulos) +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public Articulos[] getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(Articulos[] listaArticulos) {
        this.listaArticulos = listaArticulos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
