import java.util.Scanner;

public class Pelicula {
	private String titulo;
	private String director;
	private double duracion;
	
	public Pelicula(String titulo, String director, double duracion) {
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
	}
	
	public Pelicula() {
		this.titulo = "";
		this.director ="";
		this.duracion = 0.0;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos de las peliculas: titulo, director, duracion");
		this.titulo = lee.next();
		this.director = lee.next();
		this.duracion = lee.nextDouble();
	}

	public void mostrar() {
		System.out.println("Datos de la lista");
		System.out.println("\ntitulo : " + this.titulo);
		System.out.println("director: " + this.director);
		System.out.println("duracion: " + this.duracion);
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
}
