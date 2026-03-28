//Lic. Marcelo Aruquipa
public class Nodo {
	private Persona per;
	private Nodo izq;
	private Nodo der;
	
	public Nodo() {
		izq = null;
		der = null;
	}
	public Nodo(Persona p) {
		this.per = p;
		izq = null;
		der = null;
	}

	public Persona getPer() {
		return per;
	}

	public void setPer(Persona per) {
		this.per = per;
	}

	public Nodo getIzq() {
		return izq;
	}

	public void setIzq(Nodo izq) {
		this.izq = izq;
	}

	public Nodo getDer() {
		return der;
	}

	public void setDer(Nodo der) {
		this.der = der;
	}
	
	
}
