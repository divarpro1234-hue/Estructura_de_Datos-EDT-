
public class LD_NormalDep extends ListaDobleDep{
	public LD_NormalDep() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoDep R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Departamento z){
		NodoDep nuevo = new NodoDep();
		nuevo.setDep(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoDep R = P;
		while(R != null) {
			R.getDep().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(Departamento z) {
		NodoDep nuevo =  new NodoDep();
		nuevo.setDep(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoDep R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoDep eliPrimero() {
		NodoDep x = new NodoDep();
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
	
	NodoDep eliFinal() {
		NodoDep x = new NodoDep();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoDep R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoDep aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		
		for (int i = 1; i <= n; i++) {
			Departamento z = new Departamento();

			z.leer();
			
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		
		for (int i = 1; i <= n; i++) {
			Departamento z = new Departamento();
			z.leer();
			adiFinal(z);
		}
	}
}
