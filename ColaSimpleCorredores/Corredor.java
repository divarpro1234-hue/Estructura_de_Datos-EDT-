public class Corredor {
    private String numeroCorredor;
    private String nombre;
    private int carrerasGanadas;

    public Corredor(String numeroCorredor, String nombre, int carrerasGanadas) {
        this.numeroCorredor = numeroCorredor;
        this.nombre = nombre;
        this.carrerasGanadas = carrerasGanadas;
    }

    public String getnumeroCorredor() {
        return numeroCorredor;
    }

    public void setnumeroCorredor(String numeroCorredor) {
        this.numeroCorredor = numeroCorredor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public int getCarrerasGanadas() {
        return carrerasGanadas;
    }

    public void setCarrerasGanadas(int CarrerasGanadas) {
        this.carrerasGanadas = CarrerasGanadas;
    }
    
    public void mostrar(){
        System.out.println("numeroCorredor: " + numeroCorredor + " nombre: "+ nombre + " CarrerasGanadas "+ carrerasGanadas);
    }
}
