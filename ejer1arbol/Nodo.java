//Lic. Marcelo Aruquipa
public class Nodo {
	private int num;
	private Nodo izq;
	private Nodo der;
	
	public Nodo() {
		izq = null;
		der = null;
	}
	public Nodo(int p) {
		this.num = p;
		izq = null;
		der = null;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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
