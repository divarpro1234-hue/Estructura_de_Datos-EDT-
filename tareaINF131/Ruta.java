//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Ruta {
	private String origen;
	private String destino;
	private double precio;
	
	public Ruta(String origen, String destino, double precio) {
		this.origen = origen;
		this.destino = destino;
		this.precio = precio;
	}
	public Ruta() {
		this.origen = "";
		this.destino = "";
		this.precio = 0;
	}
	public void mostrar() {
		System.out.println("origen: " + this.origen);
		System.out.println("destino: " + this.destino);
		System.out.println("precio: " + this.precio);
		System.out.println();
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}