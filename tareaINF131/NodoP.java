
public class NodoP {
	private Pasajero dato;  //define el dato objeto persona
	private NodoP sig; //definiendo el campo enladato sig
	
	public NodoP() {  
		sig = null;
	}

	public Pasajero getDato() {
		return dato;
	}

	public void setDato(Pasajero dato) {
		this.dato = dato;
	}

	public NodoP getSig() {
		return sig;
	}

	public void setSig(NodoP sig) {
		this.sig = sig;
	}


	
}
