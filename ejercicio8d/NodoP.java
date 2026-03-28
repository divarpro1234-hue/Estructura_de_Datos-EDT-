
public class NodoP {
	private Pais pais;
	
	private NodoP sig; //definiendo el campo enlace sig
	private NodoP ant;
	
	public NodoP() {  //constructor
		sig = null;
		ant = null;
	}

	public NodoP getAnt() {
		return ant;
	}

	public void setAnt(NodoP ant) {
		this.ant = ant;
	}

	public NodoP getSig() {
		return sig;
	}

	public void setSig(NodoP sig) {
		this.sig = sig;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
}
