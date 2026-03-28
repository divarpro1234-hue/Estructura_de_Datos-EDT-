//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Departamento {
	private int id;
	private String nombre;
	private int poblacion;
	private String gobernador;
	private int pib;
	

	public Departamento(int id,String nombre, int poblacion, String gobernador, int pib) {
		this.id =id;
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.gobernador = gobernador;
		this.pib = pib;
	
	}
	public Departamento() {
		this.id= 0;
		this.nombre = "";
		this.poblacion = 0;
		this.gobernador = "";
		this.pib = 0;
	}
	public void mostrar() {
		
		System.out.println("id: " + this.id);
		System.out.println("nombre: " + this.nombre);
		System.out.println("poblacion: " + this.poblacion);
		System.out.println("gobernador: " + this.gobernador);
		System.out.println("producto interno bruto: " + this.pib);
		System.out.println();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.id= lee.nextInt();
		this.nombre= lee.next();
		this.poblacion= lee.nextInt();
		this.gobernador= lee.next();
		this.pib= lee.nextInt();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	public String getGobernador() {
		return gobernador;
	}
	public void setGobernador(String gobernador) {
		this.gobernador = gobernador;
	}
	public int getPib() {
		return pib;
	}
	public void setPib(int pib) {
		this.pib = pib;
	}
	
}
