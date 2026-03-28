
public class NodoCE {
	private ClienteEsp ce;  //define el dato objeto persona
	private NodoCE sig; //definiendo el campo enlace sig
	
	public NodoCE() {  
		sig = null;
	}

	public ClienteEsp getCe() {
		return ce;
	}

	public void setCe(ClienteEsp ce) {
		this.ce = ce;
	}

	public NodoCE getSig() {
		return sig;
	}

	public void setSig(NodoCE sig) {
		this.sig = sig;
	}


	
}
