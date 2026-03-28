//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Conductor {
	private String ci;
	private String nombre;
	private int edad;
	private String catLic;
	
	public Conductor(String ci, String nombre, int edad, String catLic) {
		this.ci = ci;
		this.nombre = nombre;
		this.edad = edad;
		this.catLic = catLic;
	}
	public Conductor() {
		this.ci = "";
		this.nombre = "";
		this.edad = 0;
		this.catLic = "";
	}
	public void mostrar() {
		System.out.println("ci: " + this.ci);
		System.out.println("nombre: " + this.nombre);
		System.out.println("edad: " + this.edad);
		System.out.println("categoria licencia: " + this.catLic);
		System.out.println();
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCatLic() {
		return catLic;
	}
	public void setCatLic(String catLic) {
		this.catLic = catLic;
	}
	
}