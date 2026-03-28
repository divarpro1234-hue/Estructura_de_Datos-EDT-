
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColaSimpleExamen A = new ColaSimpleExamen();
		Examen a1 = new Examen("Marco", "2003", 50);
		Examen a2 = new Examen("Joel", "2001", 70);
		Examen a3 = new Examen("Daniel", "2004", 60);
		Examen a4 = new Examen("Leonardo", "2005", 50);
		Examen a5 = new Examen("Leo", "2006", 40);
		Examen a6 = new Examen("Victor", "2007", 80);
		Examen a7 = new Examen("Axel", "2009", 60);
		Examen a8 = new Examen("Paolo", "2008", 55);
		A.adi(a1);
		A.adi(a2);
		A.adi(a3);
		A.adi(a4);
		A.adi(a5);
		A.adi(a6);
		A.adi(a7);
		A.adi(a8);
		
		//Inciso a)
		System.out.println("\norden nota ascendente");
		ordenarNota(A);
		A.mostrar();

		//Inciso b)
		mostrarCalificacionBaja(A);
		System.out.println("\nLa nota menor es: "+notaMenor(A));
		
		//C)
		mostrarNombreNotaAlta(A);
		//d)
		int aniox = 2009;
		int notax = 50;
		mostrarEstudiantesAprov(A,aniox,notax);

		
	}
	static ColaSimpleExamen mostrarEstudiantesAprov(ColaSimpleExamen A, int aniox, int notax) {
		// TODO Auto-generated method stub
		int n = A.nroElem();
		for (int i = 0; i < n-1; i++) {
			Examen x = A.eli();
			double nota = x.getNota();
			int fechaNac = Integer.parseInt(x.getfechaNac());
			if(nota>notax && fechaNac<=aniox) {
				System.out.println("Estudiante aprovado con nota de "+nota+ " y fecha de nacimiento "+fechaNac);
			}
			
			A.adi(x);
		}
		return A;
	}
	static void mostrarNombreNotaAlta(ColaSimpleExamen A) {
		// TODO Auto-generated method stub
		ColaSimpleExamen aux = new ColaSimpleExamen();
		double mayor=notaMayor(A);
		int n = A.nroElem();
		for(int i=0;i<n;i++) {
			Examen x = A.eli();
			if(x.getNota() == mayor) {
				aux.adi(x);
				System.out.println("\nEl nombre del estudiante con mayor nota es: "+x.getnombreEstudiante());
				System.out.println();
			} 
			A.adi(x);
			
		}
		A.vaciar(aux);	
	}
	static double notaMayor(ColaSimpleExamen A) {
		double mayor = Double.MIN_VALUE;
		int n=A.nroElem();
		for(int i=0;i<n;i++) {
			Examen x=A.eli();
			if(x.getNota() >  mayor) {
				mayor=x.getNota();
			}
			A.adi(x);
		}
		return mayor;		
	}

	static void mostrarCalificacionBaja(ColaSimpleExamen A) {
		// TODO Auto-generated method stub
		ColaSimpleExamen aux = new ColaSimpleExamen();
		double menor=notaMenor(A);
		int n = A.nroElem();
		for(int i=0;i<n;i++) {
			Examen x = A.eli();
			if(x.getNota() == menor) {
				aux.adi(x);
			} 
			A.adi(x);
			
		}
		A.vaciar(aux);	
	}
	static double notaMenor(ColaSimpleExamen A) {
		double menor = Double.MAX_VALUE;
		int n=A.nroElem();
		for(int i=0;i<n;i++) {
			Examen x=A.eli();
			if(x.getNota() <  menor) {
				menor=x.getNota();
			}
			A.adi(x);
		}
		return menor;		
	}
	
	
	static void ordenarNota(ColaSimpleExamen A) {
		ColaSimpleExamen ord=new ColaSimpleExamen();
		while(!A.esVacia()) {
			double mayor=notaMenor(A);
			int n=A.nroElem();
			for(int i=0;i<n;i++) {
				Examen x=A.eli();
				if(x.getNota()==mayor) {
					ord.adi(x);
				}else {
					A.adi(x);
				}
			}			
		}
		A.vaciar(ord);		
	}
	
	
}
