//Lic Aruquipa Marcelo
public class NodoN {
	private Numero num;
	private NodoN ant;
	private NodoN sig;
	
	NodoN(){
		this.sig = null;
		this.ant = null;
	}

	public Numero getNum() {
		return num;
	}

	public void setNum(Numero num) {
		this.num = num;
	}

	public NodoN getAnt() {
		return ant;
	}

	public void setAnt(NodoN ant) {
		this.ant = ant;
	}

	public NodoN getSig() {
		return sig;
	}

	public void setSig(NodoN sig) {
		this.sig = sig;
	}
	
}
