
public class Estudiante {
	private String ci;
	private String nombre;
	private int cantMat;
	private int promedio;
	private String carrera;
	
	public Estudiante(String ci, String nombre, int cantMat, int promedio, String carrera) {
		this.ci = ci;
		this.nombre = nombre;
		this.cantMat = cantMat;
		this.promedio = promedio;
		this.carrera = carrera;
	}

	public Estudiante() {
		this.ci = "";
		this.nombre = "";
		this.cantMat = 0;
		this.promedio = 0;
		this.carrera = "";
	}
	
	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantMat() {
		return cantMat;
	}

	public void setCantMat(int cantMat) {
		this.cantMat = cantMat;
	}

	public int getPromedio() {
		return promedio;
	}

	public void setPromedio(int promedio) {
		this.promedio = promedio;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public void mostrar() {
		System.out.println();
		System.out.println("C.I: " + ci);
		System.out.println("nombre: "+ nombre);
		System.out.println("cantidad materias: " + cantMat);
		System.out.println("promedio: " + promedio);
		System.out.println("carrera: " + carrera);
		
	}

}
