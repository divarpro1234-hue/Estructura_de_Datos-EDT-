
public class NodoH {
	private Hogar hogar;  //define el dato objeto persona
	private NodoH sig; //definiendo el campo enlace sig
	
	public NodoH() {  
		sig = null;
	}

	public Hogar getHogar() {
		return hogar;
	}

	public void setHogar(Hogar hogar) {
		this.hogar= hogar;
	}

	public NodoH getSig() {
		return sig;
	}

	public void setSig(NodoH sig) {
		this.sig = sig;
	}
	
}
