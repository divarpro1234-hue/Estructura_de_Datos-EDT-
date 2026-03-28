
public class ListaSimpleV {
	protected NodoV P;  //raiz de la lista
	
	public ListaSimpleV() {
		this.P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoV getP() {
		return P;
	}

	public void setP(NodoV p) {
		P = p;
	}
	
}
