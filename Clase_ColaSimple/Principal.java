
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		ColaSimpleEst A = new ColaSimpleEst();
		//A.llenar(4);
		A.adi(new Estudiante("alan", "inf131", 75));
		A.adi(new Estudiante("gael", "inf121", 65));
		A.adi(new Estudiante("rosa", "inf", 51));
		A.adi(new Estudiante("ruben", "inf131", 65));
		//A.adi(new Estudiante("armando", "fis", 75));
		
		A.mostrar();
		System.out.println("\nnro de elementos: " + A.nroElem());
		System.out.println(A.esVacia());
		System.out.println(A.esLlena());
		
	}
}
