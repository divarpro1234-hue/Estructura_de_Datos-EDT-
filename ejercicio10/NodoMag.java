
public class NodoMag {
	private Mago mago;  //define el dato objeto persona
	private NodoMag sig; //definiendo el campo enlace sig
	
	public NodoMag() {  
		sig = null;
	}

	public Mago getMago() {
		return mago;
	}

	public void setMago(Mago mago) {
		this.mago = mago;
	}

	public NodoMag getSig() {
		return sig;
	}

	public void setSig(NodoMag sig) {
		this.sig = sig;
	}
	
}
