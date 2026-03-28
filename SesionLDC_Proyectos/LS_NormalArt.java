public class LS_NormalArt extends ListaSimpleArt{

	public LS_NormalArt() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Artista q) {
		NodoArt nuevo = new NodoArt();
		nuevo.setQ(q);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Artista q) {
		NodoArt nuevo = new NodoArt();
		nuevo.setQ(q);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoArt R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoArt R = P;   //R apunta  a la raiz P
		while(R != null) {
			R.getQ().mostrar();
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoArt R = P;
		int c = 0;
		if(this.esVacia())
			return 0;
		else {
			while(R != null) {
				c++;
				R = R.getSig();
			}
		}
		return c;
	}
	
	public NodoArt eliPrincipio() {
		NodoArt x = new NodoArt();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoArt eliFinal() {
		NodoArt x = new NodoArt();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoArt R = P;
				NodoArt S = P;
				while(R.getSig() != null) {
					S = R;         //S apunta a R
					R = R.getSig(); //R apunta al siguiente de R
				}
				x = R;
				S.setSig(null);
			}
		}
		return x;
	}
	
	public void leer1(int n) {
		for (int i = 1; i <= n; i++) {
			Artista q = new Artista();
			q.leer();
			adiPrincipio(q);
		}
	}
	
	public void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Artista q = new Artista();
			q.leer();
			adiFinal(q);
		}
	}
}