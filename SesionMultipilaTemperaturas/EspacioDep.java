

import java.util.Scanner;

public class EspacioDep {
	private
	String nom,IDZona;
	public
	EspacioDep() {
		
	}
	public EspacioDep(String iDZona, String nom) {
		super();
		this.IDZona = iDZona;
		this.nom = nom;
	}
	void llenar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID EspacioDep: ");
		IDZona=sc.next();
		System.out.println("NOMBRE: ");
		nom=sc.next();
	}
	void mostrar() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "EspacioDep [IDEspacioDep=" + IDZona + ", nombre=" + nom + "]";
	}
	public String getIDZona() {
		return IDZona;
	}
	public void setIDZona(String iDZona) {
		IDZona = iDZona;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	

}
