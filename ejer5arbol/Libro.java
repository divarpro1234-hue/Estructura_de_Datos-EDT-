//Lic. Marcelo Aruquipa
import java.util.Scanner;

public class Libro {
	private String titulo;
	private String autor;
	Scanner lee = new Scanner(System.in);
	
	public Libro() {
		this.titulo = "";
		this.autor = "";
	}

	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public void leer() {
		System.out.println("Ingrese titulo");
		this.titulo = lee.next();
		System.out.println("Ingrese autor");
		this.autor = lee.next();
	}
	
	public void mostrar() {
		System.out.println("titulo = " + this.titulo);
		System.out.println("autor = " + this.autor);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Scanner getLee() {
		return lee;
	}

	public void setLee(Scanner lee) {
		this.lee = lee;
	}
	
}
