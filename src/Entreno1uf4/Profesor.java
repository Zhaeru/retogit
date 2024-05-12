package Entreno1uf4;

public class Profesor {

    public void ponerNotas(Alumno alumno ){

        Asignatura a1 = alumno.getAsignatura1();
        a1.setNota(Math.random()*11);
        Asignatura a2 = alumno.getAsignatura2();
        a2.setNota(Math.random()*11);
        Asignatura a3 = alumno.getAsignatura3();
        a3.setNota(Math.random()*11);

    }
    public double calcularMedia(Alumno alumno){
        double media;
        /*Asignatura a1 = alumno.getAsignatura1();

        Asignatura a2 = alumno.getAsignatura2();

        Asignatura a3 = alumno.getAsignatura3();*/
        media= (alumno.getAsignatura1().getNota() + alumno.getAsignatura2().getNota() + alumno.getAsignatura3().getNota())/3;

        return media;
    }
}
