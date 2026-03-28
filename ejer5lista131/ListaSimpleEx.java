
public class ListaSimpleEx {
	protected NodoEx P;  //raiz de la lista
	
	public ListaSimpleEx() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoEx getP() {
		return P;
	}

	public void setP(NodoEx p) {
		P = p;
	}
	
}
