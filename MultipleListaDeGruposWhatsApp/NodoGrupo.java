//Lic Aruquipa Marcelo
public class NodoGrupo {
	private Grupo grupo;
	private NodoGrupo sig;
	
	public NodoGrupo(){
		this.sig = null;
	}
	
	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	public NodoGrupo getSig() {
		return sig;
	}

	public void setSig(NodoGrupo sig) {
		this.sig = sig;
	}
	
}
