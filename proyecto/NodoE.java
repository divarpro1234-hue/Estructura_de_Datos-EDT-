
public class NodoE {
    private Evento evento;   // Objeto de tipo Materia
    private NodoE sig;   // Enlace al siguiente nodo

    // Getters y Setters
    public NodoE() {
        this.sig = null;
    }

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public NodoE getSig() {
		return sig;
	}

	public void setSig(NodoE sig) {
		this.sig = sig;
	}
}
