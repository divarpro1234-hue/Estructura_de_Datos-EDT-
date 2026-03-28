//Lic Aruquipa Marcelo
public class Principal {

	public static void main(String[] args) {
		//lista persona
		
		LS_CircularA A = new LS_CircularA();
		
		A.adiFinal(new Avion("001", 500, "en base", "peru"));
		A.adiFinal(new Avion("002", 600, "en vuelo", "chile"));
		A.adiFinal(new Avion("003", 700, "en vuelo", "ecuador"));
		A.adiFinal(new Avion("004", 400, "en base", "colombia"));
		A.adiFinal(new Avion("005", 500, "en base", "brasil"));
		A.adiFinal(new Avion("006", 700, "en vuelo", "bolivia"));
		
		A.mostrar();
		
		System.out.println("\na) Actualizar el estado de un avion que ha llegado "
				+ "a su destino y asignarle una nueva entrega.");
		int posK = 4;
		actualizarEstadoAvion(A, posK);
		
		System.out.println("\nb) Buscar el avion con la mayor capacidad de carga disponible"
				+ " y mostrar sus detalles.");
		buscarMayCap(A);
		
		System.out.println("\nc) Intercambiar la ruta de dos aviones seleccionados "
				+ "para optimizar el tiempo de entrega.\r\n"
				+ "");
		
		int av1 = 2;
		int av2 = 4;
		intercambiarRuta(A,av1,av2);
		A.mostrar();
	}

	private static void intercambiarRuta(LS_CircularA a, int av1, int av2) {
		// TODO Auto-generated method stub
		NodoA R = a.getP();
		int nd = a.nroNodos();
		for (int i = 1; i < av1; i++) {
			R = R.getSig();
		}
		Avion x = R.getAv();
		String destino = x.getDestino();
		R = a.getP();
		for (int i = 1; i < av2; i++) {
			R = R.getSig();
		}
		Avion y = R.getAv();
		x.setDestino(y.getDestino());
		y.setDestino(destino);
		
	}

	private static void buscarMayCap(LS_CircularA a) {
		// TODO Auto-generated method stub
		NodoA R = a.getP();
		int nd = a.nroNodos();
		int may = 0;
		for (int i = 0; i < nd; i++) {
			if (R.getAv().getCapCar() > may) {
				may = R.getAv().getCapCar();
			}
			R = R.getSig();
		}
		System.out.println(may);
		R = a.getP();
		for (int i = 0; i < nd; i++) {
			if(R.getAv().getCapCar() == may) {
				R.getAv().mostrar();
			}
			R = R.getSig();
		}
	}

	private static void actualizarEstadoAvion(LS_CircularA a, int posK) {
		// TODO Auto-generated method stub
		NodoA R = a.getP();
		for (int i = 1; i < posK; i++) {
			R = R.getSig();
		}
		if (R.getAv().getEstado().equals("en base")) {
			R.getAv().setEstado("en vuelo");
			R.getAv().setDestino("francia");
			a.mostrar();
		}else {
			System.out.println("avion en vuelo, no se puede asignar nueva entrega");
		}
		
	}

}













