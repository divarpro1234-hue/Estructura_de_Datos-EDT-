
public class LS_NormalN extends ListaSimpleN{

	public LS_NormalN() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(int z) {
		NodoN nuevo = new NodoN();
		nuevo.setNum(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(int z) {
		NodoN nuevo = new NodoN();
		nuevo.setNum(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoN R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoN R = P;   //R apunta  a la raiz P
		while(R != null) {
			System.out.println(R.getNum());
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoN R = P;
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
	
	public NodoN eliPrincipio() {
		NodoN x = new NodoN();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoN eliFinal() {
		NodoN x = new NodoN();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoN R = P;
				NodoN S = P;
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
	
//	public void leer1(int n) {
//		for (int i = 1; i <= n; i++) {
//			Auto z = new Auto();
//			z.leer();
//			adiPrincipio(z);
//		}
//	}
//	
//	public void leer2(int n) {
//		for (int i = 1; i <= n; i++) {
//			Auto z = new Auto();
//			z.leer();
//			adiFinal(z);
//		}
//	}
}
