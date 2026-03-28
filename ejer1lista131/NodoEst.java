
public class NodoEst {
	private Estudiante est;  //define el est objeto persona
	private NodoEst sig; //definiendo el campo enlace sig
	
	public NodoEst() {  //constructor
		sig = null;
	}

	public Estudiante getEst() {
		return est;
	}

	public void setEst(Estudiante est) {
		this.est = est;
	}

	public NodoEst getSig() {
		return sig;
	}

	public void setSig(NodoEst sig) {
		this.sig = sig;
	}
	
}
