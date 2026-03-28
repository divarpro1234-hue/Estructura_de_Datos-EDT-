//Lic Aruquipa Marcelo
public class NodoD {
	private Duenio duenio;
	private NodoD ant;
	private NodoD sig;
	
	public NodoD(){
		this.sig = null;
		this.ant = null;
	}
	
	public Duenio getDuenio() {
		return duenio;
	}

	public void setDuenio(Duenio duenio) {
		this.duenio = duenio;
	}

	public NodoD getAnt() {
		return ant;
	}

	public void setAnt(NodoD ant) {
		this.ant = ant;
	}

	public NodoD getSig() {
		return sig;
	}

	public void setSig(NodoD sig) {
		this.sig = sig;
	}
	
}
