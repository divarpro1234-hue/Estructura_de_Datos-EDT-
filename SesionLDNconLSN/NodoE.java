//Lic Aruquipa Marcelo
public class NodoE {
	private Estudiante est;
	private NodoE sig;
	
	public NodoE() {  //constructor
		sig = null;
	}

	public Estudiante getEst() {
		return est;
	}

	public void setEst(Estudiante est) {
		this.est = est;
	}

	public NodoE getSig() {
		return sig;
	}

	public void setSig(NodoE sig) {
		this.sig = sig;
	}
	
}
