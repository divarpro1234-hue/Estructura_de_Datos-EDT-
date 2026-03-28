
public class ListaSimpleIng {
	protected NodoIng P;  //raiz de la lista
	
	public ListaSimpleIng() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoIng getP() {
		return P;
	}

	public void setP(NodoIng p) {
		P = p;
	}
	
}
