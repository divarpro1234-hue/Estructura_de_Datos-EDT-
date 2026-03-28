//Lic Aruquipa Marcelo
public class Principal {

	public static void main(String[] args) {
		
		//lista materia
		Estudiante e1 = new Estudiante("fenando", "123346", 85);
		Estudiante e2 = new Estudiante("kevin", "1113332", 80);
		Estudiante e3 = new Estudiante("daniel", "1233422", 70);
		Estudiante e4 = new Estudiante("adrian", "123996", 90);
		Estudiante e5 = new Estudiante("gabriel", "1788856", 90);
		LD_CircularE le1 = new  LD_CircularE();
		le1.adiFinal(e1);
		le1.adiFinal(e2);
		le1.adiFinal(e3);
		le1.adiFinal(e4);
		le1.adiFinal(e5);
		System.out.println("\n\tDATOS DE LA LISTA ESTUDIANTE");
		le1.mostrar();
		mostrarEstudiantesmaxNota(le1);
	}	
	
	static void mostrarEstudiantesmaxNota(LD_CircularE le1) {
	    NodoE R = le1.getP();
	    int maxN = R.getEst().getNota();
	    while (R.getSig() != le1.getP()) { 
	        if (R.getEst().getNota() > maxN) {
	            maxN = R.getEst().getNota();
	        }
	        R = R.getSig();
	    }
	    System.out.println("\nEstudiante(s) con la máxima nota " + maxN + ":");
	    R = le1.getP();
	    boolean sw = false;
	    do {
	        Estudiante e = R.getEst();
	        if (e.getNota() == maxN) {
	            System.out.println("Nombre: " + e.getNombre() + ", CI: " + e.getCi() + ", Nota: " + e.getNota());
	            sw = true;
	        }
	        R = R.getSig();
	    } while (R != le1.getP());

	    if (!sw) {
	        System.out.println("No hay estudiantes con la nota máxima.");
	    }
	}

}













