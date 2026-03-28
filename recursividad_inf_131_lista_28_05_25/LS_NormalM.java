
public class LS_NormalM extends ListaSimpleM{

	public LS_NormalM() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Mensaje z) {
		NodoM nuevo = new NodoM();
		nuevo.setMensaje(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Mensaje z) {
		NodoM nuevo = new NodoM();
		nuevo.setMensaje(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoM R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoM R = P;   //R apunta  a la raiz P
		while(R != null) {
			R.getMensaje().mostrar();
			
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoM R = P;
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
	
	public NodoM eliPrincipio() {
		NodoM x = new NodoM();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoM eliFinal() {
		NodoM x = new NodoM();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoM R = P;
				NodoM S = P;
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
			Mensaje z = new Mensaje();
			z.leer();
			adiPrincipio(z);
		}
	}
	
	public void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Mensaje z = new Mensaje();
			z.leer();
			adiFinal(z);
		}
	}
}
