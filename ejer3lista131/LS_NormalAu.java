
public class LS_NormalAu extends ListaSimpleAu{

	public LS_NormalAu() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Auto z) {
		NodoAu nuevo = new NodoAu();
		nuevo.setAuto(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Auto z) {
		NodoAu nuevo = new NodoAu();
		nuevo.setAuto(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoAu R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoAu R = P;   //R apunta  a la raiz P
		while(R != null) {
			R.getAuto().mostrar();
			
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoAu R = P;
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
	
	public NodoAu eliPrincipio() {
		NodoAu x = new NodoAu();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoAu eliFinal() {
		NodoAu x = new NodoAu();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoAu R = P;
				NodoAu S = P;
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
			Auto z = new Auto();
			z.leer();
			adiPrincipio(z);
		}
	}
	
	public void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Auto z = new Auto();
			z.leer();
			adiFinal(z);
		}
	}
}
