

public class NodoRS {
	private RegistroSalud regSalud;  //define el dato objeto persona
	private NodoRS sig; //definiendo el campo enlace sig
	
	public NodoRS() {  
		sig = null;
	}

	public RegistroSalud getRegSalud() {
		return regSalud;
	}

	public void setRegSalud(RegistroSalud regSalud) {
		this.regSalud = regSalud;
	}

	public NodoRS getSig() {
		return sig;
	}

	public void setSig(NodoRS sig) {
		this.sig = sig;
	}
	
}
