public class Viaje {
    private String codigoAvion;
    private int numeroPasajeros;
    private String piloto;
    private String copiloto;

    public Viaje(String codigoAvion, int numeroPasajeros, String piloto, String copiloto) {
        this.codigoAvion = codigoAvion;
        this.numeroPasajeros = numeroPasajeros;
        this.piloto = piloto;
        this.copiloto = copiloto;
    }

    public String getCodigoAvion() {
        return codigoAvion;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public double calcularIngreso(double costoAvion) {
        return numeroPasajeros * costoAvion;
    }
}