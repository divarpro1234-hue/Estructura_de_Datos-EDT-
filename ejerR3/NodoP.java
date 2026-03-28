
public class NodoP {
	private Paciente paciente;  //define el dato objeto persona
	private NodoP sig; //definiendo el campo enlace sig
	
	public NodoP() {  
		sig = null;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente= paciente;
	}

	public NodoP getSig() {
		return sig;
	}

	public void setSig(NodoP sig) {
		this.sig = sig;
	}
	
}
