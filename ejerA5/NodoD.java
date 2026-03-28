//Lic. Marcelo Aruquipa
public class NodoD {
	private Dueño duenio;
	private NodoD izq;
	private NodoD der;
	
	public NodoD() {
		izq = null;
		der = null;
	}
	public NodoD(Dueño p) {
		this.duenio = p;
		izq = null;
		der = null;
	}

	public Dueño getDuenio() {
		return duenio;
	}

	public void setDuenio(Dueño duenio) {
		this.duenio = duenio;
	}

	public NodoD getIzq() {
		return izq;
	}

	public void setIzq(NodoD izq) {
		this.izq = izq;
	}

	public NodoD getDer() {
		return der;
	}

	public void setDer(NodoD der) {
		this.der = der;
	}
	
	
}
