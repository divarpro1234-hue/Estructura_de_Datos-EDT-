//Lic Aruquipa Marcelo
public class Principal {

	public static void main(String[] args) {
		//lista persona
		
		Persona p1 = new Persona("22", "fer", "61148552");
		Persona p2 = new Persona("12", "elba", "68848552");
		Persona p3 = new Persona("13", "pedro", "66648552");
		Persona p4 = new Persona("21", "luis", "60048552");
		Persona p5 = new Persona("23", "albert", "71148552");
		
		LD_NormalPer lp1 = new LD_NormalPer();
		lp1.adiFinal(p1);
		lp1.adiFinal(p2);
		lp1.adiFinal(p3);
		lp1.adiFinal(p4);
		lp1.adiFinal(p5);
		System.out.println("\n\tDATOS DE LA LISTA PERSONA");
		lp1.mostrar();
		
		//lista materia
		Materia m1 = new Materia("inf-121", "programacion ii", "12-14");
		Materia m2 = new Materia("inf-111", "programacion i", "10-12");
		Materia m3 = new Materia("inf-131", "programacion iii", "08-10");
		Materia m4 = new Materia("inf-122", "programacion web", "12-14");
		LD_CircularMat lm1 = new  LD_CircularMat();
		lm1.adiFinal(m1);
		lm1.adiFinal(m2);
		lm1.adiFinal(m3);
		lm1.adiFinal(m4);
		System.out.println("\n\tDATOS DE LA LISTA MATERIA");
		lm1.mostrar();
		
		//lista incripcion
		Inscripcion i1 = new Inscripcion("inf-121", "22");
		Inscripcion i2 = new Inscripcion("inf-131", "12");
		Inscripcion i3 = new Inscripcion("inf-111", "13");
		Inscripcion i4 = new Inscripcion("inf-122", "23");
		LD_NormalIns li1 = new LD_NormalIns();
		li1.adiFinal(i1);
		li1.adiFinal(i2);
		li1.adiFinal(i3);
		li1.adiFinal(i4);
		System.out.println("\n\tDATOS DE LA LISTA INSCRIPCION");
		li1.mostrar();
		String sigla= "inf-131";
		System.out.println("Mostrar a todas las personas que estudian "
				+"la materia con la sigla “INF-131");
		System.out.println("Personas inscritas en la materia con sigla \"" + sigla + "\":");
		mostrarPersonasMateria(lp1,li1,sigla);
	}
	static void mostrarPersonasMateria(LD_NormalPer lp1, LD_NormalIns li1, String sigla) {
	    NodoIns R = li1.getP();
	    boolean sw = false;
	    while (R != null) {
	        Inscripcion x = R.getIns();
	        if (x.getSigla().equalsIgnoreCase(sigla)) {
	            String ciPer = x.getCi();
	            NodoPer S = lp1.getP();
	            while (S != null) {
	                Persona y = S.getPer();
	                if (y.getCi().equals(ciPer)) {
	                    System.out.println("Nombre: " + y.getNombre() + ", Teléfono: " + y.getNroCelular());
	                    sw = true;
	                    break;
	                }
	                S = S.getSig();
	            }
	        }
	        R = R.getSig();
	    }
	    if (!sw) {
	        System.out.println("No hay personas inscritas en esta materia.");
	    }
	}

}













