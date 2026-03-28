import java.util.Scanner;

public class Venta {
	private String prenda;
	private String talla;
	private int precio;
	
	public Venta(String prenda, String talla, int precio) {
		this.prenda = prenda;
		this.talla = talla;
		this.precio = precio;
	}
	
	public Venta() {
		this.prenda = "";
		this.talla = "";
		this.precio = 0;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos de las peliculas: titulo, director, duracion");
		this.prenda = lee.next();
		this.talla = lee.next();
		this.precio = lee.nextInt();
		
	}

	public void mostrar() {
		
		System.out.println("prenda : " + this.prenda);
		System.out.println("talla : " + this.talla);
		System.out.println("precio : " + this.precio);
		System.out.println();
	}

	public String getPrenda() {
		return prenda;
	}

	public void setPrenda(String prenda) {
		this.prenda = prenda;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
