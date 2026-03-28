//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Persona {
	private String ci;
	private String nombre;
	private String nroCelular;

	

	public Persona(String ci, String nombre, String nroCelular) {
		this.ci = ci;
		this.nombre = nombre;
		this.nroCelular = nroCelular;
	}
	public Persona() {
		this.ci = "";
		this.nombre = "";
		this.nroCelular = "";
	}
	public void mostrar() {
		
		System.out.println("ci: " + this.ci);
		System.out.println("nombre: " + this.nombre);
		System.out.println("numero de celular: " + this.nroCelular);
		System.out.println();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.ci= lee.next();
		this.nombre= lee.next();
		this.nroCelular= lee.next();
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNroCelular() {
		return nroCelular;
	}
	public void setNroCelular(String nroCelular) {
		this.nroCelular = nroCelular;
	}
	
	
	
}
