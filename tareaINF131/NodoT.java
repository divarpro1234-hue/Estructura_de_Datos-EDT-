//Lic Aruquipa Marcelo
public class NodoT {
	private Trufi dato;
	private NodoT ant;
	private NodoT sig;
	
	NodoT(){
		this.sig = null;
		this.ant = null;
	}

	public Trufi getDato() {
		return dato;
	}

	public void setDato(Trufi dato) {
		this.dato = dato;
	}

	public NodoT getAnt() {
		return ant;
	}

	public void setAnt(NodoT ant) {
		this.ant = ant;
	}

	public NodoT getSig() {
		return sig;
	}

	public void setSig(NodoT sig) {
		this.sig = sig;
	}
	
}
