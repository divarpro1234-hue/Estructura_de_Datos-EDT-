//Lic Aruquipa Marcelo
public class NodoP {
	private Paciente p;
	private NodoP ant;
	private NodoP sig;
	
	NodoP(){
		this.sig = null;
		this.ant = null;
	}

	public Paciente getP() {
		return p;
	}

	public void setP(Paciente p) {
		this.p = p;
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
