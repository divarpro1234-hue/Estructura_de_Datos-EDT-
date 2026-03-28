
public class ListaSimpleM {
	protected NodoM P;  //raiz de la lista
	
	public ListaSimpleM() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoM getP() {
		return P;
	}

	public void setP(NodoM p) {
		P = p;
	}
	
}
