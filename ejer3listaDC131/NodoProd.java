
public class NodoProd {
	private Producto prod;  //define el dato objeto persona
	private NodoProd sig; //definiendo el campo enlaprod sig
	
	public NodoProd() {  
		sig = null;
	}

	public Producto getProd() {
		return prod;
	}

	public void setProd(Producto prod) {
		this.prod = prod;
	}

	public NodoProd getSig() {
		return sig;
	}

	public void setSig(NodoProd sig) {
		this.sig = sig;
	}


	
}
