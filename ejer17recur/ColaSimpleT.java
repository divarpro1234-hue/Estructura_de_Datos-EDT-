import java.util.Scanner;

public class ColaSimpleT extends ColaT {

	public ColaSimpleT() {
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
	public void adi(Tarea elem) {
		if(esLlena())
			System.out.println("cola simple llena!!!");
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public Tarea eli() {
		Tarea elem = new Tarea();
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
	public void vaciar(ColaSimpleT z) {
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
	
	public int tiempoTotal() {
	    return tiempoRec(this);
	}

	private int tiempoRec(ColaSimpleT A) {
	    if (A.esVacia()) {
	        return 0;
	    } else {
	        Tarea x = A.eli();
	        int n = x.getNumero();
	        int tiempo = n; // porque hacer la tarea N implica haber hecho 1..N

	        int resto = tiempoRec(A);
	        return Math.max(tiempo, resto); // nos quedamos con el mayor tiempo
	    }
	}
	
	public void mostrar() {
		ColaSimpleT aux = new ColaSimpleT();
		System.out.println("\nDatos de la cola Simple");
		Tarea x;
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
