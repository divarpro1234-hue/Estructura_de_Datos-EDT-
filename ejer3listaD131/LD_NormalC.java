//Lic Aruquipa Marcelo
public class LD_NormalC extends ListaDobleC{
	public LD_NormalC() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoChar R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(char z){
		NodoChar nuevo = new NodoChar();
		nuevo.setCar(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoChar R = P;
		while(R != null) {
			System.out.println("caracter: " + R.getCar());
			R = R.getSig();
		}
	}
	void adiFinal(char z) {
		NodoChar nuevo =  new NodoChar();
		nuevo.setCar(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoChar R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoChar eliPrimero() {
		NodoChar x = new NodoChar();
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
	
	NodoChar eliFinal() {
		NodoChar x = new NodoChar();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoChar R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoChar aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
//	void leer1(int n) {
//		for (int i = 1; i <= n; i++) {
//			char z = new char();
//			z.leer();
//			adiPrimero(z);
//		}
//	}
//	
//	void leer2(int n) {
//		for (int i = 1; i <= n; i++) {
//			char z = new char();
//			z.leer();
//			adiFinal(z);
//		}
//	}
}
