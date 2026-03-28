
public class NodoMat {
	private Materia mat;
	
	private NodoMat sig; //definiendo el campo enlace sig
	private NodoMat ant;
	
	public NodoMat() {  //constructor
		sig = null;
		ant = null;
	}

	public NodoMat getAnt() {
		return ant;
	}

	public void setAnt(NodoMat ant) {
		this.ant = ant;
	}

	public NodoMat getSig() {
		return sig;
	}

	public void setSig(NodoMat sig) {
		this.sig = sig;
	}

	public Materia getMat() {
		return mat;
	}

	public void setMat(Materia mat) {
		this.mat = mat;
	}
	
}
