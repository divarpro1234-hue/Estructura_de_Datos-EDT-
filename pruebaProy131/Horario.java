import java.util.Scanner;

public class Horario {
	private String dia;
	private String horaInicio;
	private String horaFin;
	private Docente c;
	private Materia m;
	
	public Horario(String dia, String horaInicio, String horaFin, Docente c, Materia m) {
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.c = c;
		this.m = m;
	}
	
	public Horario() {
		this.dia = "";
		this.horaInicio = "";
		this.horaFin = "";
		this.c = null;
		this.m = null;
	}
	
//	public void leer() {
//		Scanner lee = new Scanner(System.in);
//		System.out.println("Datos persona: diabre, edad");
//		this.dia = lee.next();
//		this.horaInicio = lee.next();
//		this.horaFin = lee.nextInt();
//		this.c = lee.next();
//		this.numVictoria = lee.nextInt();
//	}

	public void mostrar() {
		System.out.println();
		System.out.println("dia : " + this.dia);
		System.out.println("hora Inicio: " + this.horaInicio);
		System.out.println("hora fin: " + this.horaFin);
		c.mostrar();
		m.mostrar();
	}
	
}
