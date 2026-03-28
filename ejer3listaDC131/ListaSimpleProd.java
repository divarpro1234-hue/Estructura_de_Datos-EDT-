
public class ListaSimpleProd {
	protected NodoProd P;  //raiz de la lista
	
	public ListaSimpleProd() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoProd getP() {
		return P;
	}

	public void setP(NodoProd p) {
		P = p;
	}
	
}
