//Lic Aruquipa Marcelo
public class Principal {

	public static void main(String[] args) {
		//lista persona
		
		LD_CircularP A = new LD_CircularP();
		
		A.adiFinal(new Proy("juan", 15));
		A.adiFinal(new Proy("alan", 19));
		A.adiFinal(new Proy("pepe", 20));
		A.adiFinal(new Proy("gabriel", 18));
		A.adiFinal(new Proy("saul", 16));
		
		A.mostrar();
		
		System.out.println("promdio de edad es: "+ promedioEdadPersona(A));
	}

//	static void promedioEdadPersona(LD_CircularP a) {
//		// TODO Auto-generated method stub
//		NodoP R = a.getP();
//		R = a.getP().getAnt()
//		while(R.getAnt() != a.getP()) {
//			E
//			R = R.getAnt();
//		}
//	}

	static double promedioEdadPersona(LD_CircularP a) {
		double sum = 0;
		NodoP R = a.getP();
		int nd = a.nroNodos();
		for (int i = 0; i < nd; i++) {
			sum = sum + R.getProy().getEdad();
			R = R.getSig();
		}
		return (sum/nd);
	}
}













