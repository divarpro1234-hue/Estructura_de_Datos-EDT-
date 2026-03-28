//Lic Aruquipa Marcelo
public class NodoE {
	private String nombre;
	private double nota;
	private String paralelo;
	private NodoE ant;
	private NodoE sig;
	
	NodoE(){
		this.sig = null;
		this.ant = null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public String getParalelo() {
		return paralelo;
	}

	public void setParalelo(String paralelo) {
		this.paralelo = paralelo;
	}

	public NodoE getAnt() {
		return ant;
	}

	public void setAnt(NodoE ant) {
		this.ant = ant;
	}

	public NodoE getSig() {
		return sig;
	}

	public void setSig(NodoE sig) {
		this.sig = sig;
	}
	
}
