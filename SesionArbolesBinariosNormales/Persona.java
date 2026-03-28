//Lic. Marcelo Aruquipa
import java.util.Scanner;

public class Persona {
	private String nombre;
	private int edad;
	Scanner lee = new Scanner(System.in);
	
	public Persona() {
		this.nombre = "";
		this.edad = 0;
	}

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
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
	public void leer() {
		System.out.println("Ingrese nombre");
		this.nombre = lee.next();
		System.out.println("Ingrese edad");
		this.edad = lee.nextInt();
	}
	public void mostrar() {
		System.out.println("nom = " + this.nombre);
		System.out.println("edad = " + this.edad);
	}
	
}
