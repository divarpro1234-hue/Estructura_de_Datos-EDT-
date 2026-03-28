
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MARCELO ARUQUIPA");
		System.out.println("CI 123456");
		
		ColaSimpleEst A = new ColaSimpleEst();
		//A.llenar(4);
		A.adi(new Estudiante("alan", "inf131", 75));
		A.adi(new Estudiante("gael", "inf121", 65));
		A.adi(new Estudiante("rosa", "inf", 51));
		A.adi(new Estudiante("ruben ", "inf131", 65));
		//A.adi(new Estudiante("armando", "fi", 75));
		
		A.mostrar();
		System.out.println("\nnro de elementos: " + A.nroElem());
		System.out.println(A.esVacia());
		System.out.println(A.esLlena());
		//b)
		System.out.println("\nllevar al principio");
		System.out.println();
		llevarPrincipioNota(A, 65);
		A.mostrar();
		
		//b) mejorado
		System.out.println("\nllevar al principio mejorado");
		System.out.println();
		llevarPrincipioNotaMejorado(A, 65);
		A.mostrar();
		
		//c) promedio de estudiantes
		
		double prom = promedioNotas(A);
		System.out.println("Promedio de notas: " + prom);
	}

	 static double promedioNotas(ColaSimpleEst a) {
		// TODO Auto-generated method stub
		System.out.println("\nnombre: Divar Husaman Mamani Callisaya");
		System.out.println("tema: Cola simple de estudiantes");
		ColaSimpleEst aux = new ColaSimpleEst();
		double suma=0;
		int contador=0;
		while(!a.esVacia()) {
			Estudiante estudiante=a.eli();
			suma = suma + estudiante.getNota();
			contador++;
			aux.adi(estudiante);
		}
		while (!aux.esVacia()) {
	        a.adi(aux.eli());
	    }

		if (contador > 0) {
	        return suma / contador; 
	    } else {
	        return 0; 
	    }
	}

	private static void llevarPrincipioNotaMejorado(ColaSimpleEst a, int notax) {
		// TODO Auto-generated method stub
		int nDatos = a.nroElem();
		ColaSimpleEst aux = new ColaSimpleEst();
		
		for(int i = 1; i <= nDatos; i++) {
			Estudiante x = a.eli();
			if(x.getNota() == notax)
				a.adi(x);
			else
				aux.adi(x);
		}
		a.vaciar(aux);
	}

	static void llevarPrincipioNota(ColaSimpleEst a, int notax) {
		// TODO Auto-generated method stub
		ColaSimpleEst aux1 = new ColaSimpleEst();
		ColaSimpleEst aux2 = new ColaSimpleEst();
		while(!a.esVacia()) {
			Estudiante x = a.eli();
			if(x.getNota() == notax)
				aux1.adi(x);
			else
				aux2.adi(x);
		}
		a.reiniciar();
		a.vaciar(aux1);
		a.vaciar(aux2);
	}
}
