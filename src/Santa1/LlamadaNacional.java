package Santa1;

public class LlamadaNacional extends LlamadaLocal{

    private char destino;


    public LlamadaNacional(long numeroOrigen, long numeroDestino, double duracion,char destino) {
        super(numeroOrigen, numeroDestino, duracion);
        this.destino=destino;
        if(destino=='A' || destino=='a'){
            coste=(0.70)+duracion*0.40;
        }else if(destino=='B' || destino=='b'){
            coste=(0.70)+duracion*0.50;
        }else if(destino=='C' || destino=='c'){
            coste=(0.70)+duracion*0.60;
        }

    }

    public void calcularCoste(){
        if(destino=='A' || destino=='a'){
            coste=(0.70)+getDuracion()*0.40;
        }else if(destino=='B' || destino=='b'){
            coste=(0.70)+getDuracion()*0.50;
        }else if(destino=='C' || destino=='c'){
            coste=(0.70)+getDuracion()*0.60;
        }
    }

    public char getDestino() {
        return destino;
    }

    public void setDestino(char destino) {
        this.destino = destino;
    }


    public void setCoste() {
        if(destino=='A' || destino=='a'){
            coste=(0.70)+getDuracion()*0.40;
        }else if(destino=='B' || destino=='b'){
            coste=(0.70)+getDuracion()*0.50;
        }else if(destino=='C' || destino=='c'){
            coste=(0.70)+getDuracion()*0.60;
        }

    }
}
