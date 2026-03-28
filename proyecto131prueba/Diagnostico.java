//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Diagnostico {
	private Medico med;
	private String descripcion;
	private String tratamiento;
	private String fecha;
	
	
	public Diagnostico(Medico med, String descripcion, String tratamiento, String fecha) {
		this.med = med;
		this.descripcion = descripcion;
		this.tratamiento = tratamiento;
		this.fecha = fecha;
	}
	public Diagnostico() {
		this.med = null;
		this.descripcion = "";
		this.tratamiento = "";
		this.fecha = "";
	}
	public void mostrar() {
		System.out.println();
		med.mostrar();
		System.out.println("descripcion: " + this.descripcion);
		System.out.println("tratamiento: " + this.tratamiento);
		System.out.println("fecha: " + this.fecha);
			
	}
	public Medico getMed() {
		return med;
	}
	public void setMed(Medico med) {
		this.med = med;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	
}
