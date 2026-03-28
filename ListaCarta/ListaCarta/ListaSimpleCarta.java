package ListaCarta;
public class ListaSimpleCarta {
	protected NodoRem P;  //raiz de la lista
	
	public ListaSimpleCarta() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoRem getP() {
		return P;
	}

	public void setP(NodoRem p) {
		P = p;
	}

}
