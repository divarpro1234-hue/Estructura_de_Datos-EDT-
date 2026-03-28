import java.util.Scanner;

public class Ingredientes {
	private String nombre, estado;
	
	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public String getestado() {
		return estado;
	}

	public void setestado(String estado) {
		this.estado = estado;
	}
	
	public Ingredientes(String nombre, String estado) {
		this.nombre = nombre;
		this.estado = estado;
	}
	
	public Ingredientes() {
		this.nombre = "";
		this.estado = "";
	}

	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Servicio...");
		System.out.println("nombre?");
		nombre = sc.nextLine();
		System.out.println("estado?");
		estado = sc.nextLine();
	}
//	void mostrar() {
//		System.out.println("nombre: "+this.nombre+" estado"+this.estado);
//
//	}
	void mostrar() {
		System.out.println("Ingrediente [" + nombre + ", " + estado + "]");
	}

}