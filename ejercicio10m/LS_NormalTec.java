
public class LS_NormalTec extends ListaSimpleTec{

	public LS_NormalTec() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Tecnologia z) {
		NodoTec nuevo = new NodoTec();
		nuevo.setTec(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      
	}
	
	public void adiFinal(Tecnologia z) {
		NodoTec nuevo = new NodoTec();
		nuevo.setTec(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoTec R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoTec R = P;   //R apunta  a la raiz P
		while(R != null) {
			R.getTec().mostrar();
			
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoTec R = P;
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
	
	public NodoTec eliPrincipio() {
		NodoTec x = new NodoTec();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoTec eliFinal() {
		NodoTec x = new NodoTec();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoTec R = P;
				NodoTec S = P;
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
			Tecnologia z = new Tecnologia();
			z.leer();
			adiPrincipio(z);
		}
	}
	
	public void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Tecnologia z = new Tecnologia();
			z.leer();
			adiFinal(z);
		}
	}
}
