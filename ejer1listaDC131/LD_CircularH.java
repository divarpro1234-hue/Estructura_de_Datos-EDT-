import java.util.Scanner;

//Lic Aruquipa Marcelo
public class LD_CircularH extends ListaDobleH{
	public LD_CircularH() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoH R = P;
		if(!esVacia()) {
			while(R.getSig() != P) {
				c++;
				R = R.getSig();
			}
			c++;
		}
		return c;
	}
	void adiPrimero(Habitacion z){
		NodoH nuevo = new NodoH();
		nuevo.setHab(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;

		if(esVacia()) {
			P = nuevo;
			P.setSig(P);
			P.setAnt(P);
		}
		else {
			NodoH R = P.getAnt();
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
			P.setAnt(R);
			R.setSig(P);
		}
	}
	public void mostrar() {
    	NodoH R = P;
        do {
            R.getHab().mostrar();
            R = R.getSig();
        } while (R != P); 
    }
	
	void adiFinal(Habitacion z) {
		NodoH nuevo = new NodoH();
		nuevo.setHab(z);

		if (esVacia()) {
			P = nuevo;
			P.setSig(P);
			P.setAnt(P); 
		} else {
			NodoH R = P.getAnt();  
			R.setSig(nuevo);        
			nuevo.setAnt(R);         
			nuevo.setSig(P);          
			P.setAnt(nuevo);        
		}
	}

	NodoH eliPrimero() {
		NodoH x = new NodoH();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P;
				NodoH R = P.getAnt();
				P = P.getSig();
				P.setAnt(R);
				R.setSig(P);
			}
			x.setSig(null);
			x.setAnt(null);
		}
		return x;
	}

	NodoH eliFinal() {
		NodoH x = new NodoH();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P.getAnt();
				NodoH R = x.getAnt();
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
			Habitacion z = new Habitacion();
			z.leer();
			adiPrimero(z);
		}
	}

	public void leer2(int n) {
		Scanner lee =  new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("titulo - nomArt - genero");
			Habitacion z = new Habitacion();
			z.leer();
			adiPrimero(z);
		}
	}
	
	public void eliminarPorCodigo(String cod) {
	
	    NodoH R = P;

	    do {
	        if (R.getHab().getIdCasa().equals(cod)) {
	            if (R.getSig() == R) {
	                // Solo hay un nodo
	                P = null;
	            } else {
	                // Más de un nodo
	                R.getAnt().setSig(R.getSig());
	                R.getSig().setAnt(R.getAnt());

	                if (R == P) {
	                    // Si es el primero, mover el puntero
	                    P = R.getSig();
	                }
	            }
	            return; // Ya se eliminó, salimos
	        }
	        R = R.getSig();
	    } while (R != P);
	}

}