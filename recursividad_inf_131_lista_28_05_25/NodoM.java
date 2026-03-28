
public class NodoM {
	private Mensaje mensaje;  //define el mensaje objeto persona
	private NodoM sig; //definiendo el campo enlace sig
	
	public NodoM() {  //constructor
		sig = null;
	}

	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}

	public NodoM getSig() {
		return sig;
	}

	public void setSig(NodoM sig) {
		this.sig = sig;
	}
	
}
