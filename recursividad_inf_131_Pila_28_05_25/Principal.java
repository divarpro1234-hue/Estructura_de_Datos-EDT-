
public class Principal {

	public static void main(String[] args) {
	

		PilaCad A = new PilaCad();
		A.adi("rojo");
		A.adi("verde");
		A.adi("azul");
		A.adi("verde");
		A.adi("amarillo");
		A.adi("cafe");
		A.adi("blanco");
		
		A.mostrar();
		PilaCad aux = new PilaCad();
		System.out.println();
		System.out.println("\na) Verificar si existe el color X");
		String colorx = "azul";
		if(verificarColorx(A,colorx,aux)) {
			System.out.println("si existe");
		}else {
			System.out.println("no existe");
		}
	}

	private static boolean verificarColorx(PilaCad a, String colorx, PilaCad aux) {
		// TODO Auto-generated method stub
		if(!a.esVacia()) {
			String x = a.eli();
			aux.adi(x);
			if(x.equals(colorx)) {
				return true;
			}else {
				return verificarColorx(a, colorx, aux);
			}
		}else {
			return false;
		}
	}
}
