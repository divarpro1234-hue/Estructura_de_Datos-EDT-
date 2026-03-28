import java.util.Scanner;

public class Medico {
	private String id_medico;
	private String nombre;
	private String id_consultorio;
	private String especialidad;
	
	public Medico(String id_medico, String nombre, String id_consultorio, String especialidad) {
		this.id_medico = id_medico;
		this.nombre = nombre;
		this.id_consultorio = id_consultorio;
		this.especialidad = especialidad;
	}
	public Medico() {
		this.id_medico = "";
		this.nombre = "";
		this.id_consultorio = "";
		this.especialidad = "";
		
	}
	public void mostrar() {
		System.out.println("\tDatos del medico");
		System.out.println("id medico: " + this.id_medico);
		System.out.println("nombre: " + this.nombre);
		System.out.println("id consultorio: " + this.id_consultorio);
		System.out.println("especialidad: " + this.especialidad);
	}
	public String getId_medico() {
		return id_medico;
	}
	public void setId_medico(String id_medico) {
		this.id_medico = id_medico;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId_consultorio() {
		return id_consultorio;
	}
	public void setId_consultorio(String id_consultorio) {
		this.id_consultorio = id_consultorio;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
}
