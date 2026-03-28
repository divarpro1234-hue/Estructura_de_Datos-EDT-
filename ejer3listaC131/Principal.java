//Lic Aruquipa Marcelo
public class Principal {

	public static void main(String[] args) {
		//lista persona
		
		LS_CircularCE A = new LS_CircularCE();
		
		A.adiFinal(new ClienteEsp(01, "pepe", "delivery"));
		A.adiFinal(new ClienteEsp(02, "jose", "pedido mesa"));
		A.adiFinal(new ClienteEsp(03, "juan", "pedido rapido"));
		A.adiFinal(new ClienteEsp(04, "saul", "delivery"));
		A.adiFinal(new ClienteEsp(05, "joel", "pedido mesa"));
		A.adiFinal(new ClienteEsp(06, "pedro", "delivery"));
		
		A.mostrar();
		System.out.println("\na) Ingresar un nuevo cliente y asignarle un turno");
		ingresarNuevo(A);
		A.mostrar();
		
		System.out.println("\nb) Mostrar el cliente que tiene el turno actual "
				+ "y el siguiente en la lista.");
		int turnAc = 03;
		mostrarCliente(A, turnAc);
		
		System.out.println("c) Eliminar los clientes que han esperado más de"
				+ " 30 minutos sin ser atendidos.");
		
	}

	private static void mostrarCliente(LS_CircularCE a, int turnAc) {
		// TODO Auto-generated method stub
		NodoCE R = a.getP();
		int nd = a.nroNodos();
		for (int i = 0; i < nd; i++) {
			if(R.getCe().getNroTurn() == turnAc) {
				R.getCe().mostrar();
				R.getSig().getCe().mostrar();
			}
			R = R.getSig();
		}
	}

	private static void ingresarNuevo(LS_CircularCE a) {
		// TODO Auto-generated method stub
		a.adiFinal(new ClienteEsp(07, "saul", "tramiteX"));
		
	}

}













