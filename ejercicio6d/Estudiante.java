//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Estudiante {
	private String nombre;
	private String ci;
	private int nota;
	
	public Estudiante(String nombre, String ci, int nota) {
		this.nombre = nombre;
		this.ci = ci;
		this.nota = nota;
	}
	public Estudiante() {
		this.nombre = "";
		this.ci = "";
		this.nota = 0;
	}
	public void mostrar() {
		System.out.println("nombre: " + this.nombre);
		System.out.println("ci: " + this.ci);
		System.out.println("nota: " + this.nota);
		System.out.println();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.nombre= lee.next();
		this.ci = lee.next();
		this.nota= lee.nextInt();	
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
}
