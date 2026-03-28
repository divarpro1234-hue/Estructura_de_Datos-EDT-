import java.util.Scanner;
//MARCELO ARUQUIPA
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
		NodoM R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(String sigla, LS_NormalE le){
		NodoM nuevo = new NodoM();
		nuevo.setSigla(sigla);
		nuevo.setLe(le);
		
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoM R = P;
		while(R != null) {
			//R.getProy().mostrar();
			System.out.println("\nsigla materia: " + R.getSigla());
			System.out.println("Lista de estudiantes de la materia: ");
			R.getLe().mostrar();
			R = R.getSig();
		}
	}
	NodoM eliPrimero() {
		NodoM x = new NodoM();
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
	void leer1(int n) {
		Scanner lee = new Scanner(System.in);
		String sigla;
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Intr. Sigla");
			sigla = lee.next();
			
			LS_NormalE le = new LS_NormalE();
			System.out.println("nro estudiantes: ");
			int ne = lee.nextInt();
			le.leer2(ne);
			
			adiPrimero(sigla, le);
		}
	}
	
}
