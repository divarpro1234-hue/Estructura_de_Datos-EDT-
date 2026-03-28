
public class NodoAu {
	private Auto auto;  //define el auto objeto persona
	private NodoAu sig; //definiendo el campo enlace sig
	
	public NodoAu() {  //constructor
		sig = null;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public NodoAu getSig() {
		return sig;
	}

	public void setSig(NodoAu sig) {
		this.sig = sig;
	}
	
}
