//Lic Aruquipa Marcelo
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LD_NormalN A = new LD_NormalN();
		A.adiFinal(new Numero("61179568"));
		A.adiFinal(new Numero("68117343"));
		A.adiFinal(new Numero("71519727"));
		A.adiFinal(new Numero("71200522"));
		A.adiFinal(new Numero("63322457"));
		A.adiFinal(new Numero("63122136"));
		
		A.mostrar();
		System.out.println("\na) Adicionar un nuevo teléfono después del i-esimo nodo, "
				+ "siempre y cuando no esté en la lista");
		int iesimo = 2;
		adicionarNuevoTelefono(A, iesimo);
		
		System.out.println("\nb) Contar cuantos números de la lista son capicúas.");
		contarnumeroscap(A);
		
		System.out.println("\nc) Eliminar el número deteléfono X y ponerlo al principio de la lista. Si no existe imprimir\r\n"
				+ "“Número no registrado”.");
		String teleX = "71519727";
		eliminarTelefono(A,teleX);
	}

	private static void eliminarTelefono(LD_NormalN a, String teleX) {
		// TODO Auto-generated method stub
		NodoN R = a.getP();
		NodoN H = a.getP();
		boolean sw = false;
		while(R != null) {
			if(R.getNum().getNumero().equals(teleX)) {
				sw = true;
			}
			R = R.getSig();
		}
		if(!sw) {
			System.out.println("numero no registrado");
			return;
		}
		int cnt = 0;
		R = a.getP();
		while(R != null) {
			cnt++;
			if(R.getNum().getNumero().equals(teleX)) {
				break;
			}
			R = R.getSig();
		}
		System.out.println(cnt);
		
		NodoN S = a.getP();
		NodoN T = a.getP();
		R = a.getP();
		
		for(int i = 1; i <= cnt; i++) {
			S = R;
			R = R.getSig();
		}
		
		T = S.getAnt();
		T.setSig(R);
		R.setAnt(T);
		S.setSig(H);
		S.setAnt(null);
		H.setAnt(S);
		a.setP(S);
		a.mostrar();
	}

	private static void contarnumeroscap(LD_NormalN a) {
	    NodoN R = a.getP();
	    int contador = 0;

	    while (R != null) {
	        String numero = R.getNum().getNumero();
	        if (esCapicua(numero)) {
	            contador++;
	        }
	        R = R.getSig();
	    }

	    System.out.println("Cantidad de capicuas: " + contador);
	}
	private static boolean esCapicua(String numero) {
	    int i = 0;
	    int j = numero.length() - 1;
	    while (i < j) {
	        if (numero.charAt(i) != numero.charAt(j)) {
	            return false;
	        }
	        i++;
	        j--;
	    }
	    return true;
	}


	private static void adicionarNuevoTelefono(LD_NormalN a, int iesimo) {
	    NodoN R = a.getP();
	    int nd = a.nroNodos();
	    NodoN nuevo = new NodoN();
	    Numero x = new Numero("61179563");
	    nuevo.setNum(x);
	    boolean sw = false;
	    for(int i = 0; i < nd; i++) {
	        if(R.getNum().getNumero().equals(x.getNumero())) {
	            sw = true;
	            break; 
	        }
	        R = R.getSig();
	    }

	    if (sw) {
	        System.out.println("telefono existente");
	        return;
	    }
	    R = a.getP();
	    NodoN S = a.getP();
	    for(int i = 0; i < iesimo; i++) {
	        S = R;
	        R = R.getSig();
	    }
	    S.setSig(nuevo);
	    nuevo.setSig(R);
	    a.mostrar();
	}

}













