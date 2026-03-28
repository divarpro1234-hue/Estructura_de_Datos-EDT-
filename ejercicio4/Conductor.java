import java.util.Scanner;

public class Conductor {
	private String nombre;
	private int edad;
	
	public Conductor(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		
	}
	
	public Conductor() {
		this.nombre = "";
		this.edad = 0;
		
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos del conductor: nombre, edad");
		this.nombre = lee.next();
		this.edad = lee.nextInt();
		
	}

	public void mostrar() {
		System.out.println("datos del conductor");
		System.out.println("nombre : " + this.nombre);
		System.out.println("edad: " + this.edad);
		
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
	
}
