
public class NodoI {
	private Idioma idioma;  //define el dato objeto persona
	private NodoI sig; //definiendo el campo enlace sig
	
	public NodoI() {  
		sig = null;
	}

	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	public NodoI getSig() {
		return sig;
	}

	public void setSig(NodoI sig) {
		this.sig = sig;
	}
	
}
