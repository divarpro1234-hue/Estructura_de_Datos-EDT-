//Lic Aruquipa Marcelo
public class NodoP {
	private Puesto puesto;
	private NodoP ant;
	private NodoP sig;
	
	public NodoP(){
		this.sig = null;
		this.ant = null;
	}
	
	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	public NodoP getAnt() {
		return ant;
	}

	public void setAnt(NodoP ant) {
		this.ant = ant;
	}

	public NodoP getSig() {
		return sig;
	}

	public void setSig(NodoP sig) {
		this.sig = sig;
	}
	
}
