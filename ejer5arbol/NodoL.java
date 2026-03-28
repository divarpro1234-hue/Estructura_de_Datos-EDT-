//Lic. Marcelo Aruquipa
public class NodoL {
	private Libro libro;
	private NodoL izq;
	private NodoL der;
	
	public NodoL() {
		izq = null;
		der = null;
	}
	public NodoL(Libro p) {
		this.libro = p;
		izq = null;
		der = null;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public NodoL getIzq() {
		return izq;
	}

	public void setIzq(NodoL izq) {
		this.izq = izq;
	}

	public NodoL getDer() {
		return der;
	}

	public void setDer(NodoL der) {
		this.der = der;
	}
	
	
}
