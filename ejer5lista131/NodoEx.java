
public class NodoEx {
	private Expedicion exp;  //define el exp objeto persona
	private NodoEx sig; //definiendo el campo enlace sig
	
	public NodoEx() {  //constructor
		sig = null;
	}

	public Expedicion getExp() {
		return exp;
	}

	public void setExp(Expedicion exp) {
		this.exp = exp;
	}

	public NodoEx getSig() {
		return sig;
	}

	public void setSig(NodoEx sig) {
		this.sig = sig;
	}
	
}
