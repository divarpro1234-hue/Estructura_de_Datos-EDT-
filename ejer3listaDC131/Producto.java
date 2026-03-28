//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Producto {
	private String nomProd;
	private int precio;
	private String idPuesto;
	
	public Producto(String nomProd, int precio, String idPuesto) {
		this.nomProd = nomProd;
		this.precio = precio;
		this.idPuesto = idPuesto;
	}
	public Producto() {
		this.nomProd = "";
		this.precio = 0;
		this.idPuesto = "";
	}
	public void mostrar() {
		System.out.println("nombre producto: " + this.nomProd);
		System.out.println("precio: " + this.precio);
		System.out.println("id puesto: " + this.idPuesto);
		System.out.println();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.nomProd = lee.next();
		this.precio = lee.nextInt();
	}
	public String getNomProd() {
		return nomProd;
	}
	public void setNomProd(String nomProd) {
		this.nomProd = nomProd;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getIdPuesto() {
		return idPuesto;
	}
	public void setIdPuesto(String idPuesto) {
		this.idPuesto = idPuesto;
	}
	
}
