
import java.util.Scanner;

public class ColaCircularCar extends ColaCar{
	public ColaCircularCar() {
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
	public void adi(char elem) {
		if(!esLlena()) {
			fi = (fi + 1) % MAX;
			v[fi] = elem;
		}else
			System.out.println("cola circular llena!!!");
	}
	public char eli() {
		char elem = 0;
		if(!esVacia()) {
			fr = (fr + 1) % MAX;
			elem = v[fr];
		}else
			System.out.println("Cola circular vacia!!");
		return elem;
	}
	
	public void vaciar(ColaCircularCar z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("intro. caracter: ");
			char elem = lee.next().charAt(0);
			adi(elem);
		}
	}
	public void mostrar() {
		ColaCircularCar aux = new ColaCircularCar();
		System.out.println("\nDatos de la Cola Circular: ");
		while(!esVacia()) {
			char elem = eli();
			System.out.println(elem);
			aux.adi(elem);
		}
		vaciar(aux);
	}
}

