package Hashmap;

public class Main {

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante(123456, "Pepe");


        RegistroEstudiante registro = new RegistroEstudiante();

        Estudiante e2 = new Estudiante(2, "Lola");

        registro.aniadirEstudiante(e1);
        registro.aniadirEstudiante(e2);

        Estudiante e = registro.buscarEstudiante(2);

        if(e!=null){
            System.out.println("Estudiante encontrado "+ e.getNombre());
        }

        registro.eliminarEstudiante(2);


    }
}
