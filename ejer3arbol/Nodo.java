//Lic. Marcelo Aruquipa
public class Nodo {
	private String letra;
	private Nodo izq;
	private Nodo der;
	
	public Nodo() {
		izq = null;
		der = null;
	}
	public Nodo(String p) {
		this.letra = p;
		izq = null;
		der = null;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
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
