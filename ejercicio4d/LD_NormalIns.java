
public class LD_NormalIns extends ListaDobleIns{
	public LD_NormalIns() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoIns R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Inscripcion z){
		NodoIns nuevo = new NodoIns();
		nuevo.setIns(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoIns R = P;
		while(R != null) {
			R.getIns().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(Inscripcion z) {
		NodoIns nuevo =  new NodoIns();
		nuevo.setIns(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoIns R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoIns eliPrimero() {
		NodoIns x = new NodoIns();
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
	
	NodoIns eliFinal() {
		NodoIns x = new NodoIns();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoIns R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoIns aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		
		for (int i = 1; i <= n; i++) {
			Inscripcion z = new Inscripcion();

			z.leer();
			
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		
		for (int i = 1; i <= n; i++) {
			Inscripcion z = new Inscripcion();
			z.leer();
			adiFinal(z);
		}
	}
}
