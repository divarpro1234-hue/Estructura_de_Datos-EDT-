//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Proy {
	private String nom;
	private int edad;
	
	public Proy(String nom, int edad) {
		this.nom = nom;
		this.edad = edad;
	}
	public Proy() {
		this.nom = "";
		this.edad = 0;
	}
	public void mostrar() {
		System.out.println("nombre: " + this.nom);
		System.out.println("edad: " + this.edad);
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

	
}
