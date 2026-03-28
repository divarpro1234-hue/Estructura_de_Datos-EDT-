
public class NodoA {
	private Avion av;  //define el dato objeto persona
	private NodoA sig; //definiendo el campo enlaav sig
	
	public NodoA() {  
		sig = null;
	}

	public Avion getAv() {
		return av;
	}

	public void setAv(Avion av) {
		this.av = av;
	}

	public NodoA getSig() {
		return sig;
	}

	public void setSig(NodoA sig) {
		this.sig = sig;
	}


	
}
