//Lic Aruquipa Marcelo
public class NodoCC {
	private CentroConvencion cenCon;
	private NodoCC ant;
	private NodoCC sig;
	
	public NodoCC(){
		this.sig = null;
		this.ant = null;
	}
	
	public CentroConvencion getCenCon() {
		return cenCon;
	}

	public void setCenCon(CentroConvencion cenCon) {
		this.cenCon = cenCon;
	}

	public NodoCC getAnt() {
		return ant;
	}

	public void setAnt(NodoCC ant) {
		this.ant = ant;
	}

	public NodoCC getSig() {
		return sig;
	}

	public void setSig(NodoCC sig) {
		this.sig = sig;
	}
	
}
