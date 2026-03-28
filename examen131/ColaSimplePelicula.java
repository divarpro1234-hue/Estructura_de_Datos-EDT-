public class ColaSimplePelicula {
    NodoColaPelicula ini, fin;

    public ColaSimplePelicula() {
        ini = fin = null;
    }

    public void insertar(Pelicula peli) {
        NodoColaPelicula nuevo = new NodoColaPelicula(peli);
        if (ini == null)
            ini = fin = nuevo;
        else {
            fin.sig = nuevo;
            fin = nuevo;
        }
    }

    public void mostrar() {
        NodoColaPelicula aux = ini;
        while (aux != null) {
            Pelicula p = aux.peli;
            System.out.println("Película: " + p.getNombre() + " - Género: " + p.getGenero());
            aux = aux.sig;
        }
    }
}