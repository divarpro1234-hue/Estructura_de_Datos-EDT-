package ColaSimpleJuguetes;
import java.util.Scanner;

public class ColaSimpleJuguete extends ColaJuguete{

	public ColaSimpleJuguete() {
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
	public void adi(Juguete elem) {
		if(esLlena())
			System.out.println("cola simple llena!!!");
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public Juguete eli() {
		Juguete elem = new Juguete("", "",0, "");
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
	public void vaciar(ColaSimpleJuguete z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Intr. nombre, tipo, nivel desgaste, dueño");
			String nom = lee.next();
			String tipo = lee.next();
			int nivelDes = lee.nextInt();
			String duenio =  lee.next();
			
			Juguete x = new Juguete(nom, tipo, nivelDes, duenio);
			adi(x);
		}
	}
	public void mostrar() {
		ColaSimpleJuguete aux = new ColaSimpleJuguete();
		Juguete x;
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