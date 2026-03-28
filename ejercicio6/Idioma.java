import java.util.Scanner;

public class Idioma {
	private String nombre;
	private int nroHablante;
	
	public Idioma(String nombre, int nroHablante) {
		this.nombre = nombre;
		this.nroHablante = nroHablante;
		
	}
	
	public Idioma() {
		this.nombre = "";
		this.nroHablante = 0;
		
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos del idioma: nombre, nroHablante");
		this.nombre = lee.next();
		this.nroHablante = lee.nextInt();
		
	}

	public void mostrar() {
		System.out.println("Datos Idioma");
		System.out.println("nombre idioma: " + this.nombre);
		System.out.println("nro Hablantes: " + this.nroHablante);
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNroHablante() {
		return nroHablante;
	}

	public void setNroHablante(int nroHablante) {
		this.nroHablante = nroHablante;
	}
	
}
