
public class ListaSimpleJu {
	protected NodoJu P;  //raiz de la lista
	
	public ListaSimpleJu() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoJu getP() {
		return P;
	}

	public void setP(NodoJu p) {
		P = p;
	}
	
}
