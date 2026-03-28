import java.util.Scanner;

public class Ingrediente {
	private String nombre;
	private String id_ingre;
	private int costo;
	
	public Ingrediente(String nombre, String id_ingre,int costo) {
		this.nombre = nombre;
		this.id_ingre = id_ingre;
		this.costo = costo;
		
	}
	
	public Ingrediente() {
		this.nombre = "";
		this.id_ingre = "";
		this.costo = 0;
		
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos del ingrediente: nombre, costo");
		this.nombre = lee.next();
		this.id_ingre = lee.next();
		this.costo = lee.nextInt();
		
	}

	public void mostrar() {
		System.out.println();
		System.out.println("nombre del ingrediente: " + this.nombre);
		System.out.println("id ingrediente: " + this.id_ingre);
		System.out.println("costo ingrediente: " + this.costo);
		System.out.println();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getId_ingre() {
		return id_ingre;
	}

	public void setId_ingre(String id_ingre) {
		this.id_ingre = id_ingre;
	}
	
	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	
	
}
