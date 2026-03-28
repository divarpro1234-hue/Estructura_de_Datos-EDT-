
public class NodoC {
	private Conductor conductor;  //define el dato objeto persona
	private NodoC sig; //definiendo el campo enlace sig
	
	public NodoC() {  
		sig = null;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public NodoC getSig() {
		return sig;
	}

	public void setSig(NodoC sig) {
		this.sig = sig;
	}
	
}
