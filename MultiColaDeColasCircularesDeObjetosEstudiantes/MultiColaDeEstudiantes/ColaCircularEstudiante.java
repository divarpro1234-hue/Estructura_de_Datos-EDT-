package MultiColaDeEstudiantes;

import java.util.Scanner;

public class ColaCircularEstudiante extends ColaEstudiante{
	public ColaCircularEstudiante() {
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
	public void adi(Estudiante elem) {
		if(!esLlena()) {
			fi = (fi + 1) % MAX;
			v[fi] = elem;
		}else
			System.out.println("cola circular llena!!!");
	}
	public Estudiante eli() {
		Estudiante elem = new Estudiante("","");
		if(!esVacia()) {
			fr = (fr + 1) % MAX;
			elem = v[fr];
		}else
			System.out.println("Cola circular vacia!!");
		return elem;
	}
	
	public void vaciar(ColaCircularEstudiante z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Datos, Nombre y nota");
			String Nombre = lee.next();
			String Nota = lee.next();
			Estudiante elem = new Estudiante(Nombre, Nota);
			adi(elem);
		}
	}
	public void mostrar() {
		ColaCircularEstudiante aux = new ColaCircularEstudiante();
		System.out.println("\nDatos de la Cola Circular: ");
		while(!esVacia()) {
			Estudiante elem = eli();
			System.out.println(elem);
			aux.adi(elem);
		}
		vaciar(aux);
	}
}

