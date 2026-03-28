//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Pasajero {
	private String ci;
	private String nombre;
	private int edad;
	private String sexo;
	private String numTele;
	
	public Pasajero(String ci, String nombre, int edad, String sexo, String numTele) {
		this.ci = ci;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.numTele = numTele;
	}
	public Pasajero() {
		this.ci = "";
		this.nombre = "";
		this.edad = 0;
		this.sexo = "";
		this.numTele = "";
	}
	public void mostrar() {
		System.out.println("carnet de identidad: " + this.ci);
		System.out.println("nombre: " + this.nombre);
		System.out.println("edad: " + this.edad);
		System.out.println("sexo: " + this.sexo);
		System.out.println("numero de telefono: " + this.numTele);
		System.out.println();
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNumTele() {
		return numTele;
	}
	public void setNumTele(String numTele) {
		this.numTele = numTele;
	}
	
}
