import java.util.Scanner;

public class Cancion {
	private String titulo;  //define el dato objeto persona
	private String nomArt;
	private String genero;
		
	public Cancion(String titulo, String nomArt, String genero){
		this.titulo = titulo;
		this.nomArt = nomArt;
		this.genero = genero;
	}
	public Cancion() {
		this.titulo = "";
		this.nomArt= "";
		this.genero = "";
	}
	public String toString() {
		return "Artista [titulo=" + titulo + ", nomArt=" + nomArt + ", genero=" + genero + "]";
	}
	
	public void mostrar() {
		System.out.println("\ntitulo : " + this.titulo);
		System.out.println("\nnomArt: " + this.nomArt);
		System.out.println("\ngenero: " + this.genero);
		
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos de la cancion:titulo, nomArt, genero");
		this.titulo = lee.next();
		this.nomArt = lee.next();
		this.genero = lee.next();
				
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getNomArt() {
		return nomArt;
	}

	public void setNomArt(String nomArt) {
		this.nomArt = nomArt;
	}
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

		
	}