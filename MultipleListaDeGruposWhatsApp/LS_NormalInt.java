public class LS_NormalInt extends ListaSimpleInt{

	public LS_NormalInt() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Integrantes z) {
		NodoInt nuevo = new NodoInt();
		nuevo.setInteg(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Integrantes z) {
		NodoInt nuevo = new NodoInt();
		nuevo.setInteg(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoInt R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoInt R = P;   //R apunta  a la raiz P
		while(R != null) {
			R.getInteg().mostrar();
			
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoInt R = P;
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
	
	public NodoInt eliPrincipio() {
		NodoInt x = new NodoInt();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoInt eliFinal() {
		NodoInt x = new NodoInt();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoInt R = P;
				NodoInt S = P;
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
			Integrantes z = new Integrantes();
			z.leer();
			adiPrincipio(z);
		}
	}
	
	public void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Integrantes z = new Integrantes();
			z.leer();
			adiFinal(z);
		}
	}
}

