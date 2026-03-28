
public class ListaSimpleHorario {
	protected NodoHorario P;  //raiz de la lista
	
	public ListaSimpleHorario() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoHorario getP() {
		return P;
	}

	public void setP(NodoHorario p) {
		P = p;
	}
	
}
