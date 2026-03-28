import java.util.Scanner;

public class Mp_PilaCajaRef {
	private int n;
	private PilaCajaRef c[] = new PilaCajaRef[100];
	
	public Mp_PilaCajaRef(int n) {
		this.n = n;
		for(int i=0;i<n;i++) {
			c[i] = new PilaCajaRef();
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
	public void adicionar(int i,CajaRefresco cajR){
		c[i].adi(cajR);
	}
	public CajaRefresco eliminar(int i) {
		return c[i].eli();
	}
	public void llenar(int i, int n) {
		c[i].llenar(n);
	}
	public void llenar(int n) {
		this.n = n;
		Scanner lee = new Scanner(System.in);
		for (int i = 0; i < this.n; i++) {
			c[i] = new PilaCajaRef();
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
	public void vaciar(int i, PilaCajaRef z) {
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
