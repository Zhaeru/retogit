package clasesobjetos;

public class Libro {

    //Atributos

    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    //Metodo Constructor con parametros.

    public Libro(String ISBN, String titulo, String autor, int numPaginas){

        this.ISBN = ISBN;
        this.titulo= titulo;
        this.autor = autor;
        this.numPaginas= numPaginas;
    }

    //Metodos getters.

    public String getISBN(){
        return ISBN;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getNumPaginas(){
        return numPaginas;
    }

    //Metodos setters.

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setNumPaginas(int numPaginas){
        this.numPaginas= numPaginas;
    }
    //Metodo calcular numero hojas.

    public void calcularNumeroHojas(Libro l){
        if(l.numPaginas > this.numPaginas){
         System.out.println("El libro 2 tiene mas paginas.");
        }

    }


    //Metodo requerido por el enunciado

    public String toString(){

        return"El libro "+this.titulo+" con ISBN "+this.ISBN+" creado por el autor "+this.autor+" tiene "+this.numPaginas+" paginas.";
    }
}
