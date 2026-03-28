import java.util.Scanner;

public class Mueble {
	private String idCasa;
	private int cantidad;
	private String nombre;
	
	public Mueble(String idCasa, int cantidad, String nombre) {
		this.idCasa = idCasa;
		this.cantidad = cantidad;
		this.nombre = nombre;
	}
	
	public Mueble() {
		this.idCasa = "";
		this.cantidad = 0;
		this.nombre = "";
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos persona: idCasabre, edad");
		this.idCasa = lee.next();
		this.cantidad = lee.nextInt();
		this.nombre = lee.next();
	}

	public void mostrar() {
		System.out.println();
		System.out.println("id casa : " + this.idCasa);
		System.out.println("cantidad: " + this.cantidad);
		System.out.println("nombre: " + nombre);
	}

	public String getidCasa() {
		return idCasa;
	}

	public void setidCasa(String idCasa) {
		this.idCasa = idCasa;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
