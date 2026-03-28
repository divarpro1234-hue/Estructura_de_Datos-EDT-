import java.util.Scanner;

public class Mp_PilaAux {
	private int n;
	private PilaAux c[] = new PilaAux[100];
	
	public Mp_PilaAux(int n) {
		this.n = n;
		for(int i=0;i<n;i++) {
			c[i] = new PilaAux();
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
	public void adicionar(int i,Auxiliar est){
		c[i].adi(est);
	}
	public Auxiliar eliminar(int i) {
		return c[i].eli();
	}
	public void llenar(int i, int n) {
		c[i].llenar(n);
	}
	public void llenar(int n) {
		this.n = n;
		Scanner lee = new Scanner(System.in);
		for (int i = 0; i < this.n; i++) {
			c[i] = new PilaAux();
			System.out.println("nro de estudiantes de la pila");
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
	public void vaciar(int i, PilaAux z) {
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
