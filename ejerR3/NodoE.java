
public class NodoE {
	private Especialidad especialidad;  //define el dato objeto persona
	private NodoE sig; //definiendo el campo enlace sig
	
	public NodoE() {  
		sig = null;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad= especialidad;
	}

	public NodoE getSig() {
		return sig;
	}

	public void setSig(NodoE sig) {
		this.sig = sig;
	}
	
}
