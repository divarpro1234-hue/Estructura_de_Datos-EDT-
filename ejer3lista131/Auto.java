import java.util.Scanner;

public class Auto {
	private String nombre;
	private String modelo;
	private int velMax;
	private String categoria;
	private int numVictoria;
	
	public Auto(String nombre, String modelo, int velMax, String categoria, int numVictoria) {
		this.nombre = nombre;
		this.modelo = modelo;
		this.velMax = velMax;
		this.categoria = categoria;
		this.numVictoria = numVictoria;
	}
	
	public Auto() {
		this.nombre = "";
		this.modelo = "";
		this.velMax = 0;
		this.categoria = "";
		this.numVictoria = 0;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos persona: nombrebre, edad");
		this.nombre = lee.next();
		this.modelo = lee.next();
		this.velMax = lee.nextInt();
		this.categoria = lee.next();
		this.numVictoria = lee.nextInt();
	}

	public void mostrar() {
		System.out.println();
		System.out.println("nombre : " + this.nombre);
		System.out.println("modelo: " + this.modelo);
		System.out.println("velocidad Maxima: " + this.velMax);
		System.out.println("categoria: " + categoria);
		System.out.println("numero de victorias: " + numVictoria);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelMax() {
		return velMax;
	}

	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getNumVictoria() {
		return numVictoria;
	}

	public void setNumVictoria(int numVictoria) {
		this.numVictoria = numVictoria;
	}
	
}
