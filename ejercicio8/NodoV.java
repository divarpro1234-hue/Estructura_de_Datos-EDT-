
public class NodoV {
	private Venta venta;  //define el dato objeto persona
	private NodoV sig; //definiendo el campo enlace sig
	
	public NodoV() {  
		sig = null;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public NodoV getSig() {
		return sig;
	}

	public void setSig(NodoV sig) {
		this.sig = sig;
	}
	
}
