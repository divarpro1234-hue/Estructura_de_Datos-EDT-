
public class Competencia {
	
	private String nombre;
	private String especie;
	private int velMax;
	private int cantCarGan;
	private String categoria;
	
	public Competencia(String nombre, String especie, int velMax, int cantCarGan, String categoria) {
		
		this.nombre = nombre;
		this.especie = especie;
		this.velMax = velMax;
		this.cantCarGan = cantCarGan;
		this.categoria = categoria;
	}

	public Competencia() {
		this.nombre = "";
		this.especie = "";
		this.velMax = 0;
		this.cantCarGan = 0;
		this.categoria = "";
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getVelMax() {
		return velMax;
	}

	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}

	public int getCantCarGan() {
		return cantCarGan;
	}

	public void setCantCarGan(int cantCarGan) {
		this.cantCarGan = cantCarGan;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void mostrar() {
		System.out.println();
		System.out.println("nombre: "+ nombre);
		System.out.println("especie: " + especie);
		System.out.println("velocidad maxima: " + velMax);
		System.out.println("cantidad carreras ganadas: " + cantCarGan);
		System.out.println("categoria: " + categoria);
	}

}
