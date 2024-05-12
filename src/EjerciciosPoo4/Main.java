package EjerciciosPoo4;

import java.util.HashMap;

public class Main {

    public static void main(String[] args){

        HashMap<String,CasaNoble> nobles= new HashMap<>();

        CasaNoble casa1= new CasaNoble("Lobo","Wuf","Negro");
        CasaNoble casa2= new CasaNoble("Aguila","Fus","Dorado");



        nobles.put(casa1.getNombreCasa(), casa1);
        nobles.put(casa2.getNombreCasa(), casa2);
        System.out.println("Casas añadidas al mapa:");
        //No enteindo esta parte
        nobles.forEach((nombre, casa) -> System.out.println(casa + "\n"));
        //
        nobles.remove(casa1.getNombreCasa());

        if(nobles.containsKey(casa2.getNombreCasa())){
            System.out.println(casa2.toString());
        }



    }


}
