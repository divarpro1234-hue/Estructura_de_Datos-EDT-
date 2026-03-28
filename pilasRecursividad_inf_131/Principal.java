
public class Principal {

	public static void main(String[] args) {
	
		PilaM A = new PilaM();
		A.adi(new Motocicleta("verde", "honda", "741e"));
		A.adi(new Motocicleta("rojo", "kawasaki", "369r"));;
		A.adi(new Motocicleta("cafe", "ninja", "852f"));
		A.adi(new Motocicleta("azul", "yamaja rcy", "155s"));
		A.adi(new Motocicleta("rosado", "kawasaki", "321d"));
		A.adi(new Motocicleta("violeta", "hondacv1000r", "123d"));
		
		A.mostrar();
		PilaM aux = new PilaM();
		System.out.println();
		if(veriMotoMarca(A,"honda")) {
			System.out.println("si existe moto");
		}else {
			System.out.println("no existe moto");
		}
		A.mostrar();
		if(veriMotoMarca2(A,"kawasaki",aux)) {
			System.out.println("si existe moto");
		}else {
			System.out.println("no existe moto");
		}
		String colorx = "rojo";
		System.out.println("motos con el "+colorx+" son: "+contarMotoColor(A,colorx));
		A.mostrar();
		
		String colory = "rojo";
		System.out.println("motos con el "+colory+" son: "+contarMotoColor2(A,colory,aux));
		A.mostrar();
	}


	private static int contarMotoColor2(PilaM a, String colory, PilaM aux) {
		// TODO Auto-generated method stub
		if(!a.esVacia()) {
			Motocicleta x = a.eli();
			aux.adi(x);
			if(x.getColor().equals(colory)) {
				return contarMotoColor2(a, colory,aux)+1;
			}else{
				return contarMotoColor2(a, colory,aux);
			}
		}else {
			a.vaciar(aux);
			return 0;	
		}
	}

	private static int contarMotoColor(PilaM a, String colorx) {
		// TODO Auto-generated method stub
		if(!a.esVacia()) {
			Motocicleta x = a.eli();
			int c = contarMotoColor(a, colorx);
			if(x.getColor().equals(colorx)) {
				return c+1;
			}else {
				return c;
			}
		}
		return 0;
	}
	
	private static boolean veriMotoMarca(PilaM a, String marcax) {
		// TODO Auto-generated method stub
		if(!a.esVacia()) {
			Motocicleta x = a.eli();
			if(x.getMarca().equals(marcax)){
				return true;
			}else {
				return veriMotoMarca(a, marcax);
			}
					
		}else {
			return false;	
		}	
	}
	
	private static boolean veriMotoMarca2(PilaM a, String marcax, PilaM aux) {
		// TODO Auto-generated method stub
		if(!a.esVacia()) {
			Motocicleta x = a.eli();
			aux.adi(x);
			if(x.getMarca().equals(marcax)){
				a.vaciar(aux);
				return true;
			}else {
				return veriMotoMarca2(a, marcax, aux);
			}
					
		}else {
			a.vaciar(aux);
			return false;	
		}	
	}
}
