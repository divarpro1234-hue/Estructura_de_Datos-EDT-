//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Pais {
	private String nombre;
	private int extencion;
	private String departamento;
	private String continente;
	
	public Pais(String nombre, int extencion, String departamento, String continente) {
		this.nombre = nombre;
		this.extencion = extencion;
		this.departamento = departamento;
		this.continente = continente;
	}
	public Pais() {
		this.nombre = "";
		this.extencion = 0;
		this.departamento = "";
		this.continente = "";
	}
	public void mostrar() {
		System.out.println("nombre: " + this.nombre);
		System.out.println("extencion: " + this.extencion);
		System.out.println("departamento: " + this.departamento);
		System.out.println("continente: " + this.continente);
		System.out.println();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.nombre= lee.next();
		this.extencion= lee.nextInt();
		this.departamento= lee.next();
		this.continente= lee.next();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getExtencion() {
		return extencion;
	}
	public void setExtencion(int extencion) {
		this.extencion = extencion;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getContinente() {
		return continente;
	}
	public void setContinente(String continente) {
		this.continente = continente;
	}
	
	
}
