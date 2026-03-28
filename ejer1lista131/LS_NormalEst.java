
public class LS_NormalEst extends ListaSimpleEst{

	public LS_NormalEst() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Estudiante z) {
		NodoEst nuevo = new NodoEst();
		nuevo.setEst(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Estudiante z) {
		NodoEst nuevo = new NodoEst();
		nuevo.setEst(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoEst R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoEst R = P;   //R apunta  a la raiz P
		while(R != null) {
			R.getEst().mostrar();
			
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoEst R = P;
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
	
	public NodoEst eliPrincipio() {
		NodoEst x = new NodoEst();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoEst eliFinal() {
		NodoEst x = new NodoEst();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoEst R = P;
				NodoEst S = P;
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
			Estudiante z = new Estudiante();
			z.leer();
			adiPrincipio(z);
		}
	}
	
	public void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Estudiante z = new Estudiante();
			z.leer();
			adiFinal(z);
		}
	}
}
