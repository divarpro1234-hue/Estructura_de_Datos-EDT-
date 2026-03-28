
public class ListaSimpleC {
	protected NodoC P;  //raiz de la lista
	
	public ListaSimpleC() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoC getP() {
		return P;
	}

	public void setP(NodoC p) {
		P = p;
	}
	
}
