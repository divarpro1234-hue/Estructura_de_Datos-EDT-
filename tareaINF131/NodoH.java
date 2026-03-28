
public class NodoH {
	private Horario dato;  //define el dato objeto persona
	private NodoH sig; //definiendo el campo enlace sig
	
	public NodoH() {  //constructor
		sig = null;
	}

	public Horario getDato() {
		return dato;
	}

	public void setDato(Horario dato) {
		this.dato = dato;
	}

	public NodoH getSig() {
		return sig;
	}

	public void setSig(NodoH sig) {
		this.sig = sig;
	}
	
}
