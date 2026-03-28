
public class Principal {
	public static void main(String[] args) {
		//a
		int n = 8;
		System.out.println("\na) Generar los n primeros números de la serie de Fibonacci");
        System.out.println("los primeros "+ n +" numeros de la serie fibonacci son: ");
        mostrar(n, 0);
        //b
        int a = 5;
        System.out.println();
        System.out.println("\nb) Suma los dígitos de un numero X: " + a);
        System.out.println("la suma es: " + sumaDig(a));
        //c
        System.out.println();
        System.out.println("\nc) Halla el valor de un numero X elevado a la potencia Y");
        int x = 4;
        int y = 2;
        System.out.println("El numero "+ x +" elevado a la potencia "+ y + " es: "+ potenciaRec(x,y));
        
	}
	
	
	static int sumaDig(int a) {
		// TODO Auto-generated method stub
		if(a == 0)
			return 0;
		else
			return (sumaDig(a-1) + (a));
	}


	static int potenciaRec(int x, int y) {
		// TODO Auto-generated method stub
		if(y == 0)
			return 1;
		else
			return (x * potenciaRec(x, y-1));
		
	}
	static int fibonacciRec(int n) {
		// TODO Auto-generated method stub
        if (n == 0) 
        	return 0;
        if (n == 1) 
        	return 1;
        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }
	public static void mostrar(int n, int i) {
		// TODO Auto-generated method stub
        if (i < n) { 
            System.out.print(fibonacciRec(i) + " ");
            mostrar(n, i + 1);
        }
    }
}