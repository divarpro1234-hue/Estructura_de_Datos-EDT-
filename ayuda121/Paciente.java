import java.util.Scanner;

public class Paciente {
	private String nombre;
	private int edad;
	private double peso;
	private int nivelPrioridad;
	
	public Paciente(String nombre, int edad, double peso, int nivelPrioridad) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.nivelPrioridad = nivelPrioridad;
		
	}
	
	public Paciente() {
		this.nombre = "";
		this.edad = 0;
		this.peso = 0;
		this.nivelPrioridad = 0;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos del paciente: nombre, edad, peso, nivelPrioridad");
		this.nombre = lee.next();
		this.edad = lee.nextInt();
		this.peso = lee.nextInt();
		this.nivelPrioridad = lee.nextInt();
		
	}

	public void mostrar() {
		System.out.println("datos del paciente");
		System.out.println("nombre : " + this.nombre);
		System.out.println("edad: " + this.edad);
		System.out.println("peso: " + this.peso);
		System.out.println("nivel de prioridad: " + this.nivelPrioridad);
		System.out.println(); 
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getNivelPrioridad() {
		return nivelPrioridad;
	}

	public void setNivelPrioridad(int nivelPrioridad) {
		this.nivelPrioridad = nivelPrioridad;
	}
	
}
