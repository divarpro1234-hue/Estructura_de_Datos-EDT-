import java.util.Scanner;

public class Medico {
	private String nombreMed;
	private String especialidad;
	private String estado;
	private Paciente pacienteAsig;
	
	public Medico(String nombreMed, String especialidad, String estado, Paciente pacienteAsig) {
		this.nombreMed = nombreMed;
		this.especialidad = especialidad;
		this.estado = estado;
		this.setPacienteAsig(pacienteAsig);//
	}
	
	public Medico() {
		this.nombreMed = "";
		this.especialidad = "";
		this.estado = "";
		this.setPacienteAsig(pacienteAsig);//
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos del medico: nombre medico, especialidad, estado, paciente asignado");
		this.nombreMed = lee.next();
		this.especialidad = lee.next();
		this.estado = lee.next();
		
		
	}

	public void mostrar() {
		System.out.println("\nDatos del medico");
		System.out.println("nombreMed : " + this.nombreMed);
		System.out.println("especialidad: " + this.especialidad);
		System.out.println("estado: " + this.estado);
		pacienteAsig.mostrar();
	}

	 public void asignarPaciente(Paciente paciente) {
	        if (this.estado.equals("Libre")) {
	            this.pacienteAsig = paciente;
	            this.estado = "Ocupado";
	            System.out.println("Paciente " + paciente.getNombre() + " fue asignado al " + this.nombreMed + ".");
	        }
	    }
	 public boolean verificarDisponibilidad() {
	        return this.estado.equals("Libre");
	    }
	public String getNombreMed() {
		return nombreMed;
	}

	public void setNombreMed(String nombreMed) {
		this.nombreMed = nombreMed;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Paciente getPacienteAsig() {
		return pacienteAsig;
	}

	public void setPacienteAsig(Paciente pacienteAsig) {
		this.pacienteAsig = pacienteAsig;
	}

}
