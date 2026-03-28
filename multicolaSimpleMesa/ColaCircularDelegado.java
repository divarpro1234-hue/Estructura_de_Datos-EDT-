
import java.util.Scanner;

public class ColaCircularDelegado extends ColaDelegado{
	public ColaCircularDelegado() {
		super();
	}
	public int nroElem() {
		return (fi - fr + MAX) % MAX;
	}
	public boolean esVacia() {
		if(nroElem() == 0)
			return true;
		return false;
		
	}
	public boolean esLlena() {
		if(nroElem() == MAX-1)
			return true;
		return false;
	}
	public void adi(Delegado elem) {
		if(!esLlena()) {
			fi = (fi + 1) % MAX;
			v[fi] = elem;
		}else
			System.out.println("cola circular llena!!!");
	}
	public Delegado eli() {
		Delegado elem = new Delegado();
		if(!esVacia()) {
			fr = (fr + 1) % MAX;
			elem = v[fr];
		}else
			System.out.println("Cola circular vacia!!");
		return elem;
	}
	
	public void vaciar(ColaCircularDelegado z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for (int i = 0; i < n; i++) {
			System.out.println("Intr. numero entero");
			Delegado elem = new Delegado();
			elem.leer();
			adi(elem);
		}
	}
	public void mostrar() {
		ColaCircularDelegado aux = new ColaCircularDelegado();
		while(!esVacia()) {
			Delegado elem = eli();
			System.out.println(elem);
			aux.adi(elem);
		}
		vaciar(aux);
	}
}
