
public class ListaSimpleI {
	protected NodoI P;  //raiz de la lista
	
	public ListaSimpleI() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoI getP() {
		return P;
	}

	public void setP(NodoI p) {
		P = p;
	}
	
}
