//Lic. Marcelo Aruquipa
import java.util.Scanner;

public class Libro {
	private String titulo;
	private int cantEjem;
	Scanner lee = new Scanner(System.in);
	
	public Libro() {
		this.titulo = "";
		this.cantEjem = 0;
	}

	public Libro(String titulo, int cantEjem) {
		this.titulo = titulo;
		this.cantEjem = cantEjem;
	}
	
	public void leer() {
		System.out.println("Ingrese titulo");
		this.titulo = lee.next();
		System.out.println("Ingrese cantEjem");
		this.cantEjem = lee.nextInt();
	}
	
	public void mostrar() {
		System.out.println("titulo = " + this.titulo);
		System.out.println("cantidad Ejemplares = " + this.cantEjem);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getCantEjem() {
		return cantEjem;
	}

	public void setCantEjem(int cantEjem) {
		this.cantEjem = cantEjem;
	}

	public Scanner getLee() {
		return lee;
	}

	public void setLee(Scanner lee) {
		this.lee = lee;
	}
	
}
