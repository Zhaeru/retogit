package Santa2;

public class Cd {

    private Cancion[] playlist;


    public Cd() {
        this.playlist= new Cancion[10];
    }

    public int numeroCanciones() {
        return playlist.length;
    }

    public Cancion dameCancion(int posicion) {
        if (posicion <= 0 || posicion > playlist.length) {
            System.out.println("Error.");
        }
        return playlist[posicion - 1];
    }

    public void grabaCancion(int posicion, Cancion cancion) {
        playlist[posicion] = cancion;
        System.out.println(cancion + "- Introducida con exito.");
    }

    public void agrega(Cancion cancion) {
        boolean cancionAgregada = false;
        for (int i = 0; i < playlist.length && !cancionAgregada; i++) {
            if (playlist[i] == null) {
                playlist[i] = cancion;
                cancionAgregada = true;
            }
        }
    }
    public void elimina(int posicion){
        playlist[posicion]= null;
    }

}




