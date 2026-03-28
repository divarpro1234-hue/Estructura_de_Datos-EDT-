

public class NodoBI {
	private Bien_Inmueble bien;
	
	private NodoBI sig; //definiendo el campo enlace sig
	private NodoBI ant;
	
	public NodoBI() {  //constructor
		sig = null;
		ant = null;
	}

	public NodoBI getAnt() {
		return ant;
	}

	public void setAnt(NodoBI ant) {
		this.ant = ant;
	}

	public NodoBI getSig() {
		return sig;
	}

	public void setSig(NodoBI sig) {
		this.sig = sig;
	}

	public Bien_Inmueble getBien() {
		return bien;
	}

	public void setBien(Bien_Inmueble bien) {
		this.bien = bien;
	}
	
}
