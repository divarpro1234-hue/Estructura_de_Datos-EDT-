//Marcelo Aruquipa

public class NodoC {
	private String prenda;  //define el dato objeto persona
	private int nroCompra;
	
	private NodoC sig; //definiendo el campo enlace sig
	
	public NodoC() {  //constructor
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

	public NodoC getSig() {
		return sig;
	}

	public void setSig(NodoC sig) {
		this.sig = sig;
	}
	
}
