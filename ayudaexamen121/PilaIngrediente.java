import java.util.Scanner;

public class PilaIngrediente extends VectorIng {
	private int tope;

	PilaIngrediente() {
		tope = -1;
	}

	boolean esVacia() {
		return tope == -1;
	}

	boolean esLlena() {
		return tope == max - 1;
	}

	void adicionar(Ingredientes x) {
		if (!esLlena()) {
			tope++;
			v[tope] = x;
		} else {
			System.out.println("Pila llena!");
		}
	}

	Ingredientes eliminar() {
		Ingredientes x = new Ingredientes();
		if (!esVacia()) {
			x = v[tope];
			tope--;
		} else {
			System.out.println("Pila vacia!");
		}
		return x;
	}

	void llenar(int n) {
		for (int i = 1; i <= n; i++) {
			// adicionar() n-veces
			Ingredientes x = new Ingredientes();
			x.leer();
			adicionar(x);
		}
	}

	void vaciar(PilaIngrediente aux) {
		while (!aux.esVacia()) {
			adicionar(aux.eliminar());
		}
	}

	void mostrar() {
		System.out.println("Pila Ingrediente:");
		PilaIngrediente aux = new PilaIngrediente();
		while (!esVacia()) {
			Ingredientes x = eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}

	int nroElem() {
		return tope + 1;
	}

}