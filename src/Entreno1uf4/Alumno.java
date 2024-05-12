package Entreno1uf4;

public class Alumno {

    private Asignatura asignatura1;
    private Asignatura asignatura2;
    private Asignatura asignatura3;

    public Alumno(Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3){

        this.asignatura1=asignatura1;
        this.asignatura2=asignatura2;
        this.asignatura3=asignatura3;
    }

    public Alumno(int  idUno, int idDos, int idTres){
        this.asignatura1= new Asignatura(idUno);
        this.asignatura2= new Asignatura(idDos);
        this.asignatura3= new Asignatura(idTres);

    }

    public Asignatura getAsignatura1(){
        return asignatura1;
    }
    public Asignatura getAsignatura2(){
        return asignatura2;
    }
    public Asignatura getAsignatura3(){
        return asignatura3;
    }


    public String toString(){
        return asignatura1+" "+asignatura2+" "+asignatura3;
    }
}
