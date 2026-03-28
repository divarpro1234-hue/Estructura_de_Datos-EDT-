//Lic Aruquipa Marcelo
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
	void adiPrimero(Mascota z){
		NodoM nuevo = new NodoM();
		nuevo.setMas(z);
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
			R.getMas().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(Mascota z) {
		NodoM nuevo =  new NodoM();
		nuevo.setMas(z);
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
	
	void leer1(int n) {
		for (int i = 1; i <= n; i++) {
			Mascota z = new Mascota();
			z.leer();
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Mascota z = new Mascota();
			z.leer();
			adiFinal(z);
		}
	}
}
