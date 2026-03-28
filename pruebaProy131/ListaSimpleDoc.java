
public class ListaSimpleDoc {
	protected NodoDoc P;  //raiz de la lista
	
	public ListaSimpleDoc() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoDoc getP() {
		return P;
	}

	public void setP(NodoDoc p) {
		P = p;
	}
	
}
