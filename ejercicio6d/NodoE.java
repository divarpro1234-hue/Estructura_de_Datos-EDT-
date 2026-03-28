
public class NodoE {
	private Estudiante est;
	
	private NodoE sig; //definiendo el campo enlace sig
	private NodoE ant;
	
	public NodoE() {  //constructor
		sig = null;
		ant = null;
	}

	public NodoE getAnt() {
		return ant;
	}

	public void setAnt(NodoE ant) {
		this.ant = ant;
	}

	public NodoE getSig() {
		return sig;
	}

	public void setSig(NodoE sig) {
		this.sig = sig;
	}

	public Estudiante getEst() {
		return est;
	}

	public void setEst(Estudiante est) {
		this.est = est;
	}
	
}
