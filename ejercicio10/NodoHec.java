
public class NodoHec {
	private Hechizo hechizo;  //define el dato objeto persona
	private NodoHec sig; //definiendo el campo enlace sig
	
	public NodoHec() {  
		sig = null;
	}

	public Hechizo getHechizo() {
		return hechizo;
	}

	public void setHechizo(Hechizo hechizo) {
		this.hechizo = hechizo;
	}

	public NodoHec getSig() {
		return sig;
	}

	public void setSig(NodoHec sig) {
		this.sig = sig;
	}
	
}
