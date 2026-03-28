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
		System.out.println("Datos Registro salud: nombre paciente, fecha, temperatura, frecuencia Cardiaca, nivel Oxigeno");
		nombrePac.leer();
		this.fecha = lee.next();
		this.temperatura = lee.next();
		this.frecuenciaCardiaca = lee.next();
		this.nivelOxigeno = lee.next();
	}

	public void mostrar() {
		System.out.println("datos Registro Salud");
		nombrePac.mostrar();
		System.out.println("fecha : " + this.fecha);
		System.out.println("temperatura: " + this.temperatura);
		System.out.println("frecuencia Cardiaca: " + this.frecuenciaCardiaca);
		System.out.println("nivel Oxigeno: " + this.nivelOxigeno);
		
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
