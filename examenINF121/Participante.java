import java.util.Scanner;

public class Participante {
	private String nombre;
	private String semestre;
	
	public Participante(String nombre, String semestre) {
		this.nombre = nombre;
		this.semestre = semestre;
	}
	
	public Participante() {
		this.nombre = "";
		this.semestre = "";
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos de las peliculas: titulo, director, duracion");
		this.nombre = lee.next();
		this.semestre = lee.next();
	}

	public void mostrar() {
		System.out.println();
		System.out.println("nombre : " + this.nombre);
		System.out.println("semestre: " + this.semestre);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
}
