public class Sala {
    private String nombre;
    private int nroSala;
    private ListaSimplePelicula peliculas;

    public Sala(String nombre, int nroSala) {
        this.nombre = nombre;
        this.nroSala = nroSala;
        this.peliculas = new ListaSimplePelicula();
    }

    public String getNombre() { return nombre; }
    public int getNroSala() { return nroSala; }
    public ListaSimplePelicula getPeliculas() { return peliculas; }
}