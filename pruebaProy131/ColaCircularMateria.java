import java.util.Scanner;

public class ColaCircularMateria extends ColaMateria{
	public ColaCircularMateria() {
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
	public void adi(Materia elem) {
		if(!esLlena()) {
			fi = (fi + 1) % MAX;
			v[fi] = elem;
		}else
			System.out.println("cola circular llena!!!");
	}
	public Materia eli() {
		Materia elem = new Materia();
		if(!esVacia()) {
			fr = (fr + 1) % MAX;
			elem = v[fr];
		}else
			System.out.println("Cola circular vacia!!");
		return elem;
	}
	
	public void vaciar(ColaCircularMateria z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
//	public void llenar(int n) {
//		Scanner lee = new Scanner(System.in);
//		
//		for (int i = 1; i <= n; i++) {
//			System.out.println("Intr. numero entero");
//			int elem = lee.nextInt();
//			adi(elem);
//		}
//	}
	public void mostrar() {
		ColaCircularMateria aux = new ColaCircularMateria();
		System.out.println("cola materia");
		while(!esVacia()) {
			Materia elem = eli();
			elem.mostrar();
			aux.adi(elem);
		}
		vaciar(aux);
	}
}
