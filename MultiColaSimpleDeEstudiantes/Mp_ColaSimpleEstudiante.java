import java.util.Scanner;

public class Mp_ColaSimpleEstudiante {
	
	private int n;
	private ColaSimpleEstudiante c[] = new ColaSimpleEstudiante[100];
	
	public Mp_ColaSimpleEstudiante(int n) {
		this.n = n;
		for(int i = 0; i < this.n; i++){
			this.c[i] = new ColaSimpleEstudiante();
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
	public void adicionar(int i,Estudiante Estudiante){
		c[i].adi(Estudiante);
	}
	public void adicionar(int n){
	  this.n = n;
	  for(int i = 0; i < this.n; i++){
	     c[i] = new ColaSimpleEstudiante();
	  }
	}
	public Estudiante eliminar(int i) {
		return c[i].eli();
	}
	public void llenar(int i, int n) {
		c[i].llenar(n);
	}
	public void llenar(int n) {
		this.n = n;
		Scanner lee = new Scanner(System.in);
		for (int i = 0; i < this.n; i++) {
			c[i] = new ColaSimpleEstudiante();
			System.out.println("nro de Estudiantes de la pila");
			int nroEstudiante = lee.nextInt();
			c[i].llenar(nroEstudiante);
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
	public void vaciar(int i, ColaSimpleEstudiante z) {
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
