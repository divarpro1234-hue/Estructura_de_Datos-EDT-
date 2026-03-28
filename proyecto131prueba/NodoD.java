//Lic Aruquipa Marcelo
public class NodoD {
	private Diagnostico d;
	private NodoD ant;
	private NodoD sig;
	
	public NodoD(){
		this.sig = null;
		this.ant = null;
	}
	
	public Diagnostico getMateria() {
		return materia;
	}

	public void setMateria(Diagnostico materia) {
		this.materia = materia;
	}

	public NodoD getAnt() {
		return ant;
	}

	public void setAnt(NodoD ant) {
		this.ant = ant;
	}

	public NodoD getSig() {
		return sig;
	}

	public void setSig(NodoD sig) {
		this.sig = sig;
	}
	
}
