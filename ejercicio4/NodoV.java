
public class NodoV {
	private Vehiculo vehiculo;  //define el dato objeto persona
	private NodoV sig; //definiendo el campo enlace sig
	
	public NodoV() {  
		sig = null;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public NodoV getSig() {
		return sig;
	}

	public void setSig(NodoV sig) {
		this.sig = sig;
	}
	
}
