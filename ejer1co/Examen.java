
public class Examen {
	private String nombreEstudiante;
	private String fechaNac;
	private double nota;
	
	public Examen(String nombreEstudiante, String fechaNac, double nota) {
		this.nombreEstudiante = nombreEstudiante;
		this.fechaNac = fechaNac;
		this.nota = nota;
	}

	public String getnombreEstudiante() {
		return nombreEstudiante;
	}

	public void setnombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	public String getfechaNac() {
		return fechaNac;
	}

	public void setfechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Examen [nombreEstudiante=" + nombreEstudiante + ", fechaNac=" + fechaNac + ", nota=" + nota + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
}
