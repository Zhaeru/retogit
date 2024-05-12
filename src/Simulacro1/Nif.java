package Simulacro1;

public class Nif {

    private int numero;
    private String letra;

    public Nif() {

    }

    public Nif(int numero) {
        this.numero = numero;
        letra=calcularLetra(numero);
    }
    public void leer(int numero){
        System.out.println("La letra de su DNI es "+calcularLetra(numero));
    }

    private String calcularLetra(int numero) {
        int opcion;
        opcion = numero % 23;
        switch (opcion) {
            case 0:
                letra = "T";
                break;
            case 1:
                letra = "R";
                break;
            case 2:
                letra = "W";
                break;
            case 3:
                letra = "A";
                break;
            case 4:
                letra = "G";
                break;
            case 5:
                letra = "M";
                break;
            case 6:
                letra = "Y";
                break;
            case 7:
                letra = "F";
                break;
            case 8:
                letra = "P";
                break;
            case 9:
                letra = "D";
                break;
            case 10:
                letra = "X";
                break;
            case 11:
                letra = "B";
                break;
            case 12:
                letra = "N";
                break;
            case 13:
                letra = "J";
                break;
            case 14:
                letra = "Z";
                break;
            case 15:
                letra = "S";
                break;
            case 16:
                letra = "Q";
                break;
            case 17:
                letra = "V";
                break;
            case 18:
                letra = "H";
                break;
            case 19:
                letra = "L";
                break;
            case 20:
                letra = "C";
                break;
            case 21:
                letra = "K";
                break;
            case 22:
                letra = "E";
                break;


        }
        return letra;
    }

    public String toString() {
    StringBuilder builder= new StringBuilder();
    builder.append(numero);
    builder.append("-");
    builder.append(letra);

        return builder.toString();
    }

    public int getNumero() {
        return numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
}
