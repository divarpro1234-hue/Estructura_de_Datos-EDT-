
public class PacienteEnEspera {
	private String sintomas;
	private String id_paciente;
	
	public PacienteEnEspera(String sintomas, String id_paciente) {
		this.sintomas = sintomas;
		this.id_paciente = id_paciente;
	}

	public PacienteEnEspera() {
		this.sintomas = "";
		this.id_paciente = "";
	}
	
	public void mostrar() {
		System.out.println();
		System.out.println("sintomas: " + this.sintomas);
		System.out.println("id_paciente: "+ this.id_paciente);
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(String id_paciente) {
		this.id_paciente = id_paciente;
	}

}
