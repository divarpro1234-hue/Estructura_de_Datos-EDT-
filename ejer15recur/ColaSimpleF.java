import java.util.Scanner;

public class ColaSimpleF extends ColaF {

	public ColaSimpleF() {
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
	public void adi(Flor elem) {
		if(esLlena())
			System.out.println("cola simple llena!!!");
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public Flor eli() {
		Flor elem = new Flor();
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
	public void vaciar(ColaSimpleF z) {
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
	public int energiaRecolectada() {
	    return energiaRecolectadaRec(fr + 1, true);
	}

	private int energiaRecolectadaRec(int i, boolean sumar) {
	    if (i > fi) {
	        return 0;
	    }

	    int energia = v[i].getEnergia();
	    if (sumar) {
	        return energia + energiaRecolectadaRec(i + 1, false);
	    } else {
	        return -energia + energiaRecolectadaRec(i + 1, true);
	    }
	}

	
	public void mostrar() {
		ColaSimpleF aux = new ColaSimpleF();
		System.out.println("\nDatos de la cola Simple");
		Flor x;
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
