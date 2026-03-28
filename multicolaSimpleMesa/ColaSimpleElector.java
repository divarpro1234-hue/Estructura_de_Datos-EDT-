
import java.util.Scanner;
public class ColaSimpleElector extends ColaElector{

	public ColaSimpleElector() {
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
	public void adi(Elector elem) {
		if(esLlena())
			System.out.println("cola simple llena!!!");
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public Elector eli() {
		Elector elem = new Elector();
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
	public void vaciar(ColaSimpleElector z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for (int i = 0; i < n; i++) {
			Elector x = new Elector();
			x.leer();
			adi(x);
		}
	}
	public void mostrar() {
		ColaSimpleElector aux = new ColaSimpleElector();
		Elector x;
		while(!esVacia()) {
			x = eli();
			x.mostrar();
			aux.adi(x);
		}
		vaciar(aux);
	}
}