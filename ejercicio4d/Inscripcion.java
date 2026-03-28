//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Inscripcion {
	private String sigla;
	private String ci;
	
	public Inscripcion(String sigla, String ci) {
		this.ci = ci;
		this.sigla = sigla;
	
	}
	public Inscripcion() {
		this.ci = "";
		this.sigla = "";
	}
	public void mostrar() {
		System.out.println("ci: " + this.ci);
		System.out.println("Sigla: " + this.sigla);
		System.out.println();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.ci = lee.next();
		this.sigla= lee.next();
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
}
