//Lic Aruquipa Marcelo
//import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//lista persona
		LD_NormalE A = new LD_NormalE();
		A.adiFinal("saul", 80, "B");
		A.adiFinal("carlos", 70, "B");
		A.adiFinal("lucho", 100, "B");
		A.adiFinal("pedro", 90, "C");
		
		LD_NormalE A1 = new LD_NormalE();
		A1.adiFinal("joel", 90, "C");
		A1.adiFinal("ana", 85, "C");
		A1.adiFinal("alan", 90, "C");
		
		LD_NormalE A2 = new LD_NormalE();
		A2.adiFinal("daniel", 80, "A");
		A2.adiFinal("will", 90, "A");
		A2.adiFinal("pepe", 85, "C");
		
		LD_NormalM B = new LD_NormalM();
		B.adiFinal("programacion", A);
		B.adiFinal("base de datos", A1);
		B.adiFinal("estadistica", A2);
		
		B.mostrar();
		
		System.out.println("\na) Cuantos estudiantes aprobados tiene cada materia del paralelo X.");
		String paraleloX = "C";
		contarAprobMat(B,paraleloX);
		
		System.out.println("\nb) Mostrar a las materias con el mayor número de estudiantes aprobados.");
		mostrarMatMayEst(B);
		
	}

	private static void mostrarMatMayEst(LD_NormalM b) {
		// TODO Auto-generated method stub
		NodoM R = b.getP();
		int may = 0;
		while(R != null) {
			LD_NormalE le = R.getLest();
			NodoE S = le.getP();
			int estAprob = 0;
			
			while(S != null) {
				if(S.getNota() > 50) {
					estAprob++;
				}
				S = S.getSig();
			}
			if(estAprob>may) {
				may = estAprob;
			}
			R = R.getSig();
		}
		R = b.getP();
		while(R != null) {
			LD_NormalE le = R.getLest();
			NodoE S = le.getP();
			int estAp = 0;
			while(S != null) {
				if(S.getNota() > 50) {
					estAp ++;
				}
				S = S.getSig();
			}
			if(estAp == may) {
				System.out.println("materia: " + R.getMat() + " ,aprobados: " + estAp);
			}
			R = R.getSig();
		}
	}
	private static void contarAprobMat(LD_NormalM b, String paraleloX) {
		// TODO Auto-generated method stub
		NodoM R = b.getP();
		
		while(R != null) {
			LD_NormalE le = R.getLest();
			NodoE S = le.getP();
			int estAprob = 0;
			
			while(S != null) {
				if(S.getParalelo().equals(paraleloX)) {
					if(S.getNota() > 50) {
						estAprob++;
					}
				}
				S = S.getSig();
			}
			if(estAprob > 0) {
				System.out.println("materia " + R.getMat() + ": estudiantes aprobados: " + estAprob);
			}
			
			R = R.getSig();
		}
	}
}

