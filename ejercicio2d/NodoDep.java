//Lic Aruquipa Marcelo
public class NodoDep {
	private Departamento Dep;
	private NodoDep ant;
	private NodoDep sig;
	
	public NodoDep(){
		this.sig = null;
		this.ant = null;
	}
	
	public Departamento getDep() {
		return Dep;
	}

	public void setDep(Departamento Dep) {
		this.Dep = Dep;
	}

	public NodoDep getAnt() {
		return ant;
	}

	public void setAnt(NodoDep ant) {
		this.ant = ant;
	}

	public NodoDep getSig() {
		return sig;
	}

	public void setSig(NodoDep sig) {
		this.sig = sig;
	}
	
}
