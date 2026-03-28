import java.util.Scanner;

public class Mp_ColaSimpleCanciones {
	
	private int n;
	private ColaSimpleC c[] = new ColaSimpleC[100];
	
	public Mp_ColaSimpleCanciones(int n) {
		this.n = n;
		for(int i = 0; i < this.n; i++){
			this.c[i] = new ColaSimpleC();
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
	public void adicionar(int i,Canciones Canciones){
		c[i].adi(Canciones);
	}
	public void adicionar(int n){
	  this.n = n;
	  for(int i = 0; i < this.n; i++){
	     c[i] = new ColaSimpleC();
	  }
	}
	public Canciones eliminar(int i) {
		return c[i].eli();
	}
	public void llenar(int i, int n) {
		c[i].llenar(n);
	}
	public void llenar(int n) {
		this.n = n;
		Scanner lee = new Scanner(System.in);
		for (int i = 0; i < this.n; i++) {
			c[i] = new ColaSimpleC();
			System.out.println("nro de Cancioness de la pila");
			int nroCanciones = lee.nextInt();
			c[i].llenar(nroCanciones);
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
	public void vaciar(int i, ColaSimpleC z) {
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
