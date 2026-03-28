
public class NodoC {
	private Cliente cliente;  //define el dato objeto persona
	private NodoC sig; //definiendo el campo enlace sig
	
	public NodoC() {  
		sig = null;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public NodoC getSig() {
		return sig;
	}

	public void setSig(NodoC sig) {
		this.sig = sig;
	}
	
}
