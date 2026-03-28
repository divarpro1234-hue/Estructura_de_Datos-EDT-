//Lic Aruquipa Marcelo
public class LD_NormalT extends ListaDobleT{
	public LD_NormalT() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoT R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Trufi z){
		NodoT nuevo = new NodoT();
		nuevo.setDato(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoT R = P;
		while(R != null) {
			R.getDato().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(Trufi z) {
		NodoT nuevo =  new NodoT();
		nuevo.setDato(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoT R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoT eliPrimero() {
		NodoT x = new NodoT();
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
	
	NodoT eliFinal() {
		NodoT x = new NodoT();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoT R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoT aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	

}
