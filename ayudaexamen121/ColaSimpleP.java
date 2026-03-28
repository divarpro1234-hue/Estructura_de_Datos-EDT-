
import java.util.Scanner;
/**
 *
 * @author CALLISAYA
 */
public class ColaSimpleP extends ColaP{
    
    public ColaSimpleP() {
		super();
	}
	public boolean esVacia() {
		if(fr == fi)
			return true;
		return false;
		
	}
	public boolean esLlena() {
		if(fi == max-1)
			return true;
		return false;
	}
	public void adi(Pedido elem) {
		if(esLlena())
			System.out.println("cola simple llena!!!");
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public Pedido eli() {
		Pedido elem = new Pedido("", "", 0, 0);
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
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Intr. titulo, genero, cantante, duracion");
			String titulo = lee.next();
			String genero = lee.next();
			String cantante = lee.next();
			double duracion = lee.nextDouble();
			
			Pedido x = new Pedido();
			adi(x);
		}
	}
	public void mostrar() {
		ColaSimpleP aux = new ColaSimpleP();
                System.out.println("\nDatos de la cola: ");
		Pedido x;
		while(!esVacia()) {
			x = eli();
			x.mostrar();
			aux.adi(x);
		}
		vaciar(aux);
	}
     
}
