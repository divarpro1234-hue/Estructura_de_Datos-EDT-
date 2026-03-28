
public class NodoP {
	private Proy proy;
	
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

	public Proy getProy() {
		return proy;
	}

	public void setProy(Proy proy) {
		this.proy = proy;
	}
	
}
