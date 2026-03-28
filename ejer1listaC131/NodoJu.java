
public class NodoJu {
	private Jugador jug;  //define el dato objeto persona
	private NodoJu sig; //definiendo el campo enlace sig
	
	public NodoJu() {  
		sig = null;
	}

	public Jugador getJug() {
		return jug;
	}

	public void setJug(Jugador jug) {
		this.jug = jug;
	}

	public NodoJu getSig() {
		return sig;
	}

	public void setSig(NodoJu sig) {
		this.sig = sig;
	}


	
}
