
public class ListaSimpleHec {
	protected NodoHec P;  //raiz de la lista
	
	public ListaSimpleHec() {
		this.P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoHec getP() {
		return P;
	}

	public void setP(NodoHec p) {
		P = p;
	}
	
}
