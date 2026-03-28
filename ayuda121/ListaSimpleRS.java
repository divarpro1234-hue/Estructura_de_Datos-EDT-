
public class ListaSimpleRS {
	protected NodoRS P;  //raiz de la lista
	
	public ListaSimpleRS() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoRS getP() {
		return P;
	}

	public void setP(NodoRS p) {
		P = p;
	}
	
}
