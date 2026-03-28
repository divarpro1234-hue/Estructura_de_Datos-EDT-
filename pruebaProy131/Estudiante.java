
public class Estudiante {
	
	private String nombre;
	private String ci;
	private int edad;
	private String fechaNac;
	private String genero;
	private double nota;
	private ColaCircularMateria ccm;
	
	public Estudiante(String nombre, String ci, int edad, String fechaNac, String genero, double nota, ColaCircularMateria ccm) {
		
		this.nombre = nombre;
		this.ci = ci;
		this.edad = edad;
		this.fechaNac = fechaNac;
		this.genero = genero;
		this.nota = nota;
		this.ccm = ccm;
	}

	public Estudiante() {
		this.nombre = "";
		this.ci = "";
		this.edad = 0;
		this.fechaNac = "";
		this.genero = "";
		this.nota = 0;
		this.ccm = null;
	}
	
	public void mostrar() {
		System.out.println();
		System.out.println("datos del estudiante");
		System.out.println("nombre: "+ this.nombre);
		System.out.println("ci: " + this.ci);
		System.out.println("edad: " + this.edad);
		System.out.println("fecha de nacimiento: " + this.fechaNac);
		System.out.println("genero: " + this.genero);
		System.out.println("nota: " + this.nota);
		ccm.mostrar();
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public ColaCircularMateria getCcm() {
		return ccm;
	}

	public void setCcm(ColaCircularMateria ccm) {
		this.ccm = ccm;
	}
	
}
