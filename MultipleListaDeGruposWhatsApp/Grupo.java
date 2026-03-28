//Lic Aruquipa Marcelo
import java.util.Date;
import java.util.Scanner;

public class Grupo {
	private String nombre;
	private String fechaCreacion;
	private LS_NormalAdmin ladm;
	private LS_NormalInt linteg;
	
	
	public Grupo(String nombre, String fechaCreacion, LS_NormalAdmin ladm, LS_NormalInt linteg) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.ladm = ladm;
		this.linteg = linteg;
	}
	public Grupo() {
		this.nombre = "";
		this.fechaCreacion = null;
		
	}
	public void mostrar() {
		System.out.println("\n\tNOMBRE DEL GRUPO: " + this.nombre);
		System.out.println("\nFECHA DE CREACIONn: " + this.fechaCreacion);
		System.out.println("-------------------------------------");
		System.out.println("\nlISTA NORMAL ADMINISTRADORES");
		System.out.println();
		ladm.mostrar();
		System.out.println("\nlISTA NORMAL INTEGRANTES");
		System.out.println();
		linteg.mostrar();
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
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public LS_NormalAdmin getLadm() {
		return ladm;
	}
	public void setLadm(LS_NormalAdmin ladm) {
		this.ladm = ladm;
	}
	public LS_NormalInt getLinteg() {
		return linteg;
	}
	public void setLinteg(LS_NormalInt linteg) {
		this.linteg = linteg;
	}
}
