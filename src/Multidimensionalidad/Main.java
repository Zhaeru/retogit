package Multidimensionalidad;

public class Main {

    public static void main(String[] args){








        Sucursal[] listaSucursales=new Sucursal[4];

        Empresa acme= new Empresa(listaSucursales);

        Sucursal a= acme.creacionSucursal("a",2500);
        Sucursal b= acme.creacionSucursal("b",1500);
        Sucursal c= acme.creacionSucursal("c",3000);
        Sucursal d= acme.creacionSucursal("d",4000);
        listaSucursales[0]=a;
        listaSucursales[1]=b;
        listaSucursales[2]=c;
        listaSucursales[3]=d;
        System.out.println(" ");

        acme.totalArticulos();
        System.out.println(" ");
        System.out.println("Cambiamos el stock de B de Libros a 50.");
        b.getListaArticulos()[0].setStock(50);
        acme.totalArticulos();
        System.out.println(" ");

        acme.leerArticulosSucursal(a);
        System.out.println(" ");
        acme.leerArticulosConcreto(b,"libros");







    }
}
