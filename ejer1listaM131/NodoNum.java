
public class NodoNum {
	private Numero num;  //define el num objeto persona
	private NodoNum sig; //definiendo el campo enlace sig
	
	public NodoNum() {  //constructor
		sig = null;
	}

	public Numero getNum() {
		return num;
	}

	public void setNum(Numero num) {
		this.num = num;
	}

	public NodoNum getSig() {
		return sig;
	}

	public void setSig(NodoNum sig) {
		this.sig = sig;
	}
	
}
