
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		LS_NormalN A = new LS_NormalN();
		A.adiFinal(10);
		A.adiFinal(0);
		A.adiFinal(5);
		A.adiFinal(6);
		A.adiFinal(2);
		System.out.println();
		A.mostrar();
		
		System.out.println("\nsuma de numeros");
		System.out.println(suma(A.getP()));
		
		System.out.println("\nmostrar numeros de manera recursiva");
		mostrar(A.getP());
		
		System.out.println("\nbuscar dato x");
		System.out.println(buscar(A.getP(),2));
	}

	private static boolean buscar(NodoN R, int x) {
		// TODO Auto-generated method stub
		if(R != null) {
			if(R.getNum() == x) {
				return true;
			}else {
				return buscar(R.getSig(),x);
			}
		}else {
			return false;
		}
	}

	private static void mostrar(NodoN R) {
		// TODO Auto-generated method stub
		if(R != null) {
			System.out.println(R.getNum());
			mostrar(R.getSig());
		}
	}

	private static int suma(NodoN R) {
		// TODO Auto-generated method stub
		if(R != null) {
			return(suma(R.getSig()) + R.getNum());
		}else {
			return 0;
		}
	}
	
}