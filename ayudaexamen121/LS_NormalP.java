
public class LS_NormalP extends ListaSimpleP{

	public LS_NormalP() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Platillo z) {
		NodoP nuevo = new NodoP();
		nuevo.setplatillo(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      
	}
	
	public void adiFinal(Platillo z) {
		NodoP nuevo = new NodoP();
		nuevo.setplatillo(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoP R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoP R = P;   //R apunta  a la raiz P
		while(R != null) {
			R.getplatillo().mostrar();
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoP R = P;
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
	
	public NodoP eliPrincipio() {
		NodoP x = new NodoP();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoP eliFinal() {
		NodoP x = new NodoP();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoP R = P;
				NodoP S = P;
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
			Platillo z = new Platillo();
			z.leer();
			adiPrincipio(z);
		}
	}
	
	public void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Platillo z = new Platillo();
			z.leer();
			adiFinal(z);
		}
	}
}
