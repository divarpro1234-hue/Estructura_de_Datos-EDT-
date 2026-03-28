
public class ListaSimpleH {
	protected NodoH P;  //raiz de la lista
	
	public ListaSimpleH() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoH getP() {
		return P;
	}

	public void setP(NodoH p) {
		P = p;
	}
	
}
