
public class Mounstro {
	
	private String nombre;
	private int cantSusto;
	private int nivelEner;
	private String tipoTrab;
	
	public Mounstro(String nombre, int cantSusto, int nivelEner, String tipoTrab) {
		
		this.nombre = nombre;
		this.cantSusto = cantSusto;
		this.nivelEner = nivelEner;
		this.tipoTrab = tipoTrab;
	}

	public Mounstro() {
		this.nombre = "";
		this.cantSusto = 0;
		this.nivelEner = 0;
		this.tipoTrab = "";
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantSusto() {
		return cantSusto;
	}

	public void setCantSusto(int cantSusto) {
		this.cantSusto = cantSusto;
	}

	public int getNivelEner() {
		return nivelEner;
	}

	public void setNivelEner(int nivelEner) {
		this.nivelEner = nivelEner;
	}

	public String getTipoTrab() {
		return tipoTrab;
	}

	public void setTipoTrab(String tipoTrab) {
		this.tipoTrab = tipoTrab;
	}

	public void mostrar() {
		System.out.println();
		System.out.println("nombre: "+ nombre);
		System.out.println("cantidad de Sustos: " + cantSusto);
		System.out.println("nivel energia: " + nivelEner);
		System.out.println("tipo Trabajo: " + tipoTrab);
		
	}

}
