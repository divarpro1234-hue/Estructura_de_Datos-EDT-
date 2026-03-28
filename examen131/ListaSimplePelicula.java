public class ListaSimplePelicula {
    private NodoPelicula p;

    public ListaSimplePelicula() {
        p = null;
    }

    public NodoPelicula getP() {
        return p;
    }

    public void adiFinal(Pelicula x) {
        NodoPelicula nuevo = new NodoPelicula(x);
        if (p == null)
            p = nuevo;
        else {
            NodoPelicula q = p;
            while (q.sig != null)
                q = q.sig;
            q.sig = nuevo;
        }
    }

    public void adiPrincipio(Pelicula x) {
        NodoPelicula nuevo = new NodoPelicula(x);
        nuevo.sig = p;
        p = nuevo;
    }
}