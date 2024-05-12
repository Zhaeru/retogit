package EjerciciosPoo;

public class Cuenta {

    private String nombre;
    private String cuenta;
    private double interes;
    private double saldo;


    //Constructor por defecto (vacio)

    public Cuenta(){

    }

    //Constructor con parametros

    public  Cuenta(String nombre, String cuenta, double interes, double saldo){

        this.nombre=nombre;
        this.cuenta=cuenta;
        this.interes=interes;
        this.saldo=saldo;
    }

    //Constructor Copia

    public Cuenta(Cuenta c){
        nombre= c.nombre;
        cuenta=c.cuenta;
        interes=c.interes;
        saldo=c.saldo;

    }
    //Metodo ingresar
    public boolean ingresar(double numero){
        boolean ingresar = true;
        if(numero>0){
            this.saldo=this.saldo+numero;

        }else{
            ingresar=false;
        }
        return ingresar;

    }
    //Metodo retirar
    public boolean retirar (double numero){
        boolean retirar= true;
        if(numero>0 || this.saldo>=numero){
            this.saldo=this.saldo-numero;
        }else{
            retirar=false;
        }
        return retirar;
    }
    //Metodo Transferencia
    public boolean transferencia(Cuenta cDestino,int num){
        boolean transferencia= true;
        if(num>0 && saldo>=num){
            saldo=saldo-num;
            cDestino.saldo=cDestino.saldo+num;
        }else{
            transferencia=false;
        }
        return transferencia;
    }

    //Metodos Getters

    public String getNombre(){
        return this.nombre;
    }
    public String getCuenta(){
        return this.cuenta;
    }
    public double getInteres(){
        return this.interes;
    }
    public double getSaldo(){
        return this.saldo;
    }

    //Metodos Setters

    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void setCuenta(String cuenta){
        this.cuenta= cuenta;
    }
    public void setInteres(double interes){
        this.interes= interes;
    }
    public void setSaldo(double saldo){
        this.saldo= saldo;
    }

    public String toString(){
        return (this.nombre+" "+this.cuenta+" "+this.interes+" "+this.cuenta);
    }
}
