package EjerciciosPoo3;

import java.util.ArrayList;

public class Aventura {

    public static void main(String[] args){

        ArrayList<Personaje> companiaDelAnillo = new ArrayList<>();

        Hobbit hobbit1= new Hobbit ("Frodo");
        Humano humano1= new Humano("Aragor");
        Elfo elfo1=new Elfo("Legolas");

        aniadirMiembro(companiaDelAnillo,hobbit1);
        aniadirMiembro(companiaDelAnillo,humano1);
        aniadirMiembro(companiaDelAnillo,elfo1);
        quitarMiembro(companiaDelAnillo,elfo1);
        System.out.println("Miembros del Grupo.");
        for (Personaje personaje: companiaDelAnillo) {
            System.out.println(personaje.toString());

        }
        mostrarGrupo(companiaDelAnillo);




    }
    public static void aniadirMiembro(ArrayList lista,Personaje miembro  ){
        lista.add(miembro);
        System.out.println(miembro.toString()+"\n Añadido con exito.");
    }
    public static void quitarMiembro(ArrayList lista,Personaje miembro  ){
        lista.remove(miembro);
        System.out.println(miembro.toString()+"\n Eliminado con exito.");
    }

    public static void mostrarGrupo(ArrayList lista){
        System.out.println("Miembros del Grupo.");
        for (Object personaje: lista) {
            System.out.println(personaje.toString());

        }
    }



}
