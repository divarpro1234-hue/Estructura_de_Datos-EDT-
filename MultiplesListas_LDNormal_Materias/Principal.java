//MARCELO ARUQUIPA
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("nombre: MARCELO ARUQUIPA");
		System.out.println("CI: 123456 \n");
		
		//LISTA DOBLE MULTIPLE 
		LD_NormalM ldm = new LD_NormalM();
		
		//LISTAS SIMPLES DE ESTUDIANTES
		LS_NormalE le1 = new LS_NormalE();
		LS_NormalE le2 = new LS_NormalE();
		LS_NormalE le3 = new LS_NormalE();
		LS_NormalE le4 = new LS_NormalE();
		
		le1.adiFinal("juan"); le1.adiFinal("marco"); le1.adiFinal("ana"); le1.adiFinal("fredy");
		le2.adiFinal("marco"); le2.adiFinal("luis"); le2.adiFinal("ana"); le2.adiFinal("juan");
		le3.adiFinal("marco"); le3.adiFinal("jeny"); le3.adiFinal("fredy");
		le4.adiFinal("ana"); le4.adiFinal("elba");
		
		ldm.adiPrimero("inf-111", le4);
		ldm.adiPrimero("inf-112", le3);
		ldm.adiPrimero("inf-131", le2);
		ldm.adiPrimero("inf-121", le1);
		
		//System.out.println(ldm.esVacia());
		//ldm.leer1(4);
		ldm.mostrar();
		
		System.out.println("\nmostrar siglas de las materia donde se encuentre el estudiante nomx");
		mostrarMatEst(ldm, "ana");
		
		System.out.println("\nmostrar las materias que tengan el mayor numero de estudiantes");
		mostrarMatMayEst(ldm);
		
		System.out.println("\nsea la primera materia de las lista doble de materias, "
				+ "de cada estudiante de esta primera materia, mostrar el nro de materias"
				+ " en la que se encuentra");
		mostrarNroMatPorEst(ldm);
		
	}

	private static void mostrarNroMatPorEst(LD_NormalM ldm) {
		// TODO Auto-generated method stub
		NodoM R = ldm.getP();
		int nMat = ldm.nroNodos();
		
		LS_NormalE lest = R.getLe();
		NodoE Q = lest.getP();
		int nd = lest.nroNodos();
		
		for (int i = 1; i <=9+ nd; i++) {
			String nomEst = Q.getNom();
			R = ldm.getP();
			for (int j = 1; j <= nMat-1; j++) {
				R = R.getSig();
				LS_NormalE le = R.getLe();
				if(buscarEst(le, nomEst)) {
					System.out.println("materia; " + R.getSigla());
				}
			}
			
			Q = Q.getSig();
		}
	}

	private static void mostrarMatMayEst(LD_NormalM ldm) {
		// TODO Auto-generated method stub
		NodoM R = ldm.getP();
		int nd = ldm.nroNodos();
		int may = buscarMayor(ldm);
		for (int i = 0; i < nd; i++) {
			LS_NormalE lest = R.getLe();
			
			
			if(lest.nroNodos() == may) {
				System.out.println("materia; " + R.getSigla());
			}
				
			R = R.getSig();
		}
	}

	private static int buscarMayor(LD_NormalM ldm) {
		// TODO Auto-generated method stub
		NodoM R = ldm.getP();
		int may = 0;
		int nd = ldm.nroNodos();
		for (int i = 0; i < nd; i++) {
			LS_NormalE lest = R.getLe();
			if(lest.nroNodos() > may) {
				may = lest.nroNodos();
			}
			R = R.getSig();
		}
		return may;
	}

	private static void mostrarMatEst(LD_NormalM ldm, String nomx) {
		// TODO Auto-generated method stub
		NodoM R = ldm.getP();
		boolean sw = false;
		while(R != null) {
			String sigla = R.getSigla();
			LS_NormalE lest = R.getLe();
			if(buscarEst(lest, nomx)) {
				sw = true;
				System.out.println("materia: " + sigla);
			}
			R = R.getSig();
		}
		if(!sw) {
			System.out.println("no se encontro al estudiante " + nomx);
		}
	}

	private static boolean buscarEst(LS_NormalE lest, String nomx) {
		// TODO Auto-generated method stub
		NodoE R = lest.getP();
		while(R != null) {
			if(R.getNom().compareTo(nomx) ==0)
				return true;
			R = R.getSig();
		}
		return false;
	}
}
