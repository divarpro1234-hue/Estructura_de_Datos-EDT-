//Lic Aruquipa Marcelo
public class NodoM {
	private Mascota mas;
	private NodoM ant;
	private NodoM sig;
	
	NodoM(){
		this.sig = null;
		this.ant = null;
	}

	public Mascota getMas() {
		return mas;
	}

	public void setMas(Mascota mas) {
		this.mas = mas;
	}

	public NodoM getAnt() {
		return ant;
	}

	public void setAnt(NodoM ant) {
		this.ant = ant;
	}

	public NodoM getSig() {
		return sig;
	}

	public void setSig(NodoM sig) {
		this.sig = sig;
	}
	
}
