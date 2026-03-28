//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Duenio {
	
	private String nombre;
	private int nroMascota;
	
	public Duenio(String nombre, int nroMascota) {
		this.nombre = nombre;
		this.nroMascota = nroMascota;
	}
	public Duenio() {
		
		this.nombre = "";
		this.nroMascota = 0;
	}
	public void mostrar() {
		
		System.out.println("nombre: " + this.nombre);
		System.out.println("numero de mascota: " + this.nroMascota);
		System.out.println();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.nombre= lee.next();
		this.nroMascota = lee.nextInt();

	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNroMascota() {
		return nroMascota;
	}
	public void setNroMascota(int nroMascota) {
		this.nroMascota = nroMascota;
	}
	
	
	
}
