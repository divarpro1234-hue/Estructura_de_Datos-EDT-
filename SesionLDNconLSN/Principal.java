//Lic Aruquipa Marcelo
public class Principal {

	public static void main(String[] args) {
		
		//LISTA NORMAL ESTUDIANTE 1 
		Estudiante e1 = new Estudiante("juan");
		Estudiante e2 = new Estudiante("marco");
		Estudiante e3 = new Estudiante("ana");
		Estudiante e4 = new Estudiante("fredy");
		LS_NormalE E1 = new LS_NormalE();
		E1.adiFinal(e1);
		E1.adiFinal(e2);
		E1.adiFinal(e3);
		E1.adiFinal(e4);
		
		//LISTA NORMAL ESTUDIANTE 2
		Estudiante e5 = new Estudiante("marco");
		Estudiante e6 = new Estudiante("luis");
		Estudiante e7 = new Estudiante("ana");
		Estudiante e8 = new Estudiante("juan");
		LS_NormalE E2 = new LS_NormalE();
		E2.adiFinal(e5);
		E2.adiFinal(e6);
		E2.adiFinal(e7);
		E2.adiFinal(e8);
		
		//LISTA NORMAL ESTUDIANTE 3
		Estudiante e9 = new Estudiante("marco");
		Estudiante e10 = new Estudiante("jeny");
		Estudiante e11 = new Estudiante("fredy");
		LS_NormalE E3 = new LS_NormalE();
		E3.adiFinal(e9);
		E3.adiFinal(e10);
		E3.adiFinal(e11);
		
		//LISTA NORMAL ESTUDIANTE 4
		Estudiante e12 = new Estudiante("ana");
		Estudiante e13 = new Estudiante("elba");
		LS_NormalE E4 = new LS_NormalE();
		E4.adiFinal(e12);
		E4.adiFinal(e13);
	
		//Materias 
		
		Materia m1 = new Materia("inf-121",E1);
		Materia m2 = new Materia("inf-131",E2);
		Materia m3 = new Materia("inf-112",E3);
		Materia m4 = new Materia("inf-111",E4);
		
		LD_NormalM lm = new LD_NormalM();
		lm.adiFinal(m1);
		lm.adiFinal(m2);
		lm.adiFinal(m3);
		lm.adiFinal(m4);
		
		lm.mostrar();
		
		System.out.println("\na) Mostrar las siglas de las materias donde se encuentre el estudiante de nomx");
		String nomx = "fredy";
		mostrarSiglaMatEst(lm, nomx);
		System.out.println();
		System.out.println("\nb) Mostrar las materias que tengan el mayor numero de estudiantes");
		mostrarMatMayEst(lm);
		System.out.println();
		System.out.println("\nc) Sea el estudiante, Mostrar el numero de materia en la que se encuentra");
		System.out.println();
		contarEstNumeroMaterias(lm);
	}
	static void contarEstNumeroMaterias(LD_NormalM lm) {
		int c = 1;
		NodoM R = lm.getP();
		while(R!=null) {
			if(c==1) {
				
				LS_NormalE le = R.getMateria().getLe();
				NodoE S = le.getP();
				while(S!=null) {
					
					System.out.println("El Estudiante: "+S.getEst().getNombre()+" esta en: "+contarMaterias(S.getEst().getNombre(),lm)+" materias");
					S=S.getSig();
				}
				
			}
			c++;
			R=R.getSig();
		}
		
	}
	
	static int contarMaterias(String nombre, LD_NormalM lm) {
		int c = 0;
		NodoM R = lm.getP();
		while (R!=null) {
			LS_NormalE le = R.getMateria().getLe();
			NodoE S = le.getP();
			while (S!=null) {
				if (S.getEst().getNombre().equals(nombre)) {
					c++;
				}
				S=S.getSig();
			}
			R = R.getSig();
		}
		return c;
	}
	
	static void mostrarMatMayEst(LD_NormalM lm) {
		int may = mayorNroEst(lm);
		NodoM R = lm.getP();
		while(R !=null) {
			LS_NormalE le = R.getMateria().getLe();
			if(le.nroNodos() == may) {
				System.out.println("\n"+R.getMateria().getSigla());
				le.mostrar();
			}
			R = R.getSig();
		}
	}
	private static int mayorNroEst(LD_NormalM lm) {
		int may= 0;
		NodoM R = lm.getP();
		while(R != null) {
			LS_NormalE le = R.getMateria().getLe();
			if(may < le.nroNodos()) {
				may = le.nroNodos();
			}
			R = R.getSig();
		}
		return may;
	}
	static void mostrarSiglaMatEst(LD_NormalM lm, String nomx) {
		NodoM R = lm.getP();
		while(R != null) {
			LS_NormalE le = R.getMateria().getLe();
			if(buscarEst(le,nomx)) {
				System.out.print("\n"+R.getMateria().getSigla());
			}
			R = R.getSig();
		}
	}
	static boolean buscarEst(LS_NormalE le, String nomx) {
		NodoE R = le.getP();
		boolean sw = false;
		while(R != null) {
			if(R.getEst().getNombre().equals(nomx)) {
				sw = true;
			}	
			R = R.getSig();
		}
		return sw;
	}
}













