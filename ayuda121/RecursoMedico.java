//Lic Aruquipa Marcelo
import java.util.Scanner;

public class RecursoMedico {
	
	private String tipoRecurso;
	private Paciente pacienteAsig;
	private int cantidadDisponible;
	
	

	public RecursoMedico(String tipoRecurso, Paciente pacienteAsig, int cantidadDisponible) {
		this.tipoRecurso = tipoRecurso;
		this.setPacienteAsig(pacienteAsig);
		this.cantidadDisponible = cantidadDisponible;
		
	}
	public RecursoMedico() {
		this.tipoRecurso = "";
		this.setPacienteAsig(pacienteAsig);
		this.cantidadDisponible = 0;
		
	}
	public void mostrar() {

		System.out.println("tipoRecurso: " + this.tipoRecurso);
		pacienteAsig.mostrar();
		System.out.println("cantidad Disponible del recurso medico: " + this.cantidadDisponible+" %");
		System.out.println();
	}
	public void leer() {
		
		Scanner lee = new Scanner(System.in);
		this.tipoRecurso= lee.next();
		
		this.cantidadDisponible= lee.nextInt();
		
	}
	
	public String getTipoRecurso() {
		return tipoRecurso;
	}
	public void setTipoRecurso(String tipoRecurso) {
		this.tipoRecurso = tipoRecurso;
	}
	public int getCantidadDisponible() {
		return cantidadDisponible;
	}
	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
	public Paciente getPacienteAsig() {
		return pacienteAsig;
	}
	public void setPacienteAsig(Paciente pacienteAsig) {
		this.pacienteAsig = pacienteAsig;
	}
	
	
}
