public class NodoPelicula {
    Pelicula pelicula;
    NodoPelicula sig;

    public NodoPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
        this.sig = null;
    }
}