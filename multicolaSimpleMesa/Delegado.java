

import java.util.Scanner;

public class Delegado {
	private
	String nom;
	int ci;
	Delegado(){
		
	}
	public Delegado(String nom, int ci) {
		super();
		this.nom = nom;
		this.ci = ci;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public void leer() {
		Scanner sc = new  Scanner(System.in);
		System.out.println("NOMBRE: ");
		nom=sc.next();
		System.out.println("CI: ");
		ci=sc.nextInt();
	}
	public void mostrar() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Delegado [nom=" + nom + ", ci=" + ci + "]";
	}
}
