import java.util.Scanner;

//Lic Aruquipa Marcelo
public class LD_CircularC extends ListaDobleC{
	public LD_CircularC() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoC R = P;
		if(!esVacia()) {
			while(R.getSig() != P) {
				c++;
				R = R.getSig();
			}
			c++;
		}
		return c;
	}
	void adiPrimero(Comite z){
		NodoC nuevo = new NodoC();
		nuevo.setCom(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;

		if(esVacia()) {
			P = nuevo;
			P.setSig(P);
			P.setAnt(P);
		}
		else {
			NodoC R = P.getAnt();
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
			P.setAnt(R);
			R.setSig(P);
		}
	}
	public void mostrar() {
    	NodoC R = P;
        do {
            R.getCom().mostrar();
            R = R.getSig();
        } while (R != P); 
    }
	void adiFinal(Comite z) {
		NodoC nuevo = new NodoC();
		nuevo.setCom(z);

		if (esVacia()) {
			P = nuevo;
			P.setSig(P);
			P.setAnt(P); 
		} else {
			NodoC R = P.getAnt();  
			R.setSig(nuevo);        
			nuevo.setAnt(R);         
			nuevo.setSig(P);          
			P.setAnt(nuevo);        
		}
	}

	NodoC eliPrimero() {
		NodoC x = new NodoC();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P;
				NodoC R = P.getAnt();
				P = P.getSig();
				P.setAnt(R);
				R.setSig(P);
			}
			x.setSig(null);
			x.setAnt(null);
		}
		return x;
	}

	NodoC eliFinal() {
		NodoC x = new NodoC();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P.getAnt();
				NodoC R = x.getAnt();
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
			Comite z = new Comite();
			z.leer();
			adiPrimero(z);
		}
	}

	public void leer2(int n) {
		Scanner lee =  new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("titulo - nomArt - genero");
			Comite z = new Comite();
			z.leer();
			adiPrimero(z);
		}
	}
}