//Lic Aruquipa Marcelo
public class LD_NormalSM extends ListaDobleSM{
	public LD_NormalSM() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoSM R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(SeguimientoMedico z){
		NodoSM nuevo = new NodoSM();
		nuevo.setSm(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoSM R = P;
		while(R != null) {
			R.getSm().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(SeguimientoMedico z) {
		NodoSM nuevo =  new NodoSM();
		nuevo.setSm(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoSM R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoSM eliPrimero() {
		NodoSM x = new NodoSM();
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
	
	NodoSM eliFinal() {
		NodoSM x = new NodoSM();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoSM R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoSM aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		for (int i = 1; i <= n; i++) {
			SeguimientoMedico z = new SeguimientoMedico();
			z.leer();
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			SeguimientoMedico z = new SeguimientoMedico();
			z.leer();
			adiFinal(z);
		}
	}
}
