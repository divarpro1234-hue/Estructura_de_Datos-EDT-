
public class Principal {

	public static void main(String[] args) {
	
		PilaNum A = new PilaNum();
		A.adi(0);
		A.adi(2);
		A.adi(3);
		A.adi(4);
		A.mostrar();
		PilaNum B = new PilaNum();
		B.adi(2);
		B.adi(1);
		B.adi(3);
		B.adi(4);
		B.adi(6);
		System.out.println("\nsuma de numeros");
		//llamada al metodo recursivo
		System.out.println(A.suma());
		//suma recursiva
		System.out.println(suma(A));
		
		System.out.println("\ncontar multiplos de X");
		System.out.println(contarMulti(B,2));
	}

	private static int contarMulti(PilaNum b, int i) {
		// TODO Auto-generated method stub
		if(!b.esVacia()) {
			int z = b.eli();
			int r = contarMulti(b, i);
			if(z % i == 0) {
				r++;
			}
			return r;
		}else {
			return 0;	
		}
	}

	private static int suma(PilaNum a) {
		// TODO Auto-generated method stub
		if(!a.esVacia()) {
			return(a.eli() + suma(a));
			
		}else {
			return 0;
		}
	}

}
