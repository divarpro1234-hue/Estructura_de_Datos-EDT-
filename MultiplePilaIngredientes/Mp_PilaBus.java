import java.util.Scanner;

public class Mp_PilaBus {
	private int n;
	private PilaBus c[] = new PilaBus[100];
	
	public Mp_PilaBus(int n) {
		this.n = n;
		for(int i=0;i<n;i++) {
			c[i] = new PilaBus();
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
	public void adicionar(int i,Bus est){
		c[i].adi(est);
	}
	public Bus eliminar(int i) {
		return c[i].eli();
	}
	public void llenar(int i, int n) {
		c[i].llenar(n);
	}
	public void llenar(int n) {
		this.n = n;
		Scanner lee = new Scanner(System.in);
		for (int i = 0; i < this.n; i++) {
			c[i] = new PilaBus();
			System.out.println("nro de buses de la pila");
			int nroEst = lee.nextInt();
			c[i].llenar(nroEst);
		}
	}
	public void mostrar() {
		for (int i = 0; i < this.n; i++) {
			c[i].mostrar();
		}
	}
	public void mostrar(int i) {
		c[i].mostrar();
	}
	public void vaciar(int i, PilaBus z) {
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
