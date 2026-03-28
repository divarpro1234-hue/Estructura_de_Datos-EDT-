//Lic Aruquipa Marcelo
public class NodoM {
	private Mascota mascota;
	private NodoM ant;
	private NodoM sig;
	
	public NodoM(){
		this.sig = null;
		this.ant = null;
	}
	
	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
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
