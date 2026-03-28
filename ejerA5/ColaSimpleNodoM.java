import java.util.Scanner;

public class ColaSimpleNodoM extends ColaNodoM{
	public ColaSimpleNodoM() {
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
	public void adi(NodoM elem) {
		if(esLlena())
			System.out.println("cola simple llena!!!");
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public NodoM eli() {
		NodoM elem = new NodoM();
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
	public void vaciar(ColaSimpleNodoM z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	
	public void mostrar() {
		ColaSimpleNodoM aux = new ColaSimpleNodoM();
		NodoM x;
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
