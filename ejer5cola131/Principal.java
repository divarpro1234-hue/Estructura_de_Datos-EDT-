
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ColaSimpleM c1 = new ColaSimpleM();
		c1.adi(new Mounstro("randallf", 50, 50, "asustador"));
		c1.adi(new Mounstro("mike", 41, 50, "asistente"));
		c1.adi(new Mounstro("roz", 62, 60, "administrativo"));
		c1.adi(new Mounstro("james_p", 80, 70, "asustador"));
		c1.adi(new Mounstro("bile", 20, 55, "asustador"));
		
		c1.mostrar();
		
		System.out.println();
		System.out.println("\na) Llevar a los mounstros que sean "
				+ "Administrativos al final de la cola.\r\n"
				+ "");
		llevarAdmFinalCola(c1);
		c1.mostrar();
		
		System.out.println("\nb) Mostrar los nombres de los mounstros "
				+ "que tengan el trabajo de asustador con una\r\n"
				+ "cantidad de sustos mayor a 30.");
		mostrarNombresAsustador(c1);
	}

	private static void mostrarNombresAsustador(ColaSimpleM c1) {
		// TODO Auto-generated method stub
		ColaSimpleM aux = new ColaSimpleM();
		while(!c1.esVacia()) {
			Mounstro x = c1.eli();
			if(x.getTipoTrab() == "asustador") {
				if(x.getCantSusto() > 30) {
					System.out.println("nombre: " + x.getNombre());
				}
			}
			aux.adi(x);
		}
		c1.vaciar(aux);
	}

	private static void llevarAdmFinalCola(ColaSimpleM c1) {
		// TODO Auto-generated method stub
		ColaSimpleM aux1 = new ColaSimpleM();
		ColaSimpleM aux2 = new ColaSimpleM();
		while(!c1.esVacia()) {
			Mounstro x = c1.eli();
			if(x.getTipoTrab() == "administrativo") {
				aux1.adi(x);
			}else {
				aux2.adi(x);
			}
			
		}
		c1.vaciar(aux2);
		c1.vaciar(aux1);
	}
}