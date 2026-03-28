
public class NodoN {
	private int num;  //define el auto objeto persona
	private NodoN sig; //definiendo el campo enlace sig
	
	public NodoN() {  //constructor
		sig = null;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public NodoN getSig() {
		return sig;
	}

	public void setSig(NodoN sig) {
		this.sig = sig;
	}
	
}
