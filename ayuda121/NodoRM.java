//Lic Aruquipa Marcelo
public class NodoRM {
	private RecursoMedico recMed;
	private NodoRM ant;
	private NodoRM sig;
	
	public NodoRM(){
		this.sig = null;
		this.ant = null;
	}
	
	public RecursoMedico getRecMed() {
		return recMed;
	}

	public void setRecMed(RecursoMedico recMed) {
		this.recMed = recMed;
	}

	public NodoRM getAnt() {
		return ant;
	}

	public void setAnt(NodoRM ant) {
		this.ant = ant;
	}

	public NodoRM getSig() {
		return sig;
	}

	public void setSig(NodoRM sig) {
		this.sig = sig;
	}
	
}
