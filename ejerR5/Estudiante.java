import java.util.Scanner;

public class Estudiante {
	private String pat;
	private String mat;
	private String nombre;
	private int nota;
	
	public Estudiante(String pat, String mat, String nombre, int nota) {
		this.pat = pat;
		this.mat = mat;
		this.nombre = nombre;
		this.nota = nota;
		
	}
	
	public Estudiante() {
		this.pat = "";
		this.mat ="";
		this.nombre = "";
		this.nota = 0;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos de las peliculas: pat, mat, duracion");
		this.pat = lee.next();
		this.mat = lee.next();
		this.nombre = lee.next();
		this.nota = lee.nextInt();
	}

	public void mostrar() {
//		System.out.println("Datos de la lista");
		System.out.println("\npat : " + this.pat);
		System.out.println("mat: " + this.mat);
		System.out.println("nombre: " + this.nombre);
		System.out.println("nota: " + this.nota);
	}
	
	public String getPat() {
		return pat;
	}

	public void setPat(String pat) {
		this.pat = pat;
	}

	public String getMat() {
		return mat;
	}

	public void setMat(String mat) {
		this.mat = mat;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
}
