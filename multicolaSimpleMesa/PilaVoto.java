

import java.util.Scanner;

public class PilaVoto extends VectorVoto{
	private
		int tope;
	public
	PilaVoto() {
		tope=-1;
	}
	boolean esVacia() {
		if(tope==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	boolean esLlena() {
		if (tope==max-1) {
			return true;
		}
		else {
			return false;
		}
	}
	void adicionar(String elem	){
		if (!esLlena()) {
			tope++;
			v[tope]=elem;
		}
		else {
			System.out.println("PilaVoto Llena!!!!!!!1");
		}
	}
	String eleminar(){
		String dato="";
		if (!esVacia()) {
			dato=v[tope];
			tope--;;
		}
		else {
			System.out.println("PilaVoto Vacia!!!!!!!!!");
		}
		return dato;
	}
	int nroElem() {
		return tope+1;
	}
	void llenar(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce el dato:");
		for (int i = 1; i <= n; i++) {
			String elem = sc.next();
			adicionar(elem);
		}
	}
	void mostrar() {
		PilaVoto aux = new PilaVoto();
		System.out.println("Datos de la PilaVoto");
		while(!esVacia()) {
			String dato = eleminar();
			System.out.println(dato);
			aux.adicionar(dato);
		}
		vaciar(aux);
	}
	void vaciar(PilaVoto p) {
		while (!p.esVacia()) {
			adicionar(p.eleminar());
		}
	}
	void NroElem() {
		PilaVoto aux = new PilaVoto();
		int c= 0;
		while(!esVacia()) {
			String dato = eleminar();
			System.out.println(dato);
			aux.adicionar(dato);
		}
		vaciar(aux);
	}
}
