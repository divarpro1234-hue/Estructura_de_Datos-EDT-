
public class LS_NormalCarta extends ListaSimpleCarta{

	public LS_NormalCarta() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

//	public void adiPrincipio(int nroCel) {
//		NodoRem nuevo = new NodoRem();
//		nuevo.setNroCel(nroCel);
//		nuevo.setSig(P);
//		P = nuevo;      //P apunta a nuevo
//	}
	
	public void adiFinalRec(int nroCelRem, int nroCelRec) {
		NodoRem nuevoRem = new NodoRem();
		nuevoRem.setNroCel(nroCelRem);
		
		NodoRec nuevoRec = new NodoRec();
		nuevoRec.setNroCel(nroCelRec);
		
		nuevoRem.setSig(nuevoRec);
		
		if(esVacia())
			P = nuevoRem;   //p apunta a nuevo
		else {
			NodoRem R = P;
			NodoRec Q = R.getSig();
			while(Q.getSig()!= null ){
				Q = Q.getSig().getSig();
			}
			Q.setSig(nuevoRem);
		}
	}
	
	
	public void mostrar() {
		NodoRem R = P;
		NodoRec Q = R.getSig(); 
		
		while(R != null) {
			System.out.println("nro Cel: " + R.getNroCel());
			System.out.println("nro Cel: " + Q.getNroCel());
			System.out.println();
			R = Q.getSig();
			if(R != null)
				Q = R.getSig();
		}
	}

//	public int nroNodos() {
//		NodoPer R = P;
//		int c = 0;
//		if(this.esVacia())
//			return 0;
//		else {
//			while(R != null) {
//				c++;
//				R = R.getSig();
//			}
//		}
//		return c;
//	}
	
//	public NodoPer eliPrincipio() {
//		NodoPer x = new NodoPer();    
//		if(!esVacia()) {
//			x = P ;     // x apunta a la raiz P
//			P = P.getSig();
//			x.setSig(null);
//		}
//		return x;
//	}
//	
//	public NodoPer eliFinal() {
//		NodoPer x = new NodoPer();
//		if(!esVacia()) {
//			if(nroNodos() == 1) {
//				x = P;      //x apunta a la raiz P
//				P = null;
//			}else {
//				NodoPer R = P;
//				NodoPer S = P;
//				while(R.getSig() != null) {
//					S = R;         //S apunta a R
//					R = R.getSig(); //R apunta al siguiente de R
//				}
//				x = R;
//				S.setSig(null);
//			}
//		}
//		return x;
//	}
//	
//	public void leer1(int n) {
//		for (int i = 1; i <= n; i++) {
//			Persona z = new Persona();
//			z.leer();
//			adiPrincipio(z);
//		}
//	}
//	
//	public void leer2(int n) {
//		for (int i = 1; i <= n; i++) {
//			Persona z = new Persona();
//			z.leer();
//			adiFinal(z);
//		}
//	}
}
