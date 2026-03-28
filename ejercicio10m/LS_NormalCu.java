
public class LS_NormalCu extends ListaSimpleCu{

	public LS_NormalCu() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Cultivo z) {
		NodoCu nuevo = new NodoCu();
		nuevo.setCultivo(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      
	}
	
	public void adiFinal(Cultivo z) {
		NodoCu nuevo = new NodoCu();
		nuevo.setCultivo(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoCu R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoCu R = P;   //R apunta  a la raiz P
		while(R != null) {
			R.getCultivo().mostrar();
			
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoCu R = P;
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
	
	public NodoCu eliPrincipio() {
		NodoCu x = new NodoCu();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoCu eliFinal() {
		NodoCu x = new NodoCu();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoCu R = P;
				NodoCu S = P;
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
			Cultivo z = new Cultivo();
			z.leer();
			adiPrincipio(z);
		}
	}
	
	public void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Cultivo z = new Cultivo();
			z.leer();
			adiFinal(z);
		}
	}
}
