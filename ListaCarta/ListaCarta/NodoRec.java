package ListaCarta;
public class NodoRec {
	private int nroCel; 
	private NodoRem sig;
	
	public NodoRec() {  //constructor
		sig = null;
	}

	public int getNroCel() {
		return nroCel;
	}

	public void setNroCel(int nroCel) {
		this.nroCel = nroCel;
	}

	public NodoRem getSig() {
		return sig;
	}

	public void setSig(NodoRem sig) {
		this.sig = sig;
	}

	

	
	
}
