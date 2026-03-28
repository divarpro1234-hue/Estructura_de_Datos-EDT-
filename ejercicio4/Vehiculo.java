import java.util.Scanner;

public class Vehiculo {
	private String modelo;
	private String fabricante;
	private String tipo;
	private Conductor nombreCon;
	
	public Vehiculo(String modelo, String fabricante, String tipo, Conductor nombreCon) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.tipo = tipo;
		this.nombreCon = nombreCon;
	}
	
	public Vehiculo(Conductor nombreCon) {
		this.modelo = "";
		this.fabricante = "";
		this.tipo = "";
		this.nombreCon = nombreCon;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos de las peliculas: titulo, director, duracion");
		this.modelo = lee.next();
		this.fabricante = lee.next();
		this.tipo = lee.next();
		
	}

	public void mostrar() {
		System.out.println("\nDatos de la lista");
		System.out.println("modelo : " + this.modelo);
		System.out.println("fabricante: " + this.fabricante);
		System.out.println("tipo: " + this.tipo);
		nombreCon.mostrar();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Conductor getNombreCon() {
		return nombreCon;
	}

	public void setNombreCon(Conductor nombreCon) {
		this.nombreCon = nombreCon;
	}
	
	
	
}
