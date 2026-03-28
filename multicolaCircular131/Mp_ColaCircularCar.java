
import java.util.Scanner;

public class Mp_ColaCircularCar {
	private int n;
	private ColaCircularCar c[] = new ColaCircularCar[100];
	
	public Mp_ColaCircularCar(int n) {
		this.n = n;
		for(int i = 0; i < this.n; i++){
			this.c[i] = new ColaCircularCar();
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
	public void adicionar(int i,char elem){
		c[i].adi(elem);
	}
	public void adicionar(int n){
	  this.n = n;
	  for(int i = 0; i < this.n; i++){
	     c[i] = new ColaCircularCar();
	  }
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
			c[i] = new ColaCircularCar();
			System.out.println("nro de chars de la pila");
			int nrochar = lee.nextInt();
			c[i].llenar(nrochar);
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
	public void vaciar(int i, ColaCircularCar z) {
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
