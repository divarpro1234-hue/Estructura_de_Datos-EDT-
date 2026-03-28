
public class ListaSimpleMag {
	protected NodoMag P;  //raiz de la lista
	
	public ListaSimpleMag() {
		this.P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoMag getP() {
		return P;
	}

	public void setP(NodoMag p) {
		P = p;
	}
	
}
