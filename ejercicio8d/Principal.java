//Lic Aruquipa Marcelo
public class Principal {

	public static void main(String[] args) {
		
		//lista materia
		Pais p1 = new Pais("eeuu", 2000000, "10", "asia");
		Pais p2 = new Pais("bracil", 2000000, "10", "america");
		Pais p3 = new Pais("africa", 10000000,"20", "africa");
		Pais p4 = new Pais("francia", 2000000,"12", "europa");
		Pais p5 = new Pais("madacazcar", 30000,"6", "oceania");
		LD_CircularP lp1 = new  LD_CircularP();
		lp1.adiFinal(p1);
		lp1.adiFinal(p2);
		lp1.adiFinal(p3);
		lp1.adiFinal(p4);
		lp1.adiFinal(p5);
		System.out.println("\n\tDATOS DE LA LISTA PAIS");
		//lp1.mostrar();
		
		agruparPorContinente(lp1);
		lp1.mostrar();
	}

	private static void agruparPorContinente(LD_CircularP a) {
	    String[] cont = {"asia", "america", "africa", "oceania", "europa"};
	    LD_CircularP aux = new LD_CircularP();

	    for (int i = 0; i < cont.length; i++) { 
	        NodoP R = a.getP();
	        do {
	            if (R.getPais().getContinente().equals(cont[i])) {
	                aux.adiFinal(R.getPais());
	            }
	            R = R.getSig();
	        } while (R != a.getP());
	    }
	    a.setP(aux.getP());
	}	
}













