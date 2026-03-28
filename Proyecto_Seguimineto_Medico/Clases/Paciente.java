package Clases;
//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Paciente {
	private String id_paciente;
	private String nombre;
	private int edad;
	private String ci;
	
	public Paciente(String id_paciente, String nombre, int edad, String ci) {
		this.id_paciente = id_paciente;
		this.nombre = nombre;
		this.edad = edad;
		this.ci = ci;
	}
	public Paciente() {
		this.id_paciente = "";
		this.nombre = "";
		this.edad = 0;
		this.ci = "";
	}
	public void mostrar() {
		System.out.println("id_paciente: " + this.id_paciente);
		System.out.println("nombre: " + this.nombre);
		System.out.println("edad: " + this.edad);
		System.out.println("ci: " + this.ci);
		System.out.println();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.id_paciente = lee.next();
	}
	public String getId_paciente() {
		return id_paciente;
	}
	public void setId_paciente(String id_paciente) {
		this.id_paciente = id_paciente;
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
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	
}