
public class LD_NormalM extends ListaDobleM{
	public LD_NormalM() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoM R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(String materia , LD_NormalE lest){
		NodoM nuevo = new NodoM();
		nuevo.setMat(materia);
		nuevo.setLest(lest);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoM R = P;
		while(R != null) {
			System.out.println("materia: " + R.getMat());
			System.out.println();
			R.getLest().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(String materia , LD_NormalE lest) {
		NodoM nuevo =  new NodoM();
		nuevo.setMat(materia);
		nuevo.setLest(lest);
		if(esVacia())
			P = nuevo;
		else {
			NodoM R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoM eliPrimero() {
		NodoM x = new NodoM();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P;
				P = P.getSig();
				P.setAnt(null);
				x.setSig(null);
			}
		}
		return x;
	}
	
	NodoM eliFinal() {
		NodoM x = new NodoM();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoM R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoM aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
//	void leer1(int n) {
//		
//		for (int i = 1; i <= n; i++) {
//			Proyecto z = new Proyecto();
//
//			z.leer();
//			
//			adiPrimero(z);
//		}
//	}
//	
//	void leer2(int n) {
//		
//		for (int i = 1; i <= n; i++) {
//			Proyecto z = new Proyecto();
//			z.leer();
//			adiFinal(z);
//		}
//	}
}
