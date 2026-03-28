import java.util.Scanner;

public class Mago {
	private String nombre;
	private String nombreHechizoFav;
	
	public Mago(String nombre, String nombreHechizoFav) {
		this.nombre = nombre;
		this.nombreHechizoFav = nombreHechizoFav;
	}
	
	public Mago() {
		this.nombre = "";
		this.nombreHechizoFav = "";
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos de las peliculas: titulo, director, duracion");
		this.nombre = lee.next();
		this.nombreHechizoFav = lee.next();
		
	}

	public void mostrar() {
		System.out.println();
		System.out.println("nombre del mago : " + this.nombre);
		System.out.println("nombre hechizo favorito : " + this.nombreHechizoFav);
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreHechizoFav() {
		return nombreHechizoFav;
	}

	public void setNombreHechizoFav(String nombreHechizoFav) {
		this.nombreHechizoFav = nombreHechizoFav;
	}
}
