

public class NodoH {
	private Habitacion hab;
	
	private NodoH sig; //definiendo el campo enlace sig
	private NodoH ant;
	
	public NodoH() {  //constructor
		sig = null;
		ant = null;
	}

	public NodoH getAnt() {
		return ant;
	}

	public void setAnt(NodoH ant) {
		this.ant = ant;
	}

	public NodoH getSig() {
		return sig;
	}

	public void setSig(NodoH sig) {
		this.sig = sig;
	}

	public Habitacion getHab() {
		return hab;
	}

	public void setHab(Habitacion hab) {
		this.hab = hab;
	}
	
}
