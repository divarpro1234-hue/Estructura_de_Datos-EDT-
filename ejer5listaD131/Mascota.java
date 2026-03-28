//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Mascota {
	private String nombre;
	private String ciDuenio;
	private String numCelDue;
	private int costoCorte;
	private int edad;
	
	public Mascota(String nombre, String ciDuenio, String numCelDue, int costoCorte, int edad) {
		this.nombre = nombre;
		this.ciDuenio = ciDuenio;
		this.numCelDue = numCelDue;
		this.costoCorte = costoCorte;
		this.edad = edad;
	}
	public Mascota() {
		this.nombre = "";
		this.ciDuenio = "";
		this.numCelDue = "";
		this.costoCorte = 0;
		this.edad = 0;
	}
	public void mostrar() {
		System.out.println("nombre: " + this.nombre);
		System.out.println("ci duenio: " + this.ciDuenio);
		System.out.println("numero celular duenio: " + this.numCelDue);
		System.out.println("costo de corte: " + this.costoCorte);
		System.out.println("edad: " + this.edad);
		System.out.println();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.nombre = lee.next();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiDuenio() {
		return ciDuenio;
	}
	public void setCiDuenio(String ciDuenio) {
		this.ciDuenio = ciDuenio;
	}
	public String getNumCelDue() {
		return numCelDue;
	}
	public void setNumCelDue(String numCelDue) {
		this.numCelDue = numCelDue;
	}
	public int getCostoCorte() {
		return costoCorte;
	}
	public void setCostoCorte(int costoCorte) {
		this.costoCorte = costoCorte;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}