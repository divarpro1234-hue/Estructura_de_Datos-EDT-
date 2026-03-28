
import java.util.Scanner;

public class MC_CircularActividad {
	private int n;
	private ColaCircularActividad c[] = new ColaCircularActividad[100];
	
	public MC_CircularActividad(int n) {
		this.n = n;
		for(int i = 0; i < this.n; i++){
			this.c[i] = new ColaCircularActividad();
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
	public void adicionar(int i,Actividad Actividad){
		c[i].adicionar(Actividad);
	}
	public void adicionar(int n){
	  this.n = n;
	  for(int i = 0; i < this.n; i++){
	     c[i] = new ColaCircularActividad();
	  }
	}
	public Actividad eliminar(int i) {
		return c[i].eliminar();
	}
	public void llenar(int i, int n) {
		c[i].llenar(n);
	}
	public void llenar(int n) {
		this.n = n;
		Scanner lee = new Scanner(System.in);
		for (int i = 0; i < this.n; i++) {
			c[i] = new ColaCircularActividad();
			System.out.println("nro de Actividads de la pila");
			int nroActividad = lee.nextInt();
			c[i].llenar(nroActividad);
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
	public void vaciar(int i, ColaCircularActividad z) {
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
