package Clases;
//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Historial {
	private String id_paciente;
	private LD_NormalD ld;
	
	public Historial(String id_paciente, LD_NormalD ld) {
		this.id_paciente = id_paciente;
		this.ld = ld;
	}
	public Historial() {
		this.id_paciente = "";
		this.ld = null;
	}
	public void mostrar() {
		System.out.println("\n\tHistorial del paciente");
		System.out.println();
		System.out.println("id_paciente: " + this.id_paciente);
		System.out.println("lista de diagnosticos que tuvo el paciente: ");
		ld.mostrar();
		System.out.println();
	}
	public String getId_paciente() {
		return id_paciente;
	}
	public void setId_paciente(String id_paciente) {
		this.id_paciente = id_paciente;
	}
	public LD_NormalD getLd() {
		return ld;
	}
	public void setLd(LD_NormalD ld) {
		this.ld = ld;
	}
	
	
}