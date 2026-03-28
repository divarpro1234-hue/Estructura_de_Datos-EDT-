package Clases;
//Lic Aruquipa Marcelo
public class NodoD {
	private Diagnostico d;
	private NodoD ant;
	private NodoD sig;
	
	NodoD(){
		this.sig = null;
		this.ant = null;
	}

	public Diagnostico getD() {
		return d;
	}

	public void setD(Diagnostico d) {
		this.d = d;
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
