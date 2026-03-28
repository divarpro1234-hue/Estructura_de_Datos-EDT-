
import java.util.Scanner;

public class RegistroSalud {
	private Paciente nombrePac;
	private String fecha;
	private String temperatura;
	private String frecuenciaCardiaca;
	private String nivelOxigeno;
	
	public RegistroSalud(Paciente nombrePac, String fecha, String temperatura, String frecuenciaCardiaca, String nivelOxigeno) {
		this.nombrePac = nombrePac;
		this.fecha = fecha;
		this.temperatura = temperatura;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
		this.nivelOxigeno = nivelOxigeno;
	}
	
	public RegistroSalud() {
		this.setNombrePac(nombrePac);
		this.fecha = "";
		this.temperatura = "";
		this.frecuenciaCardiaca = "";
		this.nivelOxigeno = "";
	}
	
public void leer() {
    Scanner lee = new Scanner(System.in);
    System.out.println("Ingrese la fecha del registro de salud:");
    this.fecha = lee.next();  // Lee la fecha

    System.out.println("Ingrese la temperatura del paciente:");
    this.temperatura = lee.next();  // Lee la temperatura

    System.out.println("Ingrese la frecuencia cardiaca del paciente:");
    this.frecuenciaCardiaca = lee.next();  // Lee la frecuencia cardiaca

    System.out.println("Ingrese el nivel de oxIgeno del paciente:");
    this.nivelOxigeno = lee.next();  // Lee el nivel de oxígeno
}


	public void mostrar() {
    System.out.println("datos Registro Salud");
    nombrePac.mostrar();  // Esto imprimirá los detalles del paciente
    System.out.println("Fecha: " + this.fecha);
    System.out.println("Temperatura: " + this.temperatura);
    System.out.println("Frecuencia Cardiaca: " + this.frecuenciaCardiaca);
    System.out.println("Nivel Oxigeno: " + this.nivelOxigeno);
}


	public Paciente getNombrePac() {
		return nombrePac;
	}

	public void setNombrePac(Paciente nombrePac) {
		this.nombrePac = nombrePac;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	public String getFrecuenciaCardiaca() {
		return frecuenciaCardiaca;
	}

	public void setFrecuenciaCardiaca(String frecuenciaCardiaca) {
		this.frecuenciaCardiaca = frecuenciaCardiaca;
	}

	public String getNivelOxigeno() {
		return nivelOxigeno;
	}

	public void setNivelOxigeno(String nivelOxigeno) {
		this.nivelOxigeno = nivelOxigeno;
	}
}
