
import java.util.Scanner;

/**
 *
 * @author CALLISAYA
 */
public class Mc_Canciones {
    private int n;
	private ColaSimpleP c[] = new ColaSimpleP[100];
	
	public Mc_Canciones(int n){
		this.n = n;
		for (int i = 0; i < this.n; i++) {
			c[i] = new ColaSimpleP();
		}
	}
	
	public int nroElem(int i) {
		return c[i].nroElem();
	}
	public boolean esVacia(int i) {
		return c[i].esVacia();
	}
	public boolean esLlena(int i) {
		return c[i].esLlena();
	}
	public void adicionar(int i,Pedido est){
		c[i].adi(est);
	}
	public Pedido eliminar(int i) {
		return c[i].eli();
	}
	public void llenar(int i, int n) {
		c[i].llenar(n);
	}
	public void llenar(int n) {
		this.n = n;
		Scanner lee = new Scanner(System.in);
		for (int i = 0; i < this.n; i++) {
			c[i] = new ColaSimpleP();
			System.out.println("nro de canciones de la cola");
			int nroCanciones = lee.nextInt();
			c[i].llenar(nroCanciones);
		}
	}
	public void mostrar() {
		for (int i = 0; i < this.n-1; i++) {
			c[i].mostrar();
		}
	}
	public void mostrar(int i) {
		c[i].mostrar();
	}
	public void vaciar(int i, ColaSimpleP z) {
		c[i].vaciar(z);
	}
	public void vaciar(int i, int j) {
		c[i].vaciar(c[j]);
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
}
