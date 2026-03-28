//Lic Aruquipa Marcelo
public class NodoInt {
	private Integrantes integ;
	private NodoInt sig;
	
	public NodoInt() {  //constructor
		sig = null;
	}

	public Integrantes getInteg() {
		return integ;
	}

	public void setInteg(Integrantes integ) {
		this.integ = integ;
	}

	public NodoInt getSig() {
		return sig;
	}

	public void setSig(NodoInt sig) {
		this.sig = sig;
	}
	
}
