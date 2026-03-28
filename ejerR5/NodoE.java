
public class NodoE {
	private Estudiante estudiante;  //define el dato objeto persona
	private NodoE sig; //definiendo el campo enlace sig
	
	public NodoE() {  
		sig = null;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante= estudiante;
	}

	public NodoE getSig() {
		return sig;
	}

	public void setSig(NodoE sig) {
		this.sig = sig;
	}
	
}
