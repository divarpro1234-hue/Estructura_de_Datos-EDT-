
public class NodoC {
	private Comite com;
	
	private NodoC sig; //definiendo el campo enlace sig
	private NodoC ant;
	
	public NodoC() {  //constructor
		sig = null;
		ant = null;
	}

	public NodoC getAnt() {
		return ant;
	}

	public void setAnt(NodoC ant) {
		this.ant = ant;
	}

	public NodoC getSig() {
		return sig;
	}

	public void setSig(NodoC sig) {
		this.sig = sig;
	}

	public Comite getCom() {
		return com;
	}

	public void setCom(Comite com) {
		this.com = com;
	}
	
}
