
public class NodoM {
	private Medalla med;  //define el med objeto persona
	private NodoM sig; //definiendo el campo enlace sig
	
	public NodoM() {  //constructor
		sig = null;
	}

	public Medalla getMed() {
		return med;
	}

	public void setMed(Medalla med) {
		this.med = med;
	}

	public NodoM getSig() {
		return sig;
	}

	public void setSig(NodoM sig) {
		this.sig = sig;
	}
	
}
