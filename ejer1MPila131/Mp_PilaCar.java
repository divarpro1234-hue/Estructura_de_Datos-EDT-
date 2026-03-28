import java.util.Scanner;

public class Mp_PilaCar {
	private int n;
	private PilaCar c[] = new PilaCar[100];
	
	public Mp_PilaCar(int n) {
		this.n = n;
		for(int i=0;i<n;i++) {
			c[i] = new PilaCar();
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
	public void adicionar(int i,char est){
		c[i].adi(est);
	}
	public char eliminar(int i) {
		return c[i].eli();
	}
	public void llenar(int i, int n) {
		c[i].llenar(n);
	}
	public void llenar(int n) {
		this.n = n;
		Scanner lee = new Scanner(System.in);
		for (int i = 0; i < this.n; i++) {
			c[i] = new PilaCar();
			System.out.println("nro de caracteres de la pila");
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
	public void vaciar(int i, PilaCar z) {
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
