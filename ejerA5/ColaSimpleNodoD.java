import java.util.Scanner;

public class ColaSimpleNodoD extends ColaNodoD{
	public ColaSimpleNodoD() {
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
	public void adi(NodoD elem) {
		if(esLlena())
			System.out.println("cola simple llena!!!");
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public NodoD eli() {
		NodoD elem = new NodoD();
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
	public void vaciar(ColaSimpleNodoD z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	
	public void mostrar() {
		ColaSimpleNodoD aux = new ColaSimpleNodoD();
		NodoD x;
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
