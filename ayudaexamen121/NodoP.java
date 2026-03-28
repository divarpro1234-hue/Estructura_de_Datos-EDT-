
public class NodoP {
	private Platillo platillo;  //define el dato objeto persona
	private NodoP sig; //definiendo el campo enlace sig
	
	public NodoP() {  
		sig = null;
	}

	public Platillo getplatillo() {
		return platillo;
	}

	public void setplatillo(Platillo platillo) {
		this.platillo = platillo;
	}

	public NodoP getSig() {
		return sig;
	}

	public void setSig(NodoP sig) {
		this.sig = sig;
	}
	
}
