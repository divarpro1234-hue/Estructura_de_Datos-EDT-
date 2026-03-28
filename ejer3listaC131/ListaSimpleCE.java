
public class ListaSimpleCE {
	protected NodoCE P;  //raiz de la lista
	
	public ListaSimpleCE() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoCE getP() {
		return P;
	}

	public void setP(NodoCE p) {
		P = p;
	}
	
}
