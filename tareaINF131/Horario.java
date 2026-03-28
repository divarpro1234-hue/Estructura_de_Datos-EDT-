import java.util.Scanner;

public class Horario {
	private String dia;
	private String hora;
	
	public Horario(String dia, String hora) {
		this.dia = dia;
		this.hora = hora;
	}
	
	public Horario() {
		this.dia = "";
		this.hora = "";
	}
	
	public void mostrar() {
		System.out.println();
		System.out.println("dia : " + this.dia);
		System.out.println("hora: " + this.hora);
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

}
