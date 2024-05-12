package Hashmap;
import java.util.HashMap;
public class RegistroEstudiante {

    private HashMap<Integer,Estudiante> registro;


    public RegistroEstudiante(){
        this.registro= new HashMap<>();
    }

    public void aniadirEstudiante(Estudiante estudiante){
        if(registro.containsKey(estudiante.getId())){
            System.out.println("El estudiante con ID"+estudiante.getId()+" ya existe.");
        }else {
            registro.put(estudiante.getId(),estudiante);
            System.out.println("El estudiante "+estudiante.getNombre()+" ha sido añadido.");

        }
    }

    public Estudiante buscarEstudiante(int id){
        Estudiante e1;
        if(registro.containsKey(id)){
            e1= registro.get(id);
        }else{
            System.out.println("Estudiante con id "+ id+ " no esta registrado.");
            e1= null;
        }
        return e1;

    }

    public void eliminarEstudiante(int id){

        if(registro.containsKey(id)){
            registro.remove(id);
            System.out.println("El estudiante ha sido eleiminado.");
        }else{
            System.out.println("El estudiante no se ha podido eliminar porque no esta registrado.");
        }
    }


}
