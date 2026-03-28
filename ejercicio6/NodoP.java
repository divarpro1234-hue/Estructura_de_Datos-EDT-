
public class NodoP {
	private Pais pais;  //define el dato objeto persona
	private NodoP sig; //definiendo el campo enlace sig
	
	public NodoP() {  
		sig = null;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public NodoP getSig() {
		return sig;
	}

	public void setSig(NodoP sig) {
		this.sig = sig;
	}
	
}
