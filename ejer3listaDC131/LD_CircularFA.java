import java.util.Scanner;

//Lic Aruquipa Marcelo
public class LD_CircularFA extends ListaDobleFA{
	public LD_CircularFA() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoFA R = P;
		if(!esVacia()) {
			while(R.getSig() != P) {
				c++;
				R = R.getSig();
			}
			c++;
		}
		return c;
	}
	void adiPrimero(F_Agropecuaria z){
		NodoFA nuevo = new NodoFA();
		nuevo.setF_agro(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;

		if(esVacia()) {
			P = nuevo;
			P.setSig(P);
			P.setAnt(P);
		}
		else {
			NodoFA R = P.getAnt();
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
			P.setAnt(R);
			R.setSig(P);
		}
	}
	public void mostrar() {
    	NodoFA R = P;
        do {
            R.getF_agro().mostrar();
            R = R.getSig();
        } while (R != P); 
    }
	
	void adiFinal(F_Agropecuaria z) {
		NodoFA nuevo = new NodoFA();
		nuevo.setF_agro(z);

		if (esVacia()) {
			P = nuevo;
			P.setSig(P);
			P.setAnt(P); 
		} else {
			NodoFA R = P.getAnt();  
			R.setSig(nuevo);        
			nuevo.setAnt(R);         
			nuevo.setSig(P);          
			P.setAnt(nuevo);        
		}
	}

	NodoFA eliPrimero() {
		NodoFA x = new NodoFA();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P;
				NodoFA R = P.getAnt();
				P = P.getSig();
				P.setAnt(R);
				R.setSig(P);
			}
			x.setSig(null);
			x.setAnt(null);
		}
		return x;
	}

	NodoFA eliFinal() {
		NodoFA x = new NodoFA();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P.getAnt();
				NodoFA R = x.getAnt();
				R.setSig(P);
				P.setAnt(R);
			}
			x.setSig(null);
			x.setAnt(null);
		}
		return x;
	}

	public void leer1(int n) {
		Scanner lee =  new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("titulo - nomArt - genero");
			F_Agropecuaria z = new F_Agropecuaria();
			z.leer();
			adiPrimero(z);
		}
	}

	public void leer2(int n) {
		Scanner lee =  new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("titulo - nomArt - genero");
			F_Agropecuaria z = new F_Agropecuaria();
			z.leer();
			adiPrimero(z);
		}
	}
}