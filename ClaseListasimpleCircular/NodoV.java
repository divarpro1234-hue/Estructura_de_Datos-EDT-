public class NodoV {
	private String prenda;  //define el dato objeto persona
	private int nroCompra;
	
	private NodoV sig; //definiendo el campo enlace sig
	
	public NodoV() {  //constructor
		sig = null;
	}

	public String getPrenda() {
		return prenda;
	}

	public void setPrenda(String prenda) {
		this.prenda = prenda;
	}

	public int getNroCompra() {
		return nroCompra;
	}

	public void setNroCompra(int nroCompra) {
		this.nroCompra = nroCompra;
	}

	public NodoV getSig() {
		return sig;
	}

	public void setSig(NodoV sig) {
		this.sig = sig;
	}
	
}