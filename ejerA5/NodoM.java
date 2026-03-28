//Lic. Marcelo Aruquipa
public class NodoM {
	private Mascota mascota;
	private NodoM izq;
	private NodoM der;
	
	public NodoM() {
		izq = null;
		der = null;
	}
	public NodoM(Mascota p) {
		this.mascota = p;
		izq = null;
		der = null;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public NodoM getIzq() {
		return izq;
	}

	public void setIzq(NodoM izq) {
		this.izq = izq;
	}

	public NodoM getDer() {
		return der;
	}

	public void setDer(NodoM der) {
		this.der = der;
	}
	
	
}
