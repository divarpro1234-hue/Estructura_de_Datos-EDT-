
public class LD_NormalPer extends ListaDoblePer{
	public LD_NormalPer() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoPer R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Persona z){
		NodoPer nuevo = new NodoPer();
		nuevo.setPer(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoPer R = P;
		while(R != null) {
			R.getPer().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(Persona z) {
		NodoPer nuevo =  new NodoPer();
		nuevo.setPer(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoPer R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoPer eliPrimero() {
		NodoPer x = new NodoPer();
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
	
	NodoPer eliFinal() {
		NodoPer x = new NodoPer();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoPer R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoPer aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		
		for (int i = 1; i <= n; i++) {
			Persona z = new Persona();

			z.leer();
			
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		
		for (int i = 1; i <= n; i++) {
			Persona z = new Persona();
			z.leer();
			adiFinal(z);
		}
	}
}
