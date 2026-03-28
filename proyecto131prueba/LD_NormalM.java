
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
		NodoD R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Diagnostico z){
		NodoD nuevo = new NodoD();
		nuevo.setMateria(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoD R = P;
		while(R != null) {
			R.getMateria().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(Diagnostico z) {
		NodoD nuevo =  new NodoD();
		nuevo.setMateria(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoD R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoD eliPrimero() {
		NodoD x = new NodoD();
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
	
	NodoD eliFinal() {
		NodoD x = new NodoD();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoD R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoD aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		
		for (int i = 1; i <= n; i++) {
			Diagnostico z = new Diagnostico();

			z.leer();
			
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		
		for (int i = 1; i <= n; i++) {
			Diagnostico z = new Diagnostico();
			z.leer();
			adiFinal(z);
		}
	}
}
