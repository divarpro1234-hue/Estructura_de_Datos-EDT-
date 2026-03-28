//Lic Aruquipa Marcelo
public class LD_NormalV extends ListaDobleV{
	public LD_NormalV() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoV R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Vuelo z){
		NodoV nuevo = new NodoV();
		nuevo.setProy(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoV R = P;
		while(R != null) {
			R.getProy().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(Vuelo z) {
		NodoV nuevo =  new NodoV();
		nuevo.setProy(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoV R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoV eliPrimero() {
		NodoV x = new NodoV();
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
	
	NodoV eliFinal() {
		NodoV x = new NodoV();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoV R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoV aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		for (int i = 1; i <= n; i++) {
			Vuelo z = new Vuelo();
			z.leer();
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Vuelo z = new Vuelo();
			z.leer();
			adiFinal(z);
		}
	}
}
