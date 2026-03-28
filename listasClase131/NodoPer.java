
public class NodoPer {
	private Persona dato;  //define el dato objeto persona
	private NodoPer sig; //definiendo el campo enlace sig
	
	public NodoPer() {  //constructor
		sig = null;
	}

	public Persona getDato() {
		return dato;
	}

	public void setDato(Persona dato) {
		this.dato = dato;
	}

	public NodoPer getSig() {
		return sig;
	}

	public void setSig(NodoPer sig) {
		this.sig = sig;
	}
	
}
