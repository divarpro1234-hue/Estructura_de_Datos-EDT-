import java.util.Scanner;

public class Admin {
	private String nombre;
	private String nroCel;
	
	public Admin(String nombre, String nroCel) {
		this.nombre = nombre;
		this.nroCel = nroCel;
	}
	public Admin() {
		this.nombre = "";
		this.nroCel = "";
	}
	public void mostrar() {
		System.out.println("nombreAdmin: " + this.nombre);
		System.out.println("nroCel: " + this.nroCel);
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.nombre = lee.next();
		this.nroCel = lee.next();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNroCel() {
		return nroCel;
	}
	public void setNroCel(String nroCel) {
		this.nroCel = nroCel;
	}
}