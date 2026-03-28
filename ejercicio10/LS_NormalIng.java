
public class LS_NormalIng extends ListaSimpleIng{

	public LS_NormalIng() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Ingrediente z) {
		NodoIng nuevo = new NodoIng();
		nuevo.setIngrediente(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      
	}
	
	public void adiFinal(Ingrediente z) {
		NodoIng nuevo = new NodoIng();
		nuevo.setIngrediente(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoIng R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoIng R = P;   //R apunta  a la raiz P
		while(R != null) {
			
			R.getIngrediente().mostrar();
			
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoIng R = P;
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
	
	public NodoIng eliPrincipio() {
		NodoIng x = new NodoIng();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoIng eliFinal() {
		NodoIng x = new NodoIng();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoIng R = P;
				NodoIng S = P;
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
			Ingrediente z = new Ingrediente();
			z.leer();
			adiPrincipio(z);
		}
	}
	
	public void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Ingrediente z = new Ingrediente();
			z.leer();
			adiFinal(z);
		}
	}
}
