
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ColaSimpleEst c1 = new ColaSimpleEst();
		c1.adi(new Estudiante("123456", "alan", 6, 70, "informatica"));
		c1.adi(new Estudiante("123321", "alan", 6, 70, "informatica"));
		c1.adi(new Estudiante("111111", "alan", 6, 70, "informatica"));
		c1.adi(new Estudiante("147852", "ricardo", 5, 65, "matematica"));
		c1.adi(new Estudiante("147852", "ricardo", 5, 65, "matematica"));
		c1.adi(new Estudiante("147852", "ricardo", 5, 65, "informatica"));

		c1.mostrar();
		
		System.out.println("\na) Verificar si algún estudiante está inscrito"
				+ " en más de una carrera.");
		if(verificarEstInscritoMasCarrera(c1)) {
			System.out.println("si existe");
		}else
			System.out.println("NO existe");
		
		c1.mostrar();
		
		System.out.println("\nb) Contar cuantos estudiantes hay de la "
				+ "carrera de Informática. ");
		
		contarEstudiantesInf(c1);
	}

	private static void contarEstudiantesInf(ColaSimpleEst c1) {
		// TODO Auto-generated method stub
		ColaSimpleEst aux = new ColaSimpleEst();
		int cnt =0;
		while(!c1.esVacia()) {
			Estudiante x = c1.eli();
			if(x.getCarrera()=="informatica") {
				cnt++;
			}
			aux.adi(x);
		}
		c1.vaciar(aux);
		System.out.println("Hay "+ cnt + " estudiantes en informatica");
		
	}

	private static boolean verificarEstInscritoMasCarrera(ColaSimpleEst c1) {
		// TODO Auto-generated method stub
		
		ColaSimpleEst aux = new ColaSimpleEst();
		while(!c1.esVacia()) {
			ColaSimpleEst aux2 = new ColaSimpleEst();
			Estudiante x = c1.eli();
			while(!c1.esVacia()) {
				Estudiante y = c1.eli();
				if(x.getCi() == y.getCi()) {
					aux2.adi(x);
					aux2.adi(y);
					
					c1.vaciar(aux2);
					return true; 
				}
				aux2.adi(y);		
			}
			c1.vaciar(aux2);
			aux.adi(x);
		}
		c1.vaciar(aux);
		return false;
	}
//	
//	private static void verificaEstudianteDosCarreras(ColaSimpleEst A) {
//		ColaSimpleEst aux = new ColaSimpleEst();
//		ColaSimpleEst aux2 = new ColaSimpleEst();
//		while(!A.esVacia()) {
//			Estudiante x = A.eli();
//			while(!A.esVacia()) {
//				Estudiante y = A.eli();
//				if(y.getCi().equals(x.getCi())) {
//					x.mostrar();
//					System.out.println("------------");
//					y.mostrar();
//				}
//				aux2.adi(y);
//			}
//			A.vaciar(aux2);
//			aux.adi(x);
//		}
//		A.vaciar(aux);
//		
}