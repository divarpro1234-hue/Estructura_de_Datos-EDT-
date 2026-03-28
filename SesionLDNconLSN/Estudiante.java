import java.util.Scanner;

public class Estudiante {
	private String nombre;
	
	public Estudiante(String nombre) {
		this.nombre = nombre;
	}
	public Estudiante() {
		this.nombre = "";
	}
	public void mostrar() {
		System.out.println("nombre: " + this.nombre);
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.nombre = lee.next();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
