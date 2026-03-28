//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Jugador {
	private String nom;
	private int edad;
	private int nivel;
	
	public Jugador(String nom, int edad, int nivel) {
		this.nom = nom;
		this.edad = edad;
		this.nivel = nivel;
	}
	public Jugador() {
		this.nom = "";
		this.edad = 0;
		this.nivel = 0;
	}
	public void mostrar() {
		System.out.println("nombre: " + this.nom);
		System.out.println("edad: " + this.edad);
		System.out.println("nivel: " + this.nivel);
		System.out.println();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.nom = lee.next();
		this.edad = lee.nextInt();
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	
}
