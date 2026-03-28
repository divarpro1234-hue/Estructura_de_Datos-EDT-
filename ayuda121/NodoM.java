
public class NodoM {
	private Medico medico;  //define el dato objeto persona
	private NodoM sig; //definiendo el campo enlace sig
	
	public NodoM() {  
		sig = null;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public NodoM getSig() {
		return sig;
	}

	public void setSig(NodoM sig) {
		this.sig = sig;
	}
	
}
