//Lic Aruquipa Marcelo
public class NodoPer {
	private Persona per;
	private NodoPer ant;
	private NodoPer sig;
	
	public NodoPer(){
		this.sig = null;
		this.ant = null;
	}
	
	public Persona getPer() {
		return per;
	}

	public void setPer(Persona per) {
		this.per = per;
	}

	public NodoPer getAnt() {
		return ant;
	}

	public void setAnt(NodoPer ant) {
		this.ant = ant;
	}

	public NodoPer getSig() {
		return sig;
	}

	public void setSig(NodoPer sig) {
		this.sig = sig;
	}
	
}
