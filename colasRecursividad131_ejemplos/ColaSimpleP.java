import java.util.Scanner;

public class ColaSimpleP extends ColaP {

	public ColaSimpleP() {
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
	public void adi(Persona elem) {
		if(esLlena())
			System.out.println("cola simple llena!!!");
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public Persona eli() {
		Persona elem = new Persona();
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
	public void vaciar(ColaSimpleP z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
//	public void llenar(int n) {
//		Scanner lee = new Scanner(System.in);
//		
//		for (int i = 1; i <= n; i++) {
//			System.out.println("Intr. titulo, genero, cantante, duracion");
//			String titulo = lee.next();
//			String genero= lee.next();
//			String cantante = lee.next();
//			double duracion = lee.nextDouble();
//			
//			Estudiante x = new Estudiante(titulo, genero, cantante, duracion);
//			adi(x);
//		}
//	}
	public void mostrar() {
		ColaSimpleP aux = new ColaSimpleP();
		System.out.println("\nDatos de la cola Simple");
		Persona x;
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
