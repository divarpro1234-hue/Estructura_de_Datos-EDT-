public class NodoColaPelicula {
    Pelicula peli;
    NodoColaPelicula sig;

    public NodoColaPelicula(Pelicula peli) {
        this.peli = peli;
        this.sig = null;
    }
}