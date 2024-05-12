package EjerciciosPoo;

public class Contador {

    private int count;


    //Constructor vacio

    public Contador(){

    }

    //Constructor con parametros

    public Contador( int count){
        if(count<0){
            this.count=0;
        }else {
            this.count=count;
        }
    }

    //Constructor copia

    public Contador(Contador c){
        count=c.count;

    }

    //Metodos Getter

    public int getCount(){
        return count;
    }

    //Metodos Setter

    public void setCount(int count) {
        if (count >= 0) {
            this.count = count;
        } else {
            this.count = 0;
        }
    }
    public void incrementar() {
        this.count=this.count+1;
    }
    public void decrementar() {
        this.count=this.count-1;
        if(this.count<0){
            this.count=0;
        }
    }

}

