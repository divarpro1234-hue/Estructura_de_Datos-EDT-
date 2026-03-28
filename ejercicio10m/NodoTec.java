
public class NodoTec {
	private Tecnologia tec;  //define el dato objeto persona
	private NodoTec sig; //definiendo el campo enlace sig
	
	public NodoTec() {  
		sig = null;
	}

	public Tecnologia getTec() {
		return tec;
	}

	public void setTec(Tecnologia tec) {
		this.tec = tec;
	}

	public NodoTec getSig() {
		return sig;
	}

	public void setSig(NodoTec sig) {
		this.sig = sig;
	}
	
}
