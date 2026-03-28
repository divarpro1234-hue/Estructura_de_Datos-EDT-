
public class LS_NormalHorario extends ListaSimpleHorario{

	public LS_NormalHorario() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Horario z) {
		NodoHorario nuevo = new NodoHorario();
		nuevo.setDato(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Horario z) {
		NodoHorario nuevo = new NodoHorario();
		nuevo.setDato(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoHorario R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoHorario R = P;   //R apunta  a la raiz P
		while(R != null) {
			R.getDato().mostrar();
			
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoHorario R = P;
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
	
	public NodoHorario eliPrincipio() {
		NodoHorario x = new NodoHorario();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoHorario eliFinal() {
		NodoHorario x = new NodoHorario();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoHorario R = P;
				NodoHorario S = P;
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
//			Horario z = new Horario();
//			z.leer();
//			adiPrincipio(z);
//		}
//	}
//	
//	public void leer2(int n) {
//		for (int i = 1; i <= n; i++) {
//			Horario z = new Horario();
//			z.leer();
//			adiFinal(z);
//		}
//	}
}
