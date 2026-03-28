//Lic Aruquipa Marcelo
public class Principal {

	public static void main(String[] args) {
		
		Participante p1 = new Participante("xx", "sem1");
		Participante p2 = new Participante("yy", "sem2");
		Participante p3 = new Participante("zz", "sem3");
		
		LS_CircularP lp1 = new LS_CircularP();
		lp1.adiFinal(p1);
		lp1.adiFinal(p2);
		lp1.adiFinal(p3);
		
		Participante p4 = new Participante("xx", "sem2");
		Participante p5 = new Participante("ee", "sem1");
		Participante p6 = new Participante("oo", "sem4");
		
		LS_CircularP lp2 = new LS_CircularP();
		lp2.adiFinal(p4);
		lp2.adiFinal(p5);
		lp2.adiFinal(p6);
		
		Comite c1 = new Comite("comite x", "fernando", lp1);
		Comite c2 = new Comite("comite y", "pedro", lp2);
		LD_CircularC lcom1 = new LD_CircularC();
		lcom1.adiFinal(c1);
		lcom1.adiFinal(c2);
		System.out.println("\n\tDATOS DE LA LISTA COMITE");
		lcom1.mostrar();
		
		//a)
		System.out.println("");
		String comx = "comite x";
		System.out.println("Participantes del comite x que son parte de otros comites:");
		mostrarParticipantesComitexEnOtros(lp1,lcom1,comx);
		System.out.println("");
	}
	static void mostrarParticipantesComitexEnOtros(LS_CircularP lp1, LD_CircularC lcom, String comx) {
	    NodoP R = lp1.getP();
	    boolean sw = false;
	    while (R.getSig() != lp1.getP()){
	        Participante x = R.getPar();
	        NodoC S = lcom.getP();
	        do {
	            Comite y = S.getCom();
	            if (!y.getNomCom().equalsIgnoreCase(comx)) { 
	                NodoP T = y.getLpar().getP();
	                if (T != null) {
	                    do {
	                        Participante p = T.getPar();
	                        if (x.getNombre().equalsIgnoreCase(p.getNombre())) {
	                            if (!sw) {  
	                                sw = true;
	                            }
	                            System.out.println("Participante: " + x.getNombre());
	                            System.out.println("comite: "+ y.getNomCom());
	                        }
	                        T = T.getSig();
	                    } while (T != y.getLpar().getP());
	                }
	            }
	            S = S.getSig();
	        } while (S != lcom.getP());
	        R = R.getSig();
	    }
	    if (!sw) {
	        System.out.println("Ninguna");
	    }
	}
}













