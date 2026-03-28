//Lic Aruquipa Marcelo
public class LD_NormalE extends ListaDobleE{
	public LD_NormalE() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoE R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(String nombre, int nota, String paralelo){
		NodoE nuevo = new NodoE();
		nuevo.setNombre(nombre);
		nuevo.setNota(nota);
		nuevo.setParalelo(paralelo);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoE R = P;
		while(R != null) {
			System.out.println("nombre; " + R.getNombre());
			System.out.println("nota: " + R.getNota());
			System.out.println("paralelo: " + R.getParalelo());
			System.out.println();
			R = R.getSig();
		}
	}
	void adiFinal(String nombre, int nota, String paralelo) {
		NodoE nuevo =  new NodoE();
		nuevo.setNombre(nombre);
		nuevo.setNota(nota);
		nuevo.setParalelo(paralelo);
		if(esVacia())
			P = nuevo;
		else {
			NodoE R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoE eliPrimero() {
		NodoE x = new NodoE();
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
	
	NodoE eliFinal() {
		NodoE x = new NodoE();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoE R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoE aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
//	void leer1(int n) {
//		for (int i = 1; i <= n; i++) {
//			Partida z = new Partida();
//			z.leer();
//			adiPrimero(z);
//		}
//	}
//	
//	void leer2(int n) {
//		for (int i = 1; i <= n; i++) {
//			Partida z = new Partida();
//			z.leer();
//			adiFinal(z);
//		}
//	}
}
