
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		LS_NormalAu A = new LS_NormalAu();
		A.adiFinal(new Auto("Supra GR Racing", "Toyota", 230, "carrera", 34));
		A.adiFinal(new Auto("Civic Type R", "Honda", 170, "Turismo", 22));
		A.adiFinal(new Auto("Mustang GT4", "Ford", 90, "carrera", 18));
		A.adiFinal(new Auto("911 RSR", "Porsche", 10, "clasico", 41));
		A.adiFinal(new Auto("Corvette C8.R", "Chevrolet", 305, "carrera", 39));
		A.mostrar();
		
		System.out.println("\na) Insertar un auto en una posición X.");
		int posX = 2;
		insertarAuto(A, posX);
		A.mostrar();
		
		System.out.println("\nb) Verificar si hay autos sin ninguna victoria.");
		verificarAuto(A);
		
		System.out.println("\nc) Mostrar los nombres de los autos de carreras.");
		mostrarAuto(A);
		
		System.out.println("\nd) Eliminar a los autos con velocidad menor a 100 km/h.");
		eliminarAuto(A);
		
		
	}

	private static LS_NormalAu eliminarAuto(LS_NormalAu a) {
		// TODO Auto-generated method stub
		NodoAu R = a.getP();
		int nd = a.nroNodos();
		LS_NormalAu eli = new LS_NormalAu();
		LS_NormalAu aux = new LS_NormalAu();
		while(R != null){
			Auto x = R.getAuto();
			if(x.getVelMax() < 100) {
				eli.adiFinal(x);
			}else {
				aux.adiFinal(x);
			}
			R = R.getSig();
		}
		for (int i = 0; i < nd; i++) {
			a.eliPrincipio();
		}
		a.mostrar();
		NodoAu S = aux.getP();
		while(S != null) {
			a.adiFinal(S.getAuto());
			S = S.getSig();
		}
		eli.mostrar();
		return eli;
	}

	private static void mostrarAuto(LS_NormalAu a) {
		// TODO Auto-generated method stub
		NodoAu R = a.getP();
		while(R != null) {
			if(R.getAuto().getCategoria() == "carrera") {
				System.out.println(R.getAuto().getNombre());
			}
			R = R.getSig();
		}
	}

	private static void verificarAuto(LS_NormalAu a) {
		// TODO Auto-generated method stub
		NodoAu R = a.getP();
		boolean sw = false;
		while(R != null) {
			if(R.getAuto().getNumVictoria() == 0) {
				sw = true;
			}
			R = R.getSig();
		}
		if(sw) {
			System.out.println("si hay autos");
		}else {
			System.out.println("no hay autos");
		}
	}

	private static void insertarAuto(LS_NormalAu a, int posX) {
		// TODO Auto-generated method stub
		NodoAu R = a.getP();
		NodoAu S = a.getP();
		for (int i = 0; i < posX; i++) {
			S = R;
			R = R.getSig();
		}
		NodoAu nuevo = new NodoAu();
		Auto x = new Auto("autox", "modelox", 120, "categoriax", 35);
		nuevo.setAuto(x);
		S.setSig(nuevo);
		nuevo.setSig(R);
	}
}