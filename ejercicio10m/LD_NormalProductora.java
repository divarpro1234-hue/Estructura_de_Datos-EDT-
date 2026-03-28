
public class LD_NormalProductora extends ListaDobleProductora{
	public LD_NormalProductora() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoProductora R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Productora z){
		NodoProductora nuevo = new NodoProductora();
		nuevo.setProductora(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoProductora R = P;
		while(R != null) {
			R.getProductora().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(Productora z) {
		NodoProductora nuevo =  new NodoProductora();
		nuevo.setProductora(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoProductora R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoProductora eliPrimero() {
		NodoProductora x = new NodoProductora();
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
	
	NodoProductora eliFinal() {
		NodoProductora x = new NodoProductora();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoProductora R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoProductora aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		
		for (int i = 1; i <= n; i++) {
			Productora z = new Productora();

			z.leer();
			
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		
		for (int i = 1; i <= n; i++) {
			Productora z = new Productora();
			z.leer();
			adiFinal(z);
		}
	}
}
