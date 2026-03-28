
public class NodoP {
	private Participante par;  //define el dato objeto persona
	private NodoP sig; //definiendo el campo enlace sig
	
	public NodoP() {  
		sig = null;
	}

	public Participante getPar() {
		return par;
	}

	public void setPar(Participante par) {
		this.par = par;
	}

	public NodoP getSig() {
		return sig;
	}

	public void setSig(NodoP sig) {
		this.sig = sig;
	}
	
}
