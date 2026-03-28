import java.util.Scanner;

public class Medalla {
	private String nombre;
	private String disciplina;
	private String medalla;
	private String pais;
	
	public Medalla(String nombre, String disciplina, String medalla, String pais) {
		this.nombre = nombre;
		this.disciplina = disciplina;
		this.medalla = medalla;
		this.pais = pais;
	}
	
	public Medalla() {
		this.nombre = "";
		this.disciplina = "";
		this.medalla = "";
		this.pais = "";
	}
	
//	public void leer() {
//		Scanner lee = new Scanner(System.in);
//		System.out.println("Datos persona: nombrebre, edad");
//		this.nombre = lee.next();
//		this.disciplina = lee.next();
//		this.medalla = lee.nextInt();
//		this.pais = lee.next();
//		this.numVictoria = lee.nextInt();
//	}

	public void mostrar() {
		System.out.println();
		System.out.println("nombre : " + this.nombre);
		System.out.println("disciplina: " + this.disciplina);
		System.out.println("velocidad Maxima: " + this.medalla);
		System.out.println("pais: " + this.pais);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getMedalla() {
		return medalla;
	}

	public void setMedalla(String medalla) {
		this.medalla = medalla;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	
}
