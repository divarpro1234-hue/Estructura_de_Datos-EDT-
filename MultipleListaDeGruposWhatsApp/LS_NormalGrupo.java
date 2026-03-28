public class LS_NormalGrupo extends ListaSimpleGrupo{

	public LS_NormalGrupo() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Grupo z) {
		NodoGrupo nuevo = new NodoGrupo();
		nuevo.setGrupo(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Grupo z) {
		NodoGrupo nuevo = new NodoGrupo();
		nuevo.setGrupo(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoGrupo R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoGrupo R = P;   //R apunta  a la raiz P
		while(R != null) {
			R.getGrupo().mostrar();
			
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoGrupo R = P;
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
	
	public NodoGrupo eliPrincipio() {
		NodoGrupo x = new NodoGrupo();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoGrupo eliFinal() {
		NodoGrupo x = new NodoGrupo();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoGrupo R = P;
				NodoGrupo S = P;
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
			Grupo z = new Grupo();
			z.leer();
			adiPrincipio(z);
		}
	}
	
	public void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Grupo z = new Grupo();
			z.leer();
			adiFinal(z);
		}
	}
}

