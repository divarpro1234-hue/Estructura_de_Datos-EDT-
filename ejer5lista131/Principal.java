
import java.util.Iterator;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		LS_NormalEx A = new LS_NormalEx();
		A.adiFinal(new Expedicion("expedicion1", "lider1", 14, 1400, "si"));
		A.adiFinal(new Expedicion("expedicion2", "lider2", 11, 1300, "no"));
		A.adiFinal(new Expedicion("expedicion3", "lider3", 15, 1500, "si"));
		A.adiFinal(new Expedicion("expedicion4", "lider4", 12, 1450, "si"));
		A.adiFinal(new Expedicion("expedicion5", "lider5", 10, 1350, "no"));
		A.mostrar();
		
		System.out.println("\na) Insertar una expedición en una posición X");
		int posX = 2;
		insertarEx(A, posX);
		A.mostrar();
		
		System.out.println("\nb) Verificar si hay expediciones con el mismo nombre");
		verificarExp(A);
		
		System.out.println("\nc) Contar cuantas expediciones tuvieron éxito.");
		System.out.println("son: " + contarExpExito(A)+" expediciones con exito");
		
		System.out.println("\nd) Eliminar las expediciones que fracasaron (porque no"
				+ " cuentan para la historia)");
		eliminarExp(A);
		
	}

	private static LS_NormalEx eliminarExp(LS_NormalEx a) {
		// TODO Auto-generated method stub
		LS_NormalEx eli = new LS_NormalEx();
		LS_NormalEx aux = new LS_NormalEx();
		NodoEx R = a.getP();
		int nd = a.nroNodos();
		while(R != null) {
			Expedicion x = R.getExp();
			if(R.getExp().getExito() == "no") {
				eli.adiFinal(x);
			}else {
				aux.adiFinal(x);
			}
			R = R.getSig();
		}
		
		for (int i = 0; i < nd; i++) {
			a.eliFinal();
		}
		NodoEx S = aux.getP();
		while(S != null) {
			a.adiFinal(S.getExp());
			S = S.getSig();
		}
		eli.mostrar();
		return eli;
	}

	private static int contarExpExito(LS_NormalEx a) {
		// TODO Auto-generated method stub
		NodoEx R = a.getP();
		int cnt = 0;
		while(R != null) {
			if(R.getExp().getExito() == "si") {
				cnt++;
			}
			R = R.getSig();
		}
		return cnt;
	}

	private static void verificarExp(LS_NormalEx a) {
		// TODO Auto-generated method stub
		NodoEx R = a.getP();
		boolean sw = false;
		while(R != null) {
			NodoEx S = R.getSig();
			while(S != null) {
				if(R.getExp().getNombreExp() == S.getExp().getNombreExp()) {
					sw = true;
				}
				S = S.getSig();
			}
			R = R.getSig();
		}
		if(sw) {
			System.out.println("si hay ");
		}else {
			System.out.println("no hay");
		}
	}

	private static void insertarEx(LS_NormalEx a, int posX) {
		// TODO Auto-generated method stub
		NodoEx R = a.getP();
		NodoEx S = a.getP();
		for (int i = 0; i < posX; i++) {
			S = R;
			R = R.getSig();
		}
		NodoEx nuevo = new NodoEx();
		nuevo.setExp(new Expedicion("expeX", "liderX", 5, 1100, "no"));
		S.setSig(nuevo);
		nuevo.setSig(R);
	}
}