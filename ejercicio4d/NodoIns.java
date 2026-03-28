//Lic Aruquipa Marcelo
public class NodoIns {
	private Inscripcion ins;
	private NodoIns ant;
	private NodoIns sig;
	
	public NodoIns(){
		this.sig = null;
		this.ant = null;
	}
	
	public Inscripcion getIns() {
		return ins;
	}

	public void setIns(Inscripcion ins) {
		this.ins = ins;
	}

	public NodoIns getAnt() {
		return ant;
	}

	public void setAnt(NodoIns ant) {
		this.ant = ant;
	}

	public NodoIns getSig() {
		return sig;
	}

	public void setSig(NodoIns sig) {
		this.sig = sig;
	}
	
}
