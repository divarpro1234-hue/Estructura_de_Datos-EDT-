
public class NodoSop {
	private SimbolosOp sop;  //define el sop objeto persona
	private NodoSop sig; //definiendo el campo enlace sig
	private NodoSop ant;
	
	public NodoSop() {  //constructor
		sig = null;
	}

	public SimbolosOp getSop() {
		return sop;
	}

	public void setSop(SimbolosOp sop) {
		this.sop = sop;
	}

	public NodoSop getSig() {
		return sig;
	}

	public void setSig(NodoSop sig) {
		this.sig = sig;
	}

	public NodoSop getAnt() {
		return ant;
	}

	public void setAnt(NodoSop ant) {
		this.ant = ant;
	}
	
}
