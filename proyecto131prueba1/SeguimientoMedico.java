//Lic Aruquipa Marcelo
import java.util.Scanner;

public class SeguimientoMedico {
	private String visitaPeriodica;
	private String observacion;
	
	public SeguimientoMedico(String visitaPeriodica, String observacion) {
		this.visitaPeriodica = visitaPeriodica;
		this.observacion = observacion;
	}
	public SeguimientoMedico() {
		this.visitaPeriodica = "";
		this.observacion = "";
	}
	public void mostrar() {
		System.out.println("\n\tSeguimiento del paciente");
		System.out.println("Visita periodica: " + this.visitaPeriodica);
		System.out.println("observacion: se encuentra " + this.observacion);
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.visitaPeriodica = lee.next();
	}
	public String getVisitaPeriodica() {
		return visitaPeriodica;
	}
	public void setVisitaPeriodica(String visitaPeriodica) {
		this.visitaPeriodica = visitaPeriodica;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	
}