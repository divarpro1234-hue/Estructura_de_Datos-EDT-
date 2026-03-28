import java.util.Scanner;

public class Estudiante {
	private String nombre;
	private String casa;
	private int anio;
	private String tipoSan;
	private int nivMagia;
	
	public Estudiante(String nombre, String casa, int anio, String tipoSan, int nivMagia) {
		this.nombre = nombre;
		this.casa = casa;
		this.anio = anio;
		this.tipoSan = tipoSan;
		this.nivMagia = nivMagia;
	}
	
	public Estudiante() {
		this.nombre = "";
		this.casa = "";
		this.anio = 0;
		this.tipoSan = "";
		this.nivMagia = 0;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos persona: nombrebre, edad");
		this.nombre = lee.next();
		this.casa = lee.next();
		this.anio = lee.nextInt();
		this.tipoSan = lee.next();
		this.nivMagia = lee.nextInt();
	}

	public void mostrar() {
		System.out.println();
		System.out.println("nombre : " + this.nombre);
		System.out.println("casa: " + this.casa);
		System.out.println("anio: " + this.anio);
		System.out.println("tipo de sangre: " + tipoSan);
		System.out.println("nivel de magia: " + nivMagia);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCasa() {
		return casa;
	}

	public void setCasa(String casa) {
		this.casa = casa;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getTipoSan() {
		return tipoSan;
	}

	public void setTipoSan(String tipoSan) {
		this.tipoSan = tipoSan;
	}

	public int getNivMagia() {
		return nivMagia;
	}

	public void setNivMagia(int nivMagia) {
		this.nivMagia = nivMagia;
	}
}
