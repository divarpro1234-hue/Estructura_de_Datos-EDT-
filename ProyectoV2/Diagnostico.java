//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Diagnostico {
	private String id_medico;
	private String sintomas;
	private String tratamiento;
	private String fecha;
	private LD_NormalSM lsm;
	
	public Diagnostico(String id_medico, String sintomas, String tratamiento, String fecha, LD_NormalSM lsm) {
		this.id_medico = id_medico;
		this.sintomas = sintomas;
		this.tratamiento = tratamiento;
		this.fecha = fecha;
		this.lsm = lsm;
	}
	public Diagnostico() {
		this.id_medico = "";
		this.sintomas = "";
		this.tratamiento = "";
		this.fecha = "";
		this.lsm = null;
	}
	public void mostrar() {
		System.out.println("\n\tdiagnostico del paciente");
		System.out.println("id_medico: " + this.id_medico);
		System.out.println("sintomas: " + this.sintomas);
		System.out.println("tratamiento: " + this.tratamiento);
		System.out.println("fecha: " + this.fecha);
		System.out.println("\nlista de seguimiento medico:");
		lsm.mostrar();
		System.out.println();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.id_medico = lee.next();
	}
	public String getId_medico() {
		return id_medico;
	}
	public void setId_medico(String id_medico) {
		this.id_medico = id_medico;
	}
	public String getSintomas() {
		return sintomas;
	}
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	public String getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public LD_NormalSM getLsm() {
		return lsm;
	}
	public void setLsm(LD_NormalSM lsm) {
		this.lsm = lsm;
	}

	
}