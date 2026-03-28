public class ListaSimpleArt {
	protected NodoArt P;  //raiz de la lista
	
	public ListaSimpleArt() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoArt getP() {
		return P;
	}

	public void setP(NodoArt p) {
		P = p;
	}
	
}