package lugaresventas;

public class ListaDobleLug {
     protected NodoLug P;  //raiz de la lista
	
	public ListaDobleLug() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

    public NodoLug getP() {
        return P;
    }

    public void setP(NodoLug P) {
        this.P = P;
    }
        

}
