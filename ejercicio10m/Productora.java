//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Productora {
	private String nombre;
	private LS_NormalPro lp;
	private LS_NormalTec lt;
	

	public Productora(String nombre, LS_NormalPro lp, LS_NormalTec lt) {
		this.nombre = nombre;
		this.lp = lp;
		this.lt = lt;
	}
	public Productora() {
		this.nombre = "";
	}
	public void mostrar() {
		
		System.out.println("\nnombre: " + this.nombre);
		System.out.println("datos lista produccion");
		lp.mostrar();
		System.out.println("datos lista tecnologia");
		lt.mostrar();
		System.out.println();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.nombre= lee.next();
	
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LS_NormalPro getLp() {
		return lp;
	}
	public void setLp(LS_NormalPro lp) {
		this.lp = lp;
	}
	public LS_NormalTec getLt() {
		return lt;
	}
	public void setLt(LS_NormalTec lt) {
		this.lt = lt;
	}

	
	
}
