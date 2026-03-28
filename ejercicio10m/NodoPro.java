
public class NodoPro {
	private Produccion produccion;  //define el dato objeto persona
	private NodoPro sig; //definiendo el campo enlace sig
	
	public NodoPro() {  
		sig = null;
	}

	public Produccion getProduccion() {
		return produccion;
	}

	public void setProduccion(Produccion produccion) {
		this.produccion = produccion;
	}

	public NodoPro getSig() {
		return sig;
	}

	public void setSig(NodoPro sig) {
		this.sig = sig;
	}
	
}
