//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Materia {
	private String sigla;
	private LS_NormalE le;
	
	public Materia(String sigla, LS_NormalE le) {
		this.sigla = sigla;
		this.le = le;
	}
	public Materia() {
		this.sigla = "";
	}
	public void mostrar() {
		System.out.println("\nSigla: " + this.sigla);
		System.out.println("\nlista normal estudiates");
		le.mostrar();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.sigla= lee.next();
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public LS_NormalE getLe() {
		return le;
	}
	public void setLe(LS_NormalE le) {
		this.le = le;
	}
}
