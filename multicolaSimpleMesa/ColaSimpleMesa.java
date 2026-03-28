
import java.util.Scanner;
public class ColaSimpleMesa extends ColaMesa{

	public ColaSimpleMesa() {
		super();
	}
	public boolean esVacia() {
		if(fr == fi)
			return true;
		return false;
		
	}
	public boolean esLlena() {
		if(fi == MAX-1)
			return true;
		return false;
	}
	public void adi(MesaE elem) {
		if(esLlena())
			System.out.println("cola simple llena!!!");
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public MesaE eli() {
		MesaE elem = new MesaE();
		if(esVacia())
			System.out.println("Cola simple vacia!!");
		else {
			fr++;
			elem = v[fr];
		}
		return elem;
	}
	public int nroElem() {
		return (fi - fr);
	}
	public void vaciar(ColaSimpleMesa z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for (int i = 1; i <= n; i++) {
			System.out.println("*****Datosd e la multi Cola***["+i+"]");
			MesaE x = new MesaE();
			x.leer();
			adi(x);
		}
	}
	public void mostrar() {
	    ColaSimpleMesa aux = new ColaSimpleMesa();
	    MesaE x;
	    
	    while(!esVacia()) {
	        x = eli();
	        x.mostrar(); // Mostrar la información completa de la mesa
	        
	        aux.adi(x);
	    }
	    vaciar(aux);
	}
}