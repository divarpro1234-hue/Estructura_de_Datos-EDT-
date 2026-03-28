

public class NodoFA {
	private F_Agropecuaria f_agro;
	
	private NodoFA sig; //definiendo el campo enlace sig
	private NodoFA ant;
	
	public NodoFA() {  //constructor
		sig = null;
		ant = null;
	}

	public NodoFA getAnt() {
		return ant;
	}

	public void setAnt(NodoFA ant) {
		this.ant = ant;
	}

	public NodoFA getSig() {
		return sig;
	}

	public void setSig(NodoFA sig) {
		this.sig = sig;
	}

	public F_Agropecuaria getF_agro() {
		return f_agro;
	}

	public void setF_agro(F_Agropecuaria f_agro) {
		this.f_agro = f_agro;
	}
	
}
