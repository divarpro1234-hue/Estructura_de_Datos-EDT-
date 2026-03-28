
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		LS_NormalEst A = new LS_NormalEst();
		A.adiFinal(new Estudiante("saul", "Gryffindor", 3, "muggle", 50));
		A.adiFinal(new Estudiante("lucho", "Slytherin", 2, "mestizo", 10));
		A.adiFinal(new Estudiante("daniel", "Slytherin", 2, "mestizo", 60));
		A.adiFinal(new Estudiante("pepe", "Ravenclaw", 1, "puro", 19));
		A.adiFinal(new Estudiante("joel", "Hufflepuff", 3, "muggle", 60));
		A.mostrar();
		System.out.println("\n" + A.esVacia());
		System.out.println("numero de nodos de la lista: " + A.nroNodos());
		
		System.out.println("\na) Insertar un estudiante en la posición X.");
		int posX = 2;
		insertarEstPosicionX(A, posX);
		A.mostrar();
		
		System.out.println("\nb) Contar los estudiantes de la casa de Ravenclaw.");
		contarEstCasa(A);
		
		System.out.println("\nc) Mostrar a los estudiantes con "
				+ "mayor nivel de magia.\r\n"
				+ "");
		mostrarEstMayorNivMagia(A);
		
		System.out.println("\nd) Eliminar a los estudiantes con nivel "
				+ "de magia menor a 20");
		EliminarEstNivMagiaMenor(A);
		
	}

	private static LS_NormalEst EliminarEstNivMagiaMenor(LS_NormalEst a) {
		// TODO Auto-generated method stub
		NodoEst R = a.getP();
		LS_NormalEst eli = new LS_NormalEst();
		while(R != null) {
			Estudiante est = R.getEst();
			if(R.getEst().getNivMagia() < 20) {
				a.getP().setEst(est);
				a.eliPrincipio();
				eli.adiFinal(est);
			}
			R = R.getSig();
		}	
		eli.mostrar();	
		return eli;
		
	}

	private static void mostrarEstMayorNivMagia(LS_NormalEst a) {
		// TODO Auto-generated method stub
		NodoEst R = a.getP();
		NodoEst S = a.getP();
		int may = 0;
		while(R != null) {
			if(R.getEst().getNivMagia() > may) {
				may = R.getEst().getNivMagia();
			}
			R = R.getSig();
		}
		R = a.getP();
		while(R != null) {
			if(R.getEst().getNivMagia() == may) {
				R.getEst().mostrar();
			}
			R = R.getSig();
		}
	
	}

	private static void contarEstCasa(LS_NormalEst a) {
		// TODO Auto-generated method stub
		NodoEst R = a.getP();
		int cnt = 0;
		while(R != null) {
			if(R.getEst().getCasa() == "Ravenclaw") {
				cnt++;
			}
			R = R.getSig();
		}
		System.out.println("Estudiantes de la casa de Ravenclaw son: " + cnt);
	}

	private static void insertarEstPosicionX(LS_NormalEst a, int posX) {
		// TODO Auto-generated method stub
		NodoEst R = a.getP();
		NodoEst S = a.getP();
		for (int i = 0; i < posX; i++) {
			S = R;
			R = R.getSig();
		}
		NodoEst nuevo = new NodoEst();
		Estudiante x = new Estudiante("fercho", "Gryffindor", 3, "muggle", 50);
		nuevo.setEst(x);
		S.setSig(nuevo);
		nuevo.setSig(R);
		
	}

}