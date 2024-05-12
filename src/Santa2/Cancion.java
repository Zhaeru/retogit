package Santa2;

public class Cancion {

    private String titulo;
    private String artista;

    public Cancion(){}

    public Cancion(String titulo, String artista){

        this.titulo=titulo;
        this.artista=artista;
    }

    public String toString(){
        return titulo+ " - "+artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}
