
public class NodoDoc {
	private Docente dato;  //define el dato objeto persona
	private NodoDoc sig; //definiendo el campo enlace sig
	
	public NodoDoc() {  
		sig = null;
	}

	public Docente getDato() {
		return dato;
	}

	public void setDato(Docente dato) {
		this.dato = dato;
	}

	public NodoDoc getSig() {
		return sig;
	}

	public void setSig(NodoDoc sig) {
		this.sig = sig;
	}


	
}
