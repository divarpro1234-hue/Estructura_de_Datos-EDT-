public class NodoArt {
	private Artista q;  //define el dato objeto persona
	private NodoArt sig; //definiendo el campo enlace sig
	
	public NodoArt() {  //constructor
		sig = null;
	}

	public Artista getQ() {
		return q;
	}

	public void setQ(Artista q) {
		this.q = q;
	}

	public NodoArt getSig() {
		return sig;
	}

	public void setSig(NodoArt sig) {
		this.sig = sig;
	}
	
}