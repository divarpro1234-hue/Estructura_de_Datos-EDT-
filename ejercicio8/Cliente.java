import java.util.Scanner;

public class Cliente {
	private String nombre;
	private int nroCompra;
	
	public Cliente(String nombre, int nroCompra) {
		this.nombre = nombre;
		this.nroCompra = nroCompra;
		
	}
	
	public Cliente() {
		this.nombre = "";
		this.nroCompra = 0;
		
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos del idioma: nombre, nroCompra");
		this.nombre = lee.next();
		this.nroCompra = lee.nextInt();
		
	}

	public void mostrar() {
		
		System.out.println("nombre idioma: " + this.nombre);
		System.out.println("nro compras: " + this.nroCompra);
		System.out.println();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNroCompra() {
		return nroCompra;
	}

	public void setNroCompra(int nroCompra) {
		this.nroCompra = nroCompra;
	}
	
}
