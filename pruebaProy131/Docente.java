//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Docente {
	private String nombre;
	private String ci;
	private String especialidad;
	
	public Docente(String nombre, String ci, String especialidad) {
		this.nombre = nombre;
		this.ci = ci;
		this.especialidad = especialidad;
	}
	public Docente() {
		this.nombre = "";
		this.ci = "";
		this.especialidad = "";
	}
	public void mostrar() {
		System.out.println();
		System.out.println("nombre: " + this.nombre);
		System.out.println("ci: " + this.ci);
		System.out.println("especialidad: " + this.especialidad);
	
	}
//	public void leer() {
//		Scanner lee = new Scanner(System.in);
//		this.nombre = lee.nextInt();
//		this.ci = lee.next();
//	}
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
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
}
