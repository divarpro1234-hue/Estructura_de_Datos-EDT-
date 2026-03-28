import java.util.Scanner;

public class Mensaje {
	private String numCel;
	private String asunto;
	private String fecha;
	private String hora;
	private String texto;
	
	public Mensaje(String numCel, String asunto, String fecha, String hora, String texto) {
		this.numCel = numCel;
		this.asunto = asunto;
		this.fecha = fecha;
		this.hora = hora;
		this.texto = texto;
	}
	
	public Mensaje() {
		this.numCel = "";
		this.asunto = "";
		this.fecha = "";
		this.hora = "";
		this.texto = "";
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos persona: numCelbre, edad");
		this.numCel = lee.next();
		this.asunto = lee.next();
		this.fecha = lee.next();
		this.hora = lee.next();
		this.texto = lee.next();
	}

	public void mostrar() {
		System.out.println();
		System.out.println("numero de Celular : " + this.numCel);
		System.out.println("asunto: " + this.asunto);
		System.out.println("fecha: " + this.fecha);
		System.out.println("hora: " + this.hora);
		System.out.println("texto: " + this.texto);
	}

	public String getNumCel() {
		return numCel;
	}

	public void setNumCel(String numCel) {
		this.numCel = numCel;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
