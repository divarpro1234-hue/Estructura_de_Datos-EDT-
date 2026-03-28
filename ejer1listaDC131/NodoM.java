
public class NodoM {
	private Mueble mue;  //define el mue objeto persona
	private NodoM sig; //definiendo el campo enlace sig
	
	public NodoM() {  //constructor
		sig = null;
	}

	public Mueble getMue() {
		return mue;
	}

	public void setMue(Mueble mue) {
		this.mue = mue;
	}

	public NodoM getSig() {
		return sig;
	}

	public void setSig(NodoM sig) {
		this.sig = sig;
	}
	
}
