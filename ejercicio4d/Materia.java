//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Materia {
	private String sigla;
	private String nomMat;
	private String horario;
	
	public Materia(String sigla, String nomMat, String horario) {
		this.sigla = sigla;
		this.nomMat = nomMat;
		this.horario = horario;
	}
	public Materia() {
		this.sigla = "";
		this.nomMat = "";
		this.horario = "";
	}
	public void mostrar() {
		System.out.println("Sigla: " + this.sigla);
		System.out.println("Nombre materia: " + this.nomMat);
		System.out.println("Horario: " + this.horario);
		System.out.println();
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
	public String getNomMat() {
		return nomMat;
	}
	public void setNomMat(String nomMat) {
		this.nomMat = nomMat;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
}
