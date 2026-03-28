//Lic. Marcelo Aruquipa

import java.util.Scanner;

public class Nodo {
	private int num;
	private Nodo izq;
	private Nodo der;
	
	public Nodo() {
		izq = null;
		der = null;
	}

	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("intruduzca num");
		this.num = lee.nextInt();
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Nodo getIzq() {
		return izq;
	}

	public void setIzq(Nodo izq) {
		this.izq = izq;
	}

	public Nodo getDer() {
		return der;
	}

	public void setDer(Nodo der) {
		this.der = der;
	}
	
	
}
