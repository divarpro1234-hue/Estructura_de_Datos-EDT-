import java.util.Scanner;

public class Tratamiento {
	private String fecha;
	private String tipoTratamiendo;
	private Paciente pacienteAsig;

	public Tratamiento(String fecha, String tipoTratamiendo, Paciente pacienteAsig) {
		this.fecha= fecha;
		this.tipoTratamiendo =tipoTratamiendo;
		this.pacienteAsig =pacienteAsig;
	}
	public Tratamiento() {
		this.fecha= "";
		this.tipoTratamiendo ="";
		this.setPacienteAsig(pacienteAsig);;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		this.fecha = sc.next();
		this.tipoTratamiendo = sc.next();
		pacienteAsig.leer();
	}

	void mostrar() {
		System.out.println("Tratamiento[ fecha: " + fecha + ", Tipo de tratamiento: " + tipoTratamiendo + "]");
		pacienteAsig.mostrar();
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTipoTratamiendo() {
		return tipoTratamiendo;
	}

	public void setTipoTratamiendo(String tipoTratamiendo) {
		this.tipoTratamiendo = tipoTratamiendo;
	}

	public Paciente getPacienteAsig() {
		return pacienteAsig;
	}

	public void setPacienteAsig(Paciente pacienteAsig) {
		this.pacienteAsig = pacienteAsig;
	}
	
}