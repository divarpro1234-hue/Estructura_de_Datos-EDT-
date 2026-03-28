
public class ListaSimpleN {
	protected NodoN P;  //raiz de la lista
	
	public ListaSimpleN() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoN getP() {
		return P;
	}

	public void setP(NodoN p) {
		P = p;
	}
	
}
