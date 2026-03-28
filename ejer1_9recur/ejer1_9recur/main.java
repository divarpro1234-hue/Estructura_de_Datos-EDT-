package ejer1_9recur;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\nejercicio 1");
		int a = 6;
		System.out.println(sumaNumeroNatural(a));
		
		System.out.println("\nejercicio 3");
		mostrarDigitos(a);
		
		System.out.println("\nejercicio 5");
		System.out.println(factorial(a));
		
		System.out.println("\nejercicio 7");
		int[] vec = {5,4,3,4,8};
		int suma = sumaVector(vec, 0);
		System.out.println(suma);
		
		System.out.println("\nejercicio 9");
		int n = 5;
		System.out.println(fibonacci(n));
	}

	private static int fibonacci(int a) {
		// TODO Auto-generated method stub
		if(a == 1) {
			return 0;
		}
		if(a == 2) {
			return 1;
		}
		return fibonacci(a-1) + fibonacci(a-2);
	}

	private static int sumaVector(int[] vec, int i) {
		// TODO Auto-generated method stub
		if(i == vec.length) {
			return 0;  // caso base
		}
		return vec[i] + sumaVector(vec, i+1);  // caso recursivo
	}

	private static int factorial(int a) {
		// TODO Auto-generated method stub
		if(a == 0) {
			return 1;	// caso base
		}else {
			return a * factorial(a - 1);  // caso recursivo
		}
	}

	private static void mostrarDigitos(int a) {
		// TODO Auto-generated method stub
		if(a == 0) {
			return;		//caso base
		}
		System.out.println(a);
		mostrarDigitos(a-1);  //caso recursivo
	}

	private static int sumaNumeroNatural(int a) {
		// TODO Auto-generated method stub
		if(a != 0) {
			return a + sumaNumeroNatural(a-1); // caso recursivo
		}else {
			return 0;	// caso base
		}
	}

}
