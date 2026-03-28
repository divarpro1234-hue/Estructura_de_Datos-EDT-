//Lic Aruquipa Marcelo
public class NodoMN {
	private M_num l_Num;
	private NodoMN ant;
	private NodoMN sig;
	
	NodoMN(){
		this.sig = null;
		this.ant = null;
	}

	public M_num getL_Num() {
		return l_Num;
	}

	public void setL_Num(M_num l_Num) {
		this.l_Num = l_Num;
	}

	public NodoMN getAnt() {
		return ant;
	}

	public void setAnt(NodoMN ant) {
		this.ant = ant;
	}

	public NodoMN getSig() {
		return sig;
	}

	public void setSig(NodoMN sig) {
		this.sig = sig;
	}
	
}
