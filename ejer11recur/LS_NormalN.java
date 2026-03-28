
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
		NodoNum nuevo = new NodoNum();
		nuevo.setNum(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(int z) {
		NodoNum nuevo = new NodoNum();
		nuevo.setNum(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoNum R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoNum R = P;   //R apunta  a la raiz P
		while(R != null) {
			System.out.println(R.getNum());;
			
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoNum R = P;
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
	
	public NodoNum eliPrincipio() {
		NodoNum x = new NodoNum();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoNum eliFinal() {
		NodoNum x = new NodoNum();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoNum R = P;
				NodoNum S = P;
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
//			Estudiante z = new Estudiante();
//			z.leer();
//			adiPrincipio(z);
//		}
//	}
//	
//	public void leer2(int n) {
//		for (int i = 1; i <= n; i++) {
//			Estudiante z = new Estudiante();
//			z.leer();
//			adiFinal(z);
//		}
//	}
}
