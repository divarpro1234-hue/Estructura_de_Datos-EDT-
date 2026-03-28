package Clases;

import java.util.Scanner;

public class ColaCircularC extends ColaC{
	public ColaCircularC() {
		super();
	}
	public int nroElem() {
		return (fi - fr + MAX) % MAX;
	}
	public boolean esVacia() {
		if(nroElem() == 0)
			return true;
		return false;
		
	}
	public boolean esLlena() {
		if(nroElem() == MAX-1)
			return true;
		return false;
	}
	public void adi(Consultorio elem) {
		if(!esLlena()) {
			fi = (fi + 1) % MAX;
			v[fi] = elem;
		}else
			System.out.println("cola circular llena!!!");
	}
	public Consultorio eli() {
		Consultorio elem = new Consultorio();
		if(!esVacia()) {
			fr = (fr + 1) % MAX;
			elem = v[fr];
		}else
			System.out.println("Cola circular vacia!!");
		return elem;
	}
	
	public void vaciar(ColaCircularC z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
//	public void llenar(int n) {
//		Scanner lee = new Scanner(System.in);
//		
//		for (int i = 1; i <= n; i++) {
//			System.out.println("Datos, Nombre y nota");
//			String Nombre = lee.next();
//			String Nota = lee.next();
//			Consultorio elem = new Consultorio(Nombre, Nota);
//			adi(elem);
//		}
//	}
	public void mostrar() {
		ColaCircularC aux = new ColaCircularC();
//		System.out.println("\nDatos de la Cola Circular: ");
		while(!esVacia()) {
			Consultorio elem = eli();
			elem.mostrar();
			aux.adi(elem);
		}
		vaciar(aux);
	}
}

