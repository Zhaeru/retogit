package Santa1;

public class Centralita {

    private int costeAcumulado;

    public Centralita(){
        costeAcumulado=0;
    }

    public void agregarLocal(LlamadaLocal call){
        costeAcumulado=costeAcumulado+(int)call.getCoste();
    }
    public void agregarNacional(LlamadaNacional call){
        costeAcumulado=costeAcumulado+(int)call.getCoste();
    }

    public int getCosteAcumulado(){
        return costeAcumulado;
    }
}
