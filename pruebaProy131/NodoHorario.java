
public class NodoHorario {
	private Horario dato;  //define el dato objeto persona
	private NodoHorario sig; //definiendo el campo enlace sig
	
	public NodoHorario() {  //constructor
		sig = null;
	}

	public Horario getDato() {
		return dato;
	}

	public void setDato(Horario dato) {
		this.dato = dato;
	}

	public NodoHorario getSig() {
		return sig;
	}

	public void setSig(NodoHorario sig) {
		this.sig = sig;
	}
	
}
