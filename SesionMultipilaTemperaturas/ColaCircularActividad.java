import java.util.Scanner;

public class ColaCircularActividad extends ColaActividad{

	public ColaCircularActividad() {
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
	public void adi(EspacioDep x) {
		if(esLlena())
			System.out.println("cola simple llena!!!");
		else {
			fi++;
			v[fi] = x;
		}
	}
	public Actividad eli() {
		Actividad elem = new Actividad();
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
	public void vaciar(ColaCircularActividad z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Intr datos de la Zona");
			Actividad x = new Actividad();
			x.llenar();
			adi(x);
		}
	}
	public void mostrar() {
		ColaCircularActividad aux = new ColaCircularActividad();
		Actividad x;
		while(!esVacia()) {
			x = eli();
			x.mostrar();
			aux.adi(x);
		}
		vaciar(aux);
	}
	
	
}