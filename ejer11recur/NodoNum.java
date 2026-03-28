
public class NodoNum {
	private int num;  //define el num objeto persona
	private NodoNum sig; //definiendo el campo enlace sig
	
	public NodoNum() {  //constructor
		sig = null;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public NodoNum getSig() {
		return sig;
	}

	public void setSig(NodoNum sig) {
		this.sig = sig;
	}
	
}
