import java.util.Scanner;

public class ColaSimpleCar extends ColaCar {

	public ColaSimpleCar() {
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
	public void adi(char elem) {
		if(esLlena())
			System.out.println("cola simple llena!!!");
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public char eli() {
		char elem = 0;
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
	public void vaciar(ColaSimpleCar z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("Intr. caractesr: ");
			char elem = lee.next().charAt(0);
			adi(elem);
		}
	}
	public void mostrar() {
		ColaSimpleCar aux = new ColaSimpleCar();
		System.out.println("\nDatos de la cola Simple");
		char x;
		while(!esVacia()) {
			char elem = eli();
			System.out.println(elem);
			aux.adi(elem);
		}
		reiniciar();
		vaciar(aux);
	}
	
	public void reiniciar() {
		this.fi = -1;
		this.fr = -1;
	}
}
