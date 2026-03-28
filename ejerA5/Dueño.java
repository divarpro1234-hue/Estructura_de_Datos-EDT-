//Lic. Marcelo Aruquipa
import java.util.Scanner;

public class Dueño {
	private String idDueño ;
	private String nombreDueño;
	private String celDueño;
	Scanner lee = new Scanner(System.in);
	
	public Dueño() {
		this.idDueño  = "";
		this.nombreDueño = "";
		this.celDueño = "";
	}

	public Dueño(String idDueño , String nombreDueño, String celDueño) {
		this.idDueño  = idDueño ;
		this.nombreDueño = nombreDueño;
		this.celDueño = celDueño;
	}


	public String getidDueño () {
		return idDueño ;
	}

	public void setidDueño (String idDueño ) {
		this.idDueño  = idDueño ;
	}

	public String getNombreDueño() {
		return nombreDueño;
	}

	public void setNombreDueño(String nombreDueño) {
		this.nombreDueño = nombreDueño;
	}
	public String getCelDueño() {
		return celDueño;
	}

	public void setCelDueño(String celDueño) {
		this.celDueño = celDueño;
	}
	public void leer() {
		System.out.println("Ingrese idDueño ");
		this.idDueño  = lee.next();
		System.out.println("Ingrese nombreDueño");
		this.nombreDueño = lee.next();
		System.out.println("Ingrese el cel del duenio");
		this.nombreDueño = lee.next();
	}
	public void mostrar() {
		System.out.println("\ndatos de los duenios");
		System.out.println("id duenio = " + this.idDueño );
		System.out.println("nombre Dueño = " + this.nombreDueño);
		System.out.println("cel Dueño = " + this.celDueño);
	}
}
