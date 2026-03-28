package MultiColaDeEstudiantes;

import java.util.Scanner;

public class Mp_ColaCircularEstudiante {
	private int n;
	private ColaCircularEstudiante c[] = new ColaCircularEstudiante[100];
	
	public Mp_ColaCircularEstudiante(int n) {
		this.n = n;
		for(int i = 0; i < this.n; i++){
			this.c[i] = new ColaCircularEstudiante();
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
	     c[i] = new ColaCircularEstudiante();
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
			c[i] = new ColaCircularEstudiante();
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
	public void vaciar(int i, ColaCircularEstudiante z) {
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
