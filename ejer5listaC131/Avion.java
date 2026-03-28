//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Avion {
	private String id;
	private int capCar;
	private String estado;
	private String destino;
	
	public Avion(String id, int capCar, String estado, String destino) {
		this.id = id;
		this.capCar = capCar;
		this.estado = estado;
		this.destino = destino;
	}
	public Avion() {
		this.id = "";
		this.capCar = 0;
		this.estado = "";
		this.destino = "";
	}
	public void mostrar() {
		System.out.println("id: " + this.id);
		System.out.println("capacidad carga: " + this.capCar + "kg");
		System.out.println("estado: " + this.estado);
		System.out.println("destino: " + this.destino);
		System.out.println();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.id = lee.next();
		this.capCar = lee.nextInt();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCapCar() {
		return capCar;
	}
	public void setCapCar(int capCar) 	{
		this.capCar = capCar;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
}
