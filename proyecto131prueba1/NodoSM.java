//Lic Aruquipa Marcelo
public class NodoSM {
	private SeguimientoMedico sm;
	private NodoSM ant;
	private NodoSM sig;
	
	NodoSM(){
		this.sig = null;
		this.ant = null;
	}

	public SeguimientoMedico getSm() {
		return sm;
	}

	public void setSm(SeguimientoMedico sm) {
		this.sm = sm;
	}

	public NodoSM getAnt() {
		return ant;
	}

	public void setAnt(NodoSM ant) {
		this.ant = ant;
	}

	public NodoSM getSig() {
		return sig;
	}

	public void setSig(NodoSM sig) {
		this.sig = sig;
	}
	
}
