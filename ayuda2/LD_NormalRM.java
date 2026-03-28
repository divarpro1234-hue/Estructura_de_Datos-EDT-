
public class LD_NormalRM extends ListaDobleRM{
	public LD_NormalRM() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoRM R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(RecursoMedico z){
		NodoRM nuevo = new NodoRM();
		nuevo.setRecMed(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoRM R = P;
		while(R != null) {
			R.getRecMed().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(RecursoMedico z) {
		NodoRM nuevo =  new NodoRM();
		nuevo.setRecMed(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoRM R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoRM eliPrimero() {
		NodoRM x = new NodoRM();
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
	
	NodoRM eliFinal() {
		NodoRM x = new NodoRM();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoRM R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoRM aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		
		for (int i = 1; i <= n; i++) {
			RecursoMedico z = new RecursoMedico();

			z.leer();
			
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		
		for (int i = 1; i <= n; i++) {
			RecursoMedico z = new RecursoMedico();
			z.leer();
			adiFinal(z);
		}
	}
}
