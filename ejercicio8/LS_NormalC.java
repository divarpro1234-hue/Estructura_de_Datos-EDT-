
public class LS_NormalC extends ListaSimpleC{

	public LS_NormalC() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Cliente z) {
		NodoC nuevo = new NodoC();
		nuevo.setCliente(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      
	}
	
	public void adiFinal(Cliente z) {
		NodoC nuevo = new NodoC();
		nuevo.setCliente(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoC R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoC R = P;   //R apunta  a la raiz P
		while(R != null) {
			
			R.getCliente().mostrar();
			
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoC R = P;
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
	
	public NodoC eliPrincipio() {
		NodoC x = new NodoC();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoC eliFinal() {
		NodoC x = new NodoC();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoC R = P;
				NodoC S = P;
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
			Cliente z = new Cliente();
			z.leer();
			adiPrincipio(z);
		}
	}
	
	public void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Cliente z = new Cliente();
			z.leer();
			adiFinal(z);
		}
	}
}
