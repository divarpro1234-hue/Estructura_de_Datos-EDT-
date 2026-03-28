

import java.util.Iterator;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		LS_NormalM A = new LS_NormalM();
		A.adiFinal(new Medalla("saul", "futbol", "oro","bolivia"));
		A.adiFinal(new Medalla("fernando", "basquet", "plata","peru"));
		A.adiFinal(new Medalla("daniel", "voleybol", "bronce","paraguay"));
		A.adiFinal(new Medalla("joel", "futbol", "oro","brasil"));
		A.adiFinal(new Medalla("fabricio", "natacion", "oro","bolivia"));
		A.mostrar();
		
		System.out.println("\nmostrar cuantas medallas de oro obtuvoel paisx");
		String paisx = "bolivia";
		System.out.println();
//		System.out.println("medallas de oro obtuvidas por paisx es: "
//				+ ""+ mostrarMedallaOroPais(A.getP(),paisx));
//		System.out.println("\n--------datos de la lista---------");
//		A.mostrar();
		
//		int cant = contarMedOroPais(A,paisx);
//		System.out.println("medallas de oro obtuvidas por paisx es: "+cant);
//		System.out.println("\n--------datos de la lista---------");
//		A.mostrar();
//		deja la lista vacia al ejecutar
		
		System.out.println("\nmostrar a los ganadores de la disciplina z");
		String discX = "futbol";
		System.out.println();
//		mostrarGanadorDiscX(A.getP(), discX);
//		System.out.println("\n--------datos de la lista---------");
//		A.mostrar();
		mostrarGanadorDiscX2(A, discX);
		System.out.println("\n--------datos de la lista---------");
		A.mostrar();
		
	}

	private static void mostrarGanadorDiscX2(LS_NormalM a, String discX) {
		// TODO Auto-generated method stub
		if(a.nroNodos() != 0) {
			NodoM m = a.eliPrincipio();
			Medalla x = m.getMed();
			if(x.getDisciplina().equals(discX)) {
				x.mostrar();
			}
			mostrarGanadorDiscX2(a, discX);
		}
	}

//	private static void mostrarGanadorDiscX(NodoM R, String discX) {
//		// TODO Auto-generated method stub
//		if(R != null) {
//			Medalla x = R.getMed();
//			if(x.getDisciplina().equals(discX)) {
//				x.mostrar();
//			}
//			mostrarGanadorDiscX(R.getSig(),discX);
//			
//		}
//	}
	
//	private static int contarMedOroPais(LS_NormalM a, String paisx) {
//		// TODO Auto-generated method stub
//		if(a.nroNodos() != 0) {
//			NodoM m = a.eliPrincipio();
//			int c = contarMedOroPais(a, paisx);
//			if(m.getMed().getPais().equals(paisx) && m.getMed().getMedalla().equals("oro")) {
//				return (c+1);
//			}else {
//				return c;
//			}
//		}else {
//			return 0;
//		}
//	}
	
	
	
//	private static int mostrarMedallaOroPais(NodoM R, String paisx) {
//		// TODO Auto-generated method stub
//		if(R != null) {
//			Medalla x = R.getMed();
//			if(x.getPais().equals(paisx) && x.getMedalla().equals("oro")) {
//				return mostrarMedallaOroPais(R.getSig(), paisx)+1;
//			}else {
//				return mostrarMedallaOroPais(R.getSig(), paisx);
//			}
//		}else {
//			return 0;
//		}
//	}

	
	
	
}