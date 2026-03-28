//Lic Aruquipa Marcelo
public class NodoProductora {
	private Productora productora;
	private NodoProductora ant;
	private NodoProductora sig;
	
	public NodoProductora(){
		this.sig = null;
		this.ant = null;
	}
	
	public Productora getProductora() {
		return productora;
	}

	public void setProductora(Productora productora) {
		this.productora = productora;
	}

	public NodoProductora getAnt() {
		return ant;
	}

	public void setAnt(NodoProductora ant) {
		this.ant = ant;
	}

	public NodoProductora getSig() {
		return sig;
	}

	public void setSig(NodoProductora sig) {
		this.sig = sig;
	}
	
}
