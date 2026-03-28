//Lic Aruquipa Marcelo
public class NodoV {
	private Vuelo proy;
	private NodoV ant;
	private NodoV sig;
	
	NodoV(){
		this.sig = null;
		this.ant = null;
	}

	public Vuelo getProy() {
		return proy;
	}

	public void setProy(Vuelo proy) {
		this.proy = proy;
	}

	public NodoV getAnt() {
		return ant;
	}

	public void setAnt(NodoV ant) {
		this.ant = ant;
	}

	public NodoV getSig() {
		return sig;
	}

	public void setSig(NodoV sig) {
		this.sig = sig;
	}
	
}
