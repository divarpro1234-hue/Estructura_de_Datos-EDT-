import java.util.Scanner;

public class ColaSimpleEstudiante extends ColaEstudiante {

	public ColaSimpleEstudiante() {
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
	public void adi(Estudiante elem) {
		if(esLlena())
			System.out.println("cola simple llena!!!");
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public Estudiante eli() {
		Estudiante elem = new Estudiante("", "");
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
	public void vaciar(ColaSimpleEstudiante z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Intr. nombre, materia");
			String nom = lee.next();
			String materia = lee.next();
			
			Estudiante x = new Estudiante(nom, materia);
			adi(x);
		}
	}
	public void mostrar() {
		ColaSimpleEstudiante aux = new ColaSimpleEstudiante();
		System.out.println("\nDatos de la cola Simple");
		Estudiante x;
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
