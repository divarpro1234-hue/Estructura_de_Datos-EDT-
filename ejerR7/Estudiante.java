import java.util.Scanner;

public class Estudiante {
	private String patE;
	private String mate;
	private String nomE;
	private String especialidadPaciente;
	
	public Estudiante(String patE, String mate, String nomE, String especialidadPaciente) {
		this.patE = patE;
		this.mate = mate;
		this.nomE = nomE;
		this.especialidadPaciente = especialidadPaciente;
		
	}
	
	public Estudiante() {
		this.patE = "";
		this.mate ="";
		this.nomE = "";
		this.especialidadPaciente = "";
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos de las peliculas: patE, mate, duracion");
		this.patE = lee.next();
		this.mate = lee.next();
		this.nomE = lee.next();
		this.especialidadPaciente = lee.next();
	}

	public void mostrar() {
//		System.out.println("Datos de la lista");
		System.out.println("\npatE : " + this.patE);
		System.out.println("mate: " + this.mate);
		System.out.println("fue atendido: " + this.nomE);
		System.out.println("especialidad del Paciente: " + this.especialidadPaciente);
	}
	
	public String getPatE() {
		return patE;
	}

	public void setPatE(String patE) {
		this.patE = patE;
	}

	public String getMate() {
		return mate;
	}

	public void setMate(String mate) {
		this.mate = mate;
	}

	public String getNomE() {
		return nomE;
	}

	public void setNomE(String nomE) {
		this.nomE = nomE;
	}

	public String getEspecialidadPaciente() {
		return especialidadPaciente;
	}

	public void setEspecialidadPaciente(String especialidadPaciente) {
		this.especialidadPaciente = especialidadPaciente;
	}
	
}
