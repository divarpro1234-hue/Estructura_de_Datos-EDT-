import java.util.Scanner;

public class Materia {
	private String nombre;
	private String codigo;
	
	public Materia(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}
	public Materia() {
		this.nombre = "";
		this.codigo = "";
	}
	public void mostrar() {
		System.out.println();
		System.out.println("nombre: " + this.nombre);
		System.out.println("codigo: " + this.codigo);
	}
//	public void leer() {
//		Scanner lee = new Scanner(System.in);
//		this.nombre = lee.next();
//	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
