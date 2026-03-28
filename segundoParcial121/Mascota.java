//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Mascota {
	private String nomMas;
	private String tipo;
	private int edad;
	
	public Mascota(String nomMas, String tipo, int edad) {
		this.tipo = tipo;
		this.nomMas = nomMas;
		this.edad =edad;
	}
	public Mascota() {
		this.tipo = "";
		this.nomMas = "";
		this.edad = 0;
	}
	public void mostrar() {
		
		System.out.println("nombre mascota: " + this.nomMas);
		System.out.println("tipo: " + this.tipo);
		System.out.println("edad: " + this.edad);
		System.out.println();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.tipo = lee.next();
		this.nomMas= lee.next();
		this.edad = lee.nextInt();
	}
	public String getnomMas() {
		return nomMas;
	}
	public void setnomMas(String nomMas) {
		this.nomMas = nomMas;
	}
	public String gettipo() {
		return tipo;
	}
	public void settipo(String tipo) {
		this.tipo = tipo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
