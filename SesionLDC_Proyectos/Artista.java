import java.util.Scanner;

public class Artista {
	private String nom;
	private int edad;
	
	public Artista(String nom, int edad) {
		this.nom = nom;
		this.edad = edad;
	}
	
	public Artista() {
		this.nom = "";
		this.edad = 0;
	}
	
	@Override
	public String toString() {
		return "Artista [nom=" + nom + ", edad=" + edad + "]";
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos artista: nombre, edad");
		this.nom = lee.next();
		this.edad = lee.nextInt();
	}

	public void mostrar() {
		System.out.println("\nnombre : " + this.nom);
		System.out.println("\nedad: " + this.edad);
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