
public class NodoM {
	private Mascotas mascota;  //define el dato objeto persona
	private NodoM sig; //definiendo el campo enlace sig
	
	public NodoM() {  
		sig = null;
	}

	public Mascotas getMascota() {
		return mascota;
	}

	public void setMascota(Mascotas mascota) {
		this.mascota= mascota;
	}

	public NodoM getSig() {
		return sig;
	}

	public void setSig(NodoM sig) {
		this.sig = sig;
	}
	
}
