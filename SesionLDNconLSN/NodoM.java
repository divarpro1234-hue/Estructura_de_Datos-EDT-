//Lic Aruquipa Marcelo
public class NodoM {
	private Materia materia;
	private NodoM ant;
	private NodoM sig;
	
	public NodoM(){
		this.sig = null;
		this.ant = null;
	}
	
	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public NodoM getAnt() {
		return ant;
	}

	public void setAnt(NodoM ant) {
		this.ant = ant;
	}

	public NodoM getSig() {
		return sig;
	}

	public void setSig(NodoM sig) {
		this.sig = sig;
	}
	
}
