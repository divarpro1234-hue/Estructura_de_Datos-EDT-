public class Pelicula {
    private String nombre, genero, horario;
    private int precio, nroEspectadores;

    public Pelicula(String nombre, String genero, int precio, int nroEspectadores, String horario) {
        this.nombre = nombre;
        this.genero = genero;
        this.precio = precio;
        this.nroEspectadores = nroEspectadores;
        this.horario = horario;
    }

    public String getNombre() { return nombre; }
    public String getGenero() { return genero; }
    public int getPrecio() { return precio; }
    public int getNroEspectadores() { return nroEspectadores; }
    public String getHorario() { return horario; }

    public int calcularMonto() {
        return precio * nroEspectadores;
    }
}