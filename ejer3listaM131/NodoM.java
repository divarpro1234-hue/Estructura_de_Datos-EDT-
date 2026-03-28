//Lic Aruquipa Marcelo
public class NodoM {
	private String mat;
	private LD_NormalE lest;
	private NodoM ant;
	private NodoM sig;
	
	public NodoM(){
		this.sig = null;
		this.ant = null;
	}
	
	public String getMat() {
		return mat;
	}

	public void setMat(String mat) {
		this.mat = mat;
	}

	public LD_NormalE getLest() {
		return lest;
	}

	public void setLest(LD_NormalE lest) {
		this.lest = lest;
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
