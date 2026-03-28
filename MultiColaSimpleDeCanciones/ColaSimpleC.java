import java.util.Scanner;

public class ColaSimpleC extends ColaC {

	public ColaSimpleC() {
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
	public void adi(Canciones elem) {
		if(esLlena())
			System.out.println("cola simple llena!!!");
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public Canciones eli() {
		Canciones elem = new Canciones("", "", "", 0);
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
	public void vaciar(ColaSimpleC z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Intr. titulo, genero, cantante, duracion");
			String titulo = lee.next();
			String genero= lee.next();
			String cantante = lee.next();
			double duracion = lee.nextDouble();
			
			Canciones x = new Canciones(titulo, genero, cantante, duracion);
			adi(x);
		}
	}
	public void mostrar() {
		ColaSimpleC aux = new ColaSimpleC();
		System.out.println("\nDatos de la cola Simple");
		Canciones x;
		while(!esVacia()) {
			x = eli();
			x.mostrar();
			aux.adi(x);
		}
		reiniciar();
		vaciar(aux);
	}
	
	public void reiniciar() {
		this.fi = -1;
		this.fr = -1;
	}
}
