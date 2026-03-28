//Lic Aruquipa Marcelo
public class NodoChar {
	private char car;
	private NodoChar ant;
	private NodoChar sig;
	
	NodoChar(){
		this.sig = null;
		this.ant = null;
	}

	public char getCar() {
		return car;
	}

	public void setCar(char car) {
		this.car = car;
	}

	public NodoChar getAnt() {
		return ant;
	}

	public void setAnt(NodoChar ant) {
		this.ant = ant;
	}

	public NodoChar getSig() {
		return sig;
	}

	public void setSig(NodoChar sig) {
		this.sig = sig;
	}
	
}
