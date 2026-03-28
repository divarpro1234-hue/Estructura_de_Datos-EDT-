
public class LD_NormalCC extends ListaDobleCC{
	public LD_NormalCC() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoCC R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(CentroConvencion z){
		NodoCC nuevo = new NodoCC();
		nuevo.setCenCon(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoCC R = P;
		while(R != null) {
			R.getCenCon().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(CentroConvencion z) {
		NodoCC nuevo =  new NodoCC();
		nuevo.setCenCon(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoCC R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoCC eliPrimero() {
		NodoCC x = new NodoCC();
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
	
	NodoCC eliFinal() {
		NodoCC x = new NodoCC();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoCC R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoCC aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		
		for (int i = 1; i <= n; i++) {
			CentroConvencion z = new CentroConvencion();

			z.leer();
			
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		
		for (int i = 1; i <= n; i++) {
			CentroConvencion z = new CentroConvencion();
			z.leer();
			adiFinal(z);
		}
	}
}
