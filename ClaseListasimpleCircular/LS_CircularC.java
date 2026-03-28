//Marcelo Aruquipa

import java.util.Scanner;

public class LS_CircularC extends ListaSimpleC{

	public LS_CircularC() {
		super();  //constructor de la clase padre ListaSimplePer
	}

	public boolean esVacia() {
		if(P == null)
			return true;   //lista vacia
		return false;      //lista NO vacia
	}
	
	public int nroNodos() {
		int c = 0;
		if(P != null) {
			NodoC R = P;
			while(R.getSig() != P) {
				c++;
				R = R.getSig();
			}
			c++;  //para contar el ultimo nodo
		}
		return c;
	}
	public void adiFinal(String prenda, int nroCompra) {
		NodoC nuevo = new NodoC();
		nuevo.setPrenda(prenda);
		nuevo.setNroCompra(nroCompra);
		
		if(P == null) {
			P = nuevo;   //p apunta a nuevo
			P.setSig(P);
		}
		else {
			NodoC R = P;
			while( R.getSig() != P){
			     R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setSig(P);
		}
	}
	
	public void adiPrincipio(String prenda, int nroCompra) {
		NodoC nuevo = new NodoC();
		nuevo.setPrenda(prenda);
		nuevo.setNroCompra(nroCompra);
		if(P == null) {
			P = nuevo;
			P.setSig(P);
		}else {
			NodoC R = P;
			while(R.getSig() != P) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setSig(P);
			P = nuevo;
		}
	}
	
	public void mostrar() {
		NodoC R = P;   //R apunta  a la raiz P
		while(R.getSig() != P) {
			System.out.println(R.getPrenda() + " - " + R.getNroCompra());
			R = R.getSig();
		}
		System.out.println(R.getPrenda() + " - " + R.getNroCompra());
	}
	
	public NodoC eliPrincipio() {
		NodoC x = null;    
		if(!esVacia()) {
			if(P.getSig() == P) {
				x = P;
				x.setSig(null);
				P = null;
			}else {
				x = P ;     // x apunta a la raiz P
				NodoC R = P;
				while(R.getSig() != P) {
					R = R.getSig();
				}
				P = P.getSig();
				R.setSig(P);
				x.setSig(null);
			}
		}
		return x;
	}
	
	public NodoC eliFinal() {
		NodoC x = new NodoC();
		if(P != null) {
			if(P.getSig() == P) {
				x = P; 
				x.setSig(null);
				P = null;
			}else {
				NodoC S = new NodoC();
				NodoC R = P;
				while(R.getSig() != P) {
					S = R;         //S apunta a R
					R = R.getSig(); //R apunta al siguiente de R
				}
				x = R;
				x.setSig(null);
				S.setSig(P);
			}
		}
		return x;
	}
	
	public void llenar1(int n) {
		Scanner lee =  new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("Prenda - NroCompra");
			String prenda = lee.next();
			int nroCompra = lee.nextInt();
			adiFinal(prenda, nroCompra);
		}
	}
	
	public void llenar2(int n) {
		Scanner lee =  new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("Prenda - NroCompra");
			String nom = lee.next();
			int edad = lee.nextInt();
			adiPrincipio(nom, edad);
		}
	}
}
