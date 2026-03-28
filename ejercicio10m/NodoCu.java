
public class NodoCu {
	private Cultivo cultivo;  //define el dato objeto persona
	private NodoCu sig; //definiendo el campo enlace sig
	
	public NodoCu() {  
		sig = null;
	}

	public Cultivo getCultivo() {
		return cultivo;
	}

	public void setCultivo(Cultivo cultivo) {
		this.cultivo = cultivo;
	}

	public NodoCu getSig() {
		return sig;
	}

	public void setSig(NodoCu sig) {
		this.sig = sig;
	}
	
}
