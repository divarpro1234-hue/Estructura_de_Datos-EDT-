import java.util.Scanner;



public class ColaSimpleNodo extends ColaNodo{
	public ColaSimpleNodo() {
		super();
	}
	public boolean esVacia() {
		if(fr == fi)
			return true;
		return false;
	}
	public boolean esLlena() {
		if(fi == Max-1)
			return true;
		return false;
	}
	public void adi(NodoL elem) {
		if(esLlena())
			System.out.println("cola simple llena!!!");
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public NodoL eli() {
		NodoL elem = new NodoL();
		if(esVacia())
			System.out.println("Cola simple vacia!!");
		else {
			fr++;
			elem = v[fr];
		}
		return elem;
	}
	public int nroElem() {
		return (fi - fr);
	}
	public void vaciar(ColaSimpleNodo z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	
	public void mostrar() {
		ColaSimpleNodo aux = new ColaSimpleNodo();
		NodoL x;
		while(!esVacia()) {
			x = eli();
			//x.mostrar();
			System.out.print(x + "\t");
			aux.adi(x);
		}
		reiniciar();
		vaciar(aux);
	}
	public void reiniciar() {
		this.fi = -1;
		this.fr = -1;
	}
}
