package ejerciciosRecursividad131;

import javax.annotation.processing.SupportedSourceVersion;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n\tEJEMPLOS DE RECURSIVIDAD");
		System.out.println("\nfactorial recursivo");
		System.out.println(factorial(5));
		
		System.out.println("\nsumatoria recursiva");
		System.out.println(sumatoria1(10));
		System.out.println(sumatoria2(10));
		
		System.out.println("\npotencia recursiva");
		System.out.println(potencia(2,10));
		
		System.out.println("\nsuma de n primeros pares");
		System.out.println(sumaPar(5));
		
		System.out.println("\nfibonacci recursivo");
		System.out.println(fibonacci(5));
		
		System.out.println("\nmostrar n primeros numeros");
		mostrar(5);
		
		System.out.println("\nsuma de n digitos");
		System.out.println(sumaDig(123456));
		
		System.out.println("\ncontar los digitos de n");
		System.out.println(contarDig(1234));
	}

	private static int contarDig(int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			return 0;
		}else {
			return (contarDig(n/10) + 1);
		}
	}

	private static int sumaDig(int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			return 0;
		}else {
			return (sumaDig(n/10) + (n%10));
		}
	}

	private static void mostrar(int n) {
		// TODO Auto-generated method stub
		if(n != 0) {
			mostrar(n-1);
			System.out.println(n);
		}
	}

	private static int fibonacci(int n) {
		// TODO Auto-generated method stub
		if(n == 1) {
			return 0;
		}else {
			if(n == 2) {
				return 1;
			}else {
				return fibonacci(n-1) + fibonacci(n-2);
			}
		}
	}

	private static int sumaPar(int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			return 0;
		}else {
			return (n * 2 + sumaPar(n-1));
		}
	}

	private static int potencia(int a, int b) {
		// TODO Auto-generated method stub
		if(b == 0) {
			return 1;
		}else {
			return (a * potencia(a, b-1));
		}
	}

	private static int sumatoria2(int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			return 0;
		}else {
			return n + sumatoria1(n-1);
		}
	}

	private static int sumatoria1(int n) {
		// TODO Auto-generated method stub
		if(n > 0) {
			return (n + sumatoria1(n-1));
		}else {
			return 0; 
		}
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			return 1;
		}else {
			return n * factorial(n-1);
		}
	}

}
