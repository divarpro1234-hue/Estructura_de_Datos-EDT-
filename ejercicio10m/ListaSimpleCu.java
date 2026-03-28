
public class ListaSimpleCu {
	protected NodoCu P;  //raiz de la lista
	
	public ListaSimpleCu() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoCu getP() {
		return P;
	}

	public void setP(NodoCu p) {
		P = p;
	}
	
}
