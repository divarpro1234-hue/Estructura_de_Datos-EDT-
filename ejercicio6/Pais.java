import java.util.Scanner;

public class Pais {
	private String pais;
	private Idioma idiomaOf;
	
	public Pais(String pais, Idioma idiomaOf) {
		this.pais = pais;
		this.idiomaOf = idiomaOf;
	}
	
	public Pais(Idioma idiomaOf) {
		this.pais = "";
		this.idiomaOf = idiomaOf;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos de las peliculas: titulo, director, duracion");
		this.pais = lee.next();
		
	}

	public void mostrar() {
		System.out.println("\nDatos de la lista pais");
		System.out.println("pais : " + this.pais);
		idiomaOf.mostrar();
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Idioma getIdiomaOf() {
		return idiomaOf;
	}

	public void setIdiomaOf(Idioma idiomaOf) {
		this.idiomaOf = idiomaOf;
	}
}
