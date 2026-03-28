
public class LS_NormalI extends ListaSimpleI{

	public LS_NormalI() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Idioma z) {
		NodoI nuevo = new NodoI();
		nuevo.setIdioma(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      
	}
	
	public void adiFinal(Idioma z) {
		NodoI nuevo = new NodoI();
		nuevo.setIdioma(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoI R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoI R = P;   //R apunta  a la raiz P
		while(R != null) {
			R.getIdioma().mostrar();
			
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoI R = P;
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
	
	public NodoI eliPrincipio() {
		NodoI x = new NodoI();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoI eliFinal() {
		NodoI x = new NodoI();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoI R = P;
				NodoI S = P;
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
			Idioma z = new Idioma();
			z.leer();
			adiPrincipio(z);
		}
	}
	
	public void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Idioma z = new Idioma();
			z.leer();
			adiFinal(z);
		}
	}
}
