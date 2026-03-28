import java.util.Scanner;

public class Paciente {
	private String idPaciente;
	private String nomPaciente;
	private String fueAtendido;
	private String especialidadPaciente;
	
	public Paciente(String idPaciente, String nomPaciente, String fueAtendido, String especialidadPaciente) {
		this.idPaciente = idPaciente;
		this.nomPaciente = nomPaciente;
		this.fueAtendido = fueAtendido;
		this.especialidadPaciente = especialidadPaciente;
		
	}
	
	public Paciente() {
		this.idPaciente = "";
		this.nomPaciente ="";
		this.fueAtendido = "";
		this.especialidadPaciente = "";
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos de las peliculas: idPaciente, nomPaciente, duracion");
		this.idPaciente = lee.next();
		this.nomPaciente = lee.next();
		this.fueAtendido = lee.next();
		this.especialidadPaciente = lee.next();
	}

	public void mostrar() {
//		System.out.println("Datos de la lista");
		System.out.println("\nidPaciente : " + this.idPaciente);
		System.out.println("nomPaciente: " + this.nomPaciente);
		System.out.println("fue atendido: " + this.fueAtendido);
		System.out.println("especialidad del Paciente: " + this.especialidadPaciente);
	}
	
	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNomPaciente() {
		return nomPaciente;
	}

	public void setNomPaciente(String nomPaciente) {
		this.nomPaciente = nomPaciente;
	}

	public String getFueAtendido() {
		return fueAtendido;
	}

	public void setFueAtendido(String fueAtendido) {
		this.fueAtendido = fueAtendido;
	}

	public String getEspecialidadPaciente() {
		return especialidadPaciente;
	}

	public void setEspecialidadPaciente(String especialidadPaciente) {
		this.especialidadPaciente = especialidadPaciente;
	}
	
}
