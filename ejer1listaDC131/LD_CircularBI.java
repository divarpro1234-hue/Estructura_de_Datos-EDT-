import java.util.Scanner;

//Lic Aruquipa Marcelo
public class LD_CircularBI extends ListaDobleBI{
	public LD_CircularBI() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoBI R = P;
		if(!esVacia()) {
			while(R.getSig() != P) {
				c++;
				R = R.getSig();
			}
			c++;
		}
		return c;
	}
	void adiPrimero(Bien_Inmueble z){
		NodoBI nuevo = new NodoBI();
		nuevo.setBien(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;

		if(esVacia()) {
			P = nuevo;
			P.setSig(P);
			P.setAnt(P);
		}
		else {
			NodoBI R = P.getAnt();
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
			P.setAnt(R);
			R.setSig(P);
		}
	}
	public void mostrar() {
    	NodoBI R = P;
        do {
            R.getBien().mostrar();
            R = R.getSig();
        } while (R != P); 
    }
	
	void adiFinal(Bien_Inmueble z) {
		NodoBI nuevo = new NodoBI();
		nuevo.setBien(z);

		if (esVacia()) {
			P = nuevo;
			P.setSig(P);
			P.setAnt(P); 
		} else {
			NodoBI R = P.getAnt();  
			R.setSig(nuevo);        
			nuevo.setAnt(R);         
			nuevo.setSig(P);          
			P.setAnt(nuevo);        
		}
	}

	NodoBI eliPrimero() {
		NodoBI x = new NodoBI();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P;
				NodoBI R = P.getAnt();
				P = P.getSig();
				P.setAnt(R);
				R.setSig(P);
			}
			x.setSig(null);
			x.setAnt(null);
		}
		return x;
	}

	NodoBI eliFinal() {
		NodoBI x = new NodoBI();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P.getAnt();
				NodoBI R = x.getAnt();
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
			Bien_Inmueble z = new Bien_Inmueble();
			z.leer();
			adiPrimero(z);
		}
	}

	public void leer2(int n) {
		Scanner lee =  new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("titulo - nomArt - genero");
			Bien_Inmueble z = new Bien_Inmueble();
			z.leer();
			adiPrimero(z);
		}
	}
}