package Clases;
//Lic Aruquipa Marcelo
public class LD_NormalH extends ListaDobleH{
	public LD_NormalH() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	public int nroNodos() {
		int c = 0;
		NodoH R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Historial z){
		NodoH nuevo = new NodoH();
		nuevo.setH(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoH R = P;
		while(R != null) {
			R.getH().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(Historial z) {
		NodoH nuevo =  new NodoH();
		nuevo.setH(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoH R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoH eliPrimero() {
		NodoH x = new NodoH();
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
	
	NodoH eliFinal() {
		NodoH x = new NodoH();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoH R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoH aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
//	void leer1(int n) {
//		for (int i = 1; i <= n; i++) {
//			Historial z = new Historial();
//			z.leer();
//			adiPrimero(z);
//		}
//	}
//	
//	void leer2(int n) {
//		for (int i = 1; i <= n; i++) {
//			Historial z = new Historial();
//			z.leer();
//			adiFinal(z);
//		}
//	}
}
