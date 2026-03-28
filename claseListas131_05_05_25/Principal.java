//Lic Aruquipa Marcelo
public class Principal {

	public static void main(String[] args) {
		//departamentos
		
		LD_NormalP A = new LD_NormalP();
		A.adiPrimero(new Proyecto("tienda", "willy", "monica"));
		A.adiPrimero(new Proyecto("juego", "ana", "brian"));
		A.adiPrimero(new Proyecto("uml", "jose", "adrian"));
		A.adiPrimero(new Proyecto("opp", "alan", "jorge"));

		A.mostrar();
//		System.out.println("---------------");
//		A.eliFinal();
//		A.eliPrimero();
//		
//		A.mostrar();
		
		//a) sea una lista doble de proyectos mostrar el titulo del proyecto donde participa el 
		// integrante de nombre x
		System.out.println("a) ------------------------------------");
		String nomx = "adrian";
		mostrarProyectoParticipaIntegNomX(A, nomx);
	}

	static void mostrarProyectoParticipaIntegNomX(LD_NormalP a, String nomx) {
		// TODO Auto-generated method stub
		NodoP R = a.getP();
		boolean sw = false;
		while(R != null) {
			Proyecto x = R.getProy();
			if(x.getNom1().equals(nomx) || x.getNom2().equals(nomx)) {
				sw = true;
				System.out.println("titulo de proyecto: "+x.getTitulo());
			}
			R = R.getSig();
		}
		if(!sw) {
			System.out.println("el estudiante " +nomx+ " no esta en ningun proy");
		}
	}
	

}













