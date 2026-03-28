
public class NodoNP1 {
	private String nota1;  //define el dato objeto persona
	private NodoNP1 sig; //definiendo el campo enlace sig
	
	
	public NodoNP1(String nota1) {
		this.nota1 = nota1;
	}
	public NodoNP1() {  
		sig = null;
	}
	
	public NodoNP1 getSig() {
		return sig;
	}

	public void setSig(NodoNP1 sig) {
		this.sig = sig;
	}

	public String getNota1() {
		return nota1;
	}

	public void setNota1(String nota1) {
		this.nota1 = nota1;
	}
	
}
