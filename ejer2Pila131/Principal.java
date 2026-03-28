
public class Principal {

	public static void main(String[] args) {
	
		PilaEx A = new PilaEx();
		Examen r1 = new Examen(1, 60, "pedro", "ingles");
		Examen r2 = new Examen(2, 72, "lucho", "espaniol");
		Examen r3 = new Examen(4, 84, "pato", "frances");
		Examen r4 = new Examen(3, 50, "beta", "ingles");
		Examen r5 = new Examen(4, 60, "pedro", "frances");
		Examen r6 = new Examen(1, 90, "chachas", "coreano");
		Examen r7 = new Examen(2, 65, "fer", "coreanp");
		Examen r8 = new Examen(1, 63, "dani", "ingles");
			
		A.adi(r1);
		A.adi(r2);
		A.adi(r3);
		A.adi(r4);
		A.adi(r5);
		A.adi(r6);
		A.adi(r7);
		A.adi(r8);
		
		A.mostrar();
		System.out.println("\n-------------------------------");
		System.out.println("\na) Mostrar todos los exámenes con nota de aprobación"
				+ " aceptable (65 ≤ nota ≤ 79)");
		mostrarExApro(A);
		
		System.out.println("b) Verificar si el estudiant-oso X presentó "
				+ "al menos 2 exámenes.");
		String estX = "pedro";
		if(verificarEst(A,estX)) {
			System.out.println("si presento al menos 2 examenes");
		}else
			System.out.println("no presento al menos 2 examenes");
	}

	private static boolean verificarEst(PilaEx a, String estX) {
		// TODO Auto-generated method stub
		PilaEx aux = new PilaEx();
		while(!a.esVacia()) {
			Examen x = a.eli();
			if(x.getNombreOso().equalsIgnoreCase(estX)) {
				if(x.getNroExamen() >= 2) {
					return true;
				}
			}
			aux.adi(x);
		}
		a.vaciar(aux);
		return false;
	}

	private static void mostrarExApro(PilaEx a) {
		// TODO Auto-generated method stub
		PilaEx aux = new PilaEx();
		while(!a.esVacia()) {
			Examen x = a.eli();
			if(x.getNota() >= 65 && x.getNota()<= 79) {
				x.mostrar();
			}
			aux.adi(x);
		}
		a.vaciar(aux);
	}


}
