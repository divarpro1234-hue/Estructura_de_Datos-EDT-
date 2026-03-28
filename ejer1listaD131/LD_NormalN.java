//Lic Aruquipa Marcelo
public class LD_NormalN extends ListaDobleN{
	public LD_NormalN() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoN R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Numero z){
		NodoN nuevo = new NodoN();
		nuevo.setNum(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoN R = P;
		while(R != null) {
			R.getNum().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(Numero z) {
		NodoN nuevo =  new NodoN();
		nuevo.setNum(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoN R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoN eliPrimero() {
		NodoN x = new NodoN();
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
	
	NodoN eliFinal() {
		NodoN x = new NodoN();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoN R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoN aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		for (int i = 1; i <= n; i++) {
			Numero z = new Numero();
			z.leer();
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Numero z = new Numero();
			z.leer();
			adiFinal(z);
		}
	}
}
