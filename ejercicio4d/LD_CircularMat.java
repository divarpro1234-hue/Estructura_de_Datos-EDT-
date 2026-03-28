import java.util.Scanner;

//Lic Aruquipa Marcelo
public class LD_CircularMat extends ListaDobleMat{
	public LD_CircularMat() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoMat R = P;
		if(!esVacia()) {
			while(R.getSig() != P) {
				c++;
				R = R.getSig();
			}
			c++;
		}
		return c;
	}
	void adiPrimero(Materia z){
		NodoMat nuevo = new NodoMat();
		nuevo.setMat(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;

		if(esVacia()) {
			P = nuevo;
			P.setSig(P);
			P.setAnt(P);
		}
		else {
			NodoMat R = P.getAnt();
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
			P.setAnt(R);
			R.setSig(P);
		}
	}
	public void mostrar() {
    	NodoMat R = P;
        do {
            R.getMat().mostrar();
            R = R.getSig();
        } while (R != P); 
    }
	void adiFinal(Materia z) {
		NodoMat nuevo = new NodoMat();
		nuevo.setMat(z);

		if (esVacia()) {
			P = nuevo;
			P.setSig(P);
			P.setAnt(P); 
		} else {
			NodoMat R = P.getAnt();  
			R.setSig(nuevo);        
			nuevo.setAnt(R);         
			nuevo.setSig(P);          
			P.setAnt(nuevo);        
		}
	}

	NodoMat eliPrimero() {
		NodoMat x = new NodoMat();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P;
				NodoMat R = P.getAnt();
				P = P.getSig();
				P.setAnt(R);
				R.setSig(P);
			}
			x.setSig(null);
			x.setAnt(null);
		}
		return x;
	}

	NodoMat eliFinal() {
		NodoMat x = new NodoMat();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P.getAnt();
				NodoMat R = x.getAnt();
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
			Materia z = new Materia();
			z.leer();
			adiPrimero(z);
		}
	}

	public void leer2(int n) {
		Scanner lee =  new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("titulo - nomArt - genero");
			Materia z = new Materia();
			z.leer();
			adiPrimero(z);
		}
	}
}