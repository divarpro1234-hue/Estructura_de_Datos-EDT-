import java.util.Scanner;

public class Tecnologia {
	private String nombre;
	private String descripcion;
	
	public Tecnologia(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;	
	}
	
	public Tecnologia() {
		this.nombre = "";
		this.descripcion = "";
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos tecnologia: nombre, edad");
		this.nombre = lee.next();
		this.descripcion = lee.next();
	}

	public void mostrar() {
		
		System.out.println("nombre : " + this.nombre);
		System.out.println("descripcion : " + this.descripcion);
		System.out.println();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
}
