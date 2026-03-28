
public class ListaSimpleA {
	protected NodoA P;  //raiz de la lista
	
	public ListaSimpleA() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoA getP() {
		return P;
	}

	public void setP(NodoA p) {
		P = p;
	}
	
}
