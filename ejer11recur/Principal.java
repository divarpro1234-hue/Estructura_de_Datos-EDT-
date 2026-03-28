
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		LS_NormalN A = new LS_NormalN();
		A.adiFinal(5);
		A.adiFinal(7);
		A.adiFinal(8);
		A.adiFinal(1);
		A.adiFinal(3);
		A.adiFinal(2);
		
		A.mostrar();
		LS_NormalN aux = new LS_NormalN();
		System.out.println();
		invertirLista(A,aux);
		aux.mostrar();
		
	}

	private static void invertirLista(LS_NormalN a, LS_NormalN aux) {
		// TODO Auto-generated method stub
		if(a.nroNodos() != 0) {
			NodoNum x = a.eliFinal();
			aux.adiFinal(x.getNum());
			invertirLista(a, aux);
		}
		
	}
}