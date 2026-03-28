
public class LS_NormalH extends ListaSimpleH{

	public LS_NormalH() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Hogar z) {
		NodoH nuevo = new NodoH();
		nuevo.setHogar(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      
	}
	
	public void adiFinal(Hogar z) {
		NodoH nuevo = new NodoH();
		nuevo.setHogar(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoH R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoH R = P;   //R apunta  a la raiz P
		while(R != null) {
			R.getHogar().mostrar();
			
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoH R = P;
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
	
	public NodoH eliPrincipio() {
		NodoH x = new NodoH();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoH eliFinal() {
		NodoH x = new NodoH();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoH R = P;
				NodoH S = P;
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
			Hogar z = new Hogar();
			z.leer();
			adiPrincipio(z);
		}
	}
	
	public void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Hogar z = new Hogar();
			z.leer();
			adiFinal(z);
		}
	}
}
