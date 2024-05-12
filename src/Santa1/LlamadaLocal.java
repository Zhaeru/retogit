package Santa1;

public class LlamadaLocal {


    private long numeroOrigen;
    private long numeroDestino;
    protected double coste;
    private double duracion;

    public LlamadaLocal(long numeroOrigen, long numeroDestino, double duracion) {
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        coste=(0.5)+duracion*0.15;
        this.duracion = duracion;
    }

    public void mostrarDatos(){
        System.out.println("Numero de Origen: "+numeroOrigen);
        System.out.println("Numero de Destino: "+numeroDestino);
        System.out.println("Duracion:"+duracion);
        System.out.println("Coste de la llamada"+coste);

    }

    public long getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(long numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public long getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(long numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste() {
        coste=(0.5)+duracion*0.15;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
