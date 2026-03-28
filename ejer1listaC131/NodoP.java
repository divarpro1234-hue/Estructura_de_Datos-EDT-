//Lic Aruquipa Marcelo
public class NodoP {
	private Partida part;
	private NodoP ant;
	private NodoP sig;
	
	NodoP(){
		this.sig = null;
		this.ant = null;
	}

	public Partida getPart() {
		return part;
	}

	public void setPart(Partida part) {
		this.part = part;
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
