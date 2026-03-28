
public class ListaSimpleN {
	protected NodoNum P;  //raiz de la lista
	
	public ListaSimpleN() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoNum getP() {
		return P;
	}

	public void setP(NodoNum p) {
		P = p;
	}
	
}
