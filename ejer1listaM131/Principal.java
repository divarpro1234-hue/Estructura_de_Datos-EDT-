//Lic Aruquipa Marcelo
//import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		LS_NormalNum A = new LS_NormalNum();
		A.adiFinal(new Numero("61179568"));
		A.adiFinal(new Numero("67522576"));
		A.adiFinal(new Numero("61116565"));
		
		LS_NormalNum B = new LS_NormalNum();
		B.adiFinal(new Numero("61123455"));
		B.adiFinal(new Numero("61179568"));
		B.adiFinal(new Numero("61123455"));
		
		LS_NormalNum C = new LS_NormalNum();
		C.adiFinal(new Numero("74111122"));
		C.adiFinal(new Numero("77122177"));
		C.adiFinal(new Numero("61179568"));
		
		LD_NormalMN l1 = new LD_NormalMN();
		l1.adiFinal(new M_num(A));
		l1.adiFinal(new M_num(B));
		l1.adiFinal(new M_num(C));
		
		l1.mostrar();
		
		System.out.println("\na) Verificar si el número X se encuentra en todas "
				+ "las listas simples.\r\n"
				+ "");
		String numx = "61179568";
		verificarNumX(l1,numx);
		
		System.out.println("\nb) Contar cuantos números capicúas hay en cada lista.\r\n"
				+ "");
		contarCapicua(l1);
		
		System.out.println("\nc) Verificar si cada lista simple tiene al menos K elementos.");
		int k = 3;
		verificarTamanio(l1, k);
		
	}

	private static void verificarTamanio(LD_NormalMN l1, int k) {
	    NodoMN R = l1.getP();  
	    int numLista = 1;        

	    while (R != null) {
	        M_num mnum = R.getL_Num();           
	        LS_NormalNum lista = mnum.getLnum(); 
	        NodoNum P = lista.getP();
	        int contador = 0;
	        while (P != null) {
	            contador++;
	            P = P.getSig();
	        }
	        if (contador >= k) {
	            System.out.println("Lista " + numLista + ": tiene al menos " + k + " elementos.");
	        } else {
	            System.out.println("Lista " + numLista + ": No tiene al menos " + k + " elementos.");
	        }

	        numLista++;
	        R = R.getSig();
	    }
	}


	private static void contarCapicua(LD_NormalMN l1) {
	    NodoMN R = l1.getP();
	    int numLista = 1; 
	    while (R != null) {
	        M_num mnum = R.getL_Num();
	        LS_NormalNum lnum = mnum.getLnum(); 

	        NodoNum S = lnum.getP(); 
	        int cntCap = 0;
	        while (S != null) {
	            String num = S.getNum().getNumero(); 
	            if (esCapicua(num)) {
	                cntCap++;
	            }
	            S = S.getSig(); 
	        }

	        System.out.println("lista " + numLista + ": tenemos " + cntCap + " capicuas");
	        numLista++;
	        R = R.getSig();
	    }
	}
	
	private static boolean esCapicua(String num) {
	    int i = 0;
	    int j = num.length() - 1;

	    while (i < j) {
	        if (num.charAt(i) != num.charAt(j)) {
	            return false;
	        }
	        i++;
	        j--;
	    }
	    return true;
	}

	private static void verificarNumX(LD_NormalMN a, String numx) {
		// TODO Auto-generated method stub
		NodoMN R = a.getP();
		int cnt = 0;
		while(R != null) {
			if(encontrarNum(R.getL_Num(),numx)) {
				cnt++;
			}
			R = R.getSig();
		}
		if(cnt == a.nroNodos()) {
			System.out.println("el numero esta en todas las listas");
		}else {
			System.out.println("el numero no esta en las listas");
		}
	}

	private static boolean encontrarNum(M_num a, String numx) {
		// TODO Auto-generated method stub
		NodoNum R = a.getLnum().getP();
		while(R != null) {
			if(R.getNum().getNumero().equals(numx)) {
				return true;
			}
			R = R.getSig();
		}
		return false;
	}

}













