package Entreno1uf4;

public class Asignatura {

    private int id;
    private double nota;


    public Asignatura(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


    public String toString() {
        return id + " " + nota;
    }
}
