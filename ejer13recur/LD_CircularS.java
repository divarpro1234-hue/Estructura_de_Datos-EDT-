import java.util.Scanner;

//Lic Aruquipa Marcelo
public class LD_CircularS extends ListaDobleS{
	public LD_CircularS() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoSop R = P;
		if(!esVacia()) {
			while(R.getSig() != P) {
				c++;
				R = R.getSig();
			}
			c++;
		}
		return c;
	}
	void adiPrimero(SimbolosOp z){
		NodoSop nuevo = new NodoSop();
		nuevo.setSop(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;

		if(esVacia()) {
			P = nuevo;
			P.setSig(P);
			P.setAnt(P);
		}
		else {
			NodoSop R = P.getAnt();
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
			P.setAnt(R);
			R.setSig(P);
		}
	}
	public void mostrar() {
    	NodoSop R = P;
        do {
            R.getSop().mostrar();
            R = R.getSig();
        } while (R != P); 
    }
	
	void adiFinal(SimbolosOp z) {
		NodoSop nuevo = new NodoSop();
		nuevo.setSop(z);

		if (esVacia()) {
			P = nuevo;
			P.setSig(P);
			P.setAnt(P); 
		} else {
			NodoSop R = P.getAnt();  
			R.setSig(nuevo);        
			nuevo.setAnt(R);         
			nuevo.setSig(P);          
			P.setAnt(nuevo);        
		}
	}

	NodoSop eliPrimero() {
		NodoSop x = new NodoSop();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P;
				NodoSop R = P.getAnt();
				P = P.getSig();
				P.setAnt(R);
				R.setSig(P);
			}
			x.setSig(null);
			x.setAnt(null);
		}
		return x;
	}

	NodoSop eliFinal() {
		NodoSop x = new NodoSop();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P.getAnt();
				NodoSop R = x.getAnt();
				R.setSig(P);
				P.setAnt(R);
			}
			x.setSig(null);
			x.setAnt(null);
		}
		return x;
	}

//	public void leer1(int n) {
//		Scanner lee =  new Scanner(System.in);
//		for (int i = 1; i <= n; i++) {
//			System.out.println("titulo - nomArt - genero");
//			SimbolosOp z = new SimbolosOp();
//			z.leer();
//			adiPrimero(z);
//		}
//	}
//
//	public void leer2(int n) {
//		Scanner lee =  new Scanner(System.in);
//		for (int i = 1; i <= n; i++) {
//			System.out.println("titulo - nomArt - genero");
//			SimbolosOp z = new SimbolosOp();
//			z.leer();
//			adiPrimero(z);
//		}
//	}
	public int evaluar() {
		if (P == null) 
			return 0;
		return evaluarRec(P, true);
	}

	// Recursión con control de vuelta al inicio
	private int evaluarRec(NodoSop nodo, boolean esPrimero) {
		int actual = nodo.getSop().getNumero();

		NodoSop siguiente = nodo.getSig();

		// si volvemos al inicio (y ya no es el primer llamado), terminamos
		if (siguiente == P && !esPrimero) {
			return actual;
		}

		char op = nodo.getSop().getOperacion();
		int siguienteValor = evaluarRec(siguiente, false);

		switch (op) {
			case '+': return actual + siguienteValor;
			case '-': return actual - siguienteValor;
			case '*': return actual * siguienteValor;
			case '/': return actual / siguienteValor;
			default: return actual;
		}
	}
}