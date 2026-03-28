public class LS_NormalAdmin extends ListaSimpleAdmin{

	public LS_NormalAdmin() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Admin z) {
		NodoAdmin nuevo = new NodoAdmin();
		nuevo.setAdmin(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Admin z) {
		NodoAdmin nuevo = new NodoAdmin();
		nuevo.setAdmin(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoAdmin R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoAdmin R = P;   //R apunta  a la raiz P
		while(R != null) {
			R.getAdmin().mostrar();
			
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoAdmin R = P;
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
	
	public NodoAdmin eliPrincipio() {
		NodoAdmin x = new NodoAdmin();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoAdmin eliFinal() {
		NodoAdmin x = new NodoAdmin();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoAdmin R = P;
				NodoAdmin S = P;
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
			Admin z = new Admin();
			z.leer();
			adiPrincipio(z);
		}
	}
	
	public void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Admin z = new Admin();
			z.leer();
			adiFinal(z);
		}
	}
}

