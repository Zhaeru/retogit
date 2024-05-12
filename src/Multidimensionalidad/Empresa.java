package Multidimensionalidad;

public class Empresa {

    private Sucursal[] sucursales;

    public Empresa() {
        this.sucursales = new Sucursal[4];
    }

    public Empresa(Sucursal[] sucursales) {
        this.sucursales = sucursales;
    }

    public Sucursal creacionSucursal(String nombre, double ventas) {
        Articulos libros = new Articulos(35, "Libros", 100);
        Articulos botellas = new Articulos(10, "Botellas", 100);
        Articulos estuches = new Articulos(20, "Estuches", 100);
        Articulos boligrafos = new Articulos(4, "Boligrafos", 100);
        Articulos lapices = new Articulos(2, "Lapices", 100);
        Articulos[] listaArticulos = {libros, botellas, estuches, boligrafos, lapices};
        Sucursal sucursal = new Sucursal(ventas, listaArticulos, nombre);
        System.out.println("Sucursal " + nombre + " creada");
        return sucursal;
    }

    public void totalArticulos() {
        System.out.println("El total de cada articulo actualmente es: ");
        int[] sumatorio = new int[5];
        for (int i = 0; i < sucursales.length; i++) {
            System.out.println("Sumando Sucursal " + sucursales[i].getNombre());
            for (int j = 0; j < sucursales[i].getListaArticulos().length; j++) {
                sumatorio[j] = sucursales[i].getListaArticulos()[j].getStock() + sumatorio[j];

            }
        }
        for (int i = 0; i < sucursales[0].getListaArticulos().length; i++) {
            System.out.println(sucursales[0].getListaArticulos()[i].getNombre() + ": " + sumatorio[i]);
        }
    }

    public void leerArticulosSucursal(Sucursal suc) {
        System.out.println("La lista de articulos de la sucursal " + suc.getNombre() + " es: ");
        for (int i = 0; i < suc.getListaArticulos().length; i++) {
            System.out.println(suc.getListaArticulos()[i] + ": " + suc.getListaArticulos()[i].getStock() + "\n");
        }

    }

    public void leerArticulosConcreto(Sucursal suc, String articulo) {
        boolean encontrado = false;
        for (int i = 0; i < suc.getListaArticulos().length; i++) {
            if (suc.getListaArticulos()[i].getNombre().equalsIgnoreCase(articulo)) {
                System.out.print("La cantidad de " + articulo + " en la sucursal " + suc.getNombre() + " es: ");
                System.out.println(suc.getListaArticulos()[i].getStock());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Articulo no encontrado");
        }

    }

    public void recaudacionSucursal() {
        for (int i = 0; i < sucursales.length; i++) {
            System.out.println(sucursales[i].getNombre() + ": " + sucursales[i].getVentas());
        }
    }

    public void recaudacionTotal() {
        double total = 0;
        for (int i = 0; i < sucursales.length; i++) {
            total = total + sucursales[i].getVentas();
        }
        System.out.println("Total de ventas: " + total);
    }

    public void mejorSucursal() {
        String sucursal = sucursales[0].getNombre();
        for (int i = 1; i < sucursales.length; i++) {
            if (sucursales[i].getVentas() > sucursales[i - 1].getVentas()) {
                sucursal = sucursales[i].getNombre();
            }
        }
        System.out.println("La sucursal que mas ha vendido es: " + sucursal);
    }


    public Sucursal[] getSucursales() {
        return sucursales;
    }

    public void setSucursales(Sucursal[] sucursales) {
        this.sucursales = sucursales;
    }
}
