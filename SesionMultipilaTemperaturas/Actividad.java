

import java.util.Scanner;

public class Actividad {
	private
	String nomAct;
	String dia,IdZona;
	public
	Actividad() {
		
	}
	public Actividad(String idZona, String dia, String nomAct) {
		super();
		this.IdZona = idZona;
		this.dia = dia;
		this.nomAct = nomAct;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID Act: ");
		IdZona=sc.next();
		System.out.println("dia: ");
		dia=sc.next();
		System.out.println("nomAct: ");
		nomAct=sc.next();
	}
	void mostrar() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "nomAct [IdEspacioDep=" + IdZona + ", dia=" + dia + ", nomAct=" + nomAct + "]";
	}
	public String getIdZona() {
		return IdZona;
	}
	public void setIdZona(String idZona) {
		IdZona = idZona;
	}
	public String getdia() {
		return dia;
	}
	public void setdia(String dia) {
		this.dia = dia;
	}
	public String getnomAct() {
		return nomAct;
	}
	public void setnomAct(String nomAct) {
		this.nomAct = nomAct;
	}
	
}
