
public class NodoRem {
	private int nroCel; 
	private NodoRec sig;
	
	public NodoRem() {  //constructor
		sig = null;
	}

	public int getNroCel() {
		return nroCel;
	}

	public void setNroCel(int nroCel) {
		this.nroCel = nroCel;
	}

	public NodoRec getSig() {
		return sig;
	}

	public void setSig(NodoRec sig) {
		this.sig = sig;
	}
	
}
