package Clases;
//Lic Aruquipa Marcelo
public class NodoH {
	private Historial h;
	private NodoH ant;
	private NodoH sig;
	
	NodoH(){
		this.sig = null;
		this.ant = null;
	}

	public Historial getH() {
		return h;
	}

	public void setH(Historial h) {
		this.h = h;
	}

	public NodoH getAnt() {
		return ant;
	}

	public void setAnt(NodoH ant) {
		this.ant = ant;
	}

	public NodoH getSig() {
		return sig;
	}

	public void setSig(NodoH sig) {
		this.sig = sig;
	}
	
}
