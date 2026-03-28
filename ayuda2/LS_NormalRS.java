
public class LS_NormalRS extends ListaSimpleRS{

	public LS_NormalRS() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(RegistroSalud z) {
		NodoRS nuevo = new NodoRS();
		nuevo.setRegSalud(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      
	}
	
	public void adiFinal(RegistroSalud z) {
		NodoRS nuevo = new NodoRS();
		nuevo.setRegSalud(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoRS R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoRS R = P;   //R apunta  a la raiz P
		while(R != null) {
			R.getRegSalud().mostrar();
			
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoRS R = P;
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
	
	public NodoRS eliPrincipio() {
		NodoRS x = new NodoRS();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoRS eliFinal() {
		NodoRS x = new NodoRS();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoRS R = P;
				NodoRS S = P;
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
			RegistroSalud z = new RegistroSalud();
			z.leer();
			adiPrincipio(z);
		}
	}
	
	public void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			RegistroSalud z = new RegistroSalud();
			z.leer();
			adiFinal(z);
		}
	}
}
