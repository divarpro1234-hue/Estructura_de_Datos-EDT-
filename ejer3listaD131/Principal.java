//Lic Aruquipa Marcelo
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LD_NormalC A = new LD_NormalC();
		A.adiFinal('j');
		A.adiFinal('h');
		A.adiFinal('3');
		A.adiFinal('j');
		A.adiFinal(')');
		A.adiFinal('=');
		
		LD_NormalC B = new LD_NormalC();
	
		B.adiFinal('f');
		B.adiFinal('d');
		B.adiFinal('#');
		
		
		
		
		A.mostrar();
		
		System.out.println("\na) En la primera lista llevar todos los caracteres que sean "
				+ "alfabéticos (A, B, C, a, b, c, etc.)\r\n"
				+ "y numéricos, y en la segunda lista llevar los caracteres restantes. "
				+ "Al final la primera lista\r\n"
				+ "tendrá solo caracteres alfabéticos y numéricos, la segunda contendrá "
				+ "al resto de caracteres\r\n"
				+ "(@, #, /, etc.).");
		moverCar(A,B);
		A.mostrar();
		B.mostrar();
		
		System.out.println("\nb) En ambas listasreemplazar cada carácter alfabético por"
				+ "su "
				+ "siguiente valor. Por ejemplo,\r\n"
				+ "en lugar de “i” colocar “j”, en el caso de “z” se debe reemplazar "
				+ "por “a” y “Z” por “A”.\r\n"
				+ "");
		reemplazarCar(A,B);
		
		System.out.println("c) Ordenar la primera lista ascendentemente.");
		ordenarAscen(A);
		A.mostrar();
		
	}
	private static void ordenarAscen(LD_NormalC a) {
	    NodoChar R = a.getP();
	    while (R != null) {
	        NodoChar S = R.getSig();
	        while (S != null) {
	            if (Character.valueOf(R.getCar()).compareTo(S.getCar()) > 0) {
	                char aux = R.getCar();
	                R.setCar(S.getCar());
	                S.setCar(aux);
	            }
	            S = S.getSig();
	        }
	        R = R.getSig();
	    }
	}

	private static void reemplazarCar(LD_NormalC A, LD_NormalC B) {
	    reemplazarLista(A);
	    reemplazarLista(B);
	    A.mostrar();
	    B.mostrar();
	}

	private static void reemplazarLista(LD_NormalC a) {
	    NodoChar R = a.getP();
	    while (R != null) {
	        char c = R.getCar();
	        if (Character.isLetter(c)) {
	        	if (c == 'z') {
	        	    c = 'a';
	        	} else if (c == 'Z') {
	        	    c = 'A';
	        	} else {
	        	    c = (char)(c + 1);
	        	}
	        	R.setCar(c);
	        }
	        R = R.getSig();
	    }
	}

	private static void moverCar(LD_NormalC A, LD_NormalC B) {
	    LD_NormalC aux = new LD_NormalC();
	    NodoChar R = A.getP();

	    while (R != null) {
	        char c = R.getCar();
	        if (Character.isLetterOrDigit(c)) {
	            aux.adiFinal(c);
	        } else {
	            B.adiFinal(c);
	        }
	        R = R.getSig();
	    }

	    A.setP(aux.getP());
	}


}













