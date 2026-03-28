
import java.util.*;
public class ColaSimplePrioridad extends ColaPrioridad{
	public ColaSimplePrioridad() {
		super();
	}
	public boolean esVacia() {
		if(fr == fi) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean esLlena() {
		if(fi == max-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public void adi(Paciente elem) {
		if(esLlena()) {
			System.out.println("Cola simple llena!!!");
		}
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public Paciente eli() {
		Paciente elem = new Paciente();
		if(esVacia()) {
			System.out.println("Cola simple vacia!!!");
		}
		else {
			fr++;
			elem = v[fr];
		}
		return elem;
	}
	public int nroElem() {
		return (fi-fr);
	}
	public void vaciar(ColaSimplePrioridad z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Intr. nombre, edad, peso, nivel de prioridad");
			Paciente x = new Paciente();
			x.leer();
			adi(x);
		}
	}
	public void mostrar() {
		ColaSimplePrioridad aux = new ColaSimplePrioridad();
		Paciente x ;
		while(!esVacia()) {
			x = eli();
			x.mostrar();
			aux.adi(x);
		}
		vaciar(aux);
	}
}
