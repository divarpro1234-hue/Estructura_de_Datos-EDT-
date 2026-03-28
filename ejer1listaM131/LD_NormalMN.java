//Lic Aruquipa Marcelo
public class LD_NormalMN extends ListaDobleMN{
	public LD_NormalMN() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoMN R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(M_num z){
		NodoMN nuevo = new NodoMN();
		nuevo.setL_Num(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoMN R = P;
		while(R != null) {
			R.getL_Num().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(M_num z) {
		NodoMN nuevo =  new NodoMN();
		nuevo.setL_Num(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoMN R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoMN eliPrimero() {
		NodoMN x = new NodoMN();
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
	
	NodoMN eliFinal() {
		NodoMN x = new NodoMN();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoMN R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoMN aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
//	void leer1(int n) {
//		for (int i = 1; i <= n; i++) {
//			M_num z = new M_num();
//			z.leer();
//			adiPrimero(z);
//		}
//	}
//	
//	void leer2(int n) {
//		for (int i = 1; i <= n; i++) {
//			M_num z = new M_num();
//			z.leer();
//			adiFinal(z);
//		}
//	}
}
