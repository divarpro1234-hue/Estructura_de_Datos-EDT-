
public class ListaSimpleAu {
	protected NodoAu P;  //raiz de la lista
	
	public ListaSimpleAu() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoAu getP() {
		return P;
	}

	public void setP(NodoAu p) {
		P = p;
	}
	
}
