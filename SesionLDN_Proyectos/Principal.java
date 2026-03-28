//Lic Aruquipa Marcelo
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("nombre: Marcelo Aruquipa");
		System.out.println("tema: Listas dobles normalesn\n");
		
		LD_NormalProy A = new LD_NormalProy();

		System.out.println("Lista vacia: ");
		System.out.println(A.esVacia());

		System.out.println("nro de nodos: ");
		System.out.println(A.nroNodos());

		System.out.println("\nadicionando como primero: ");
		Proyecto z1 = new Proyecto("tienda", "willy", "monica");
		Proyecto z2 = new Proyecto("juego", "ana", "bryan");
		Proyecto z3 = new Proyecto("uml", "jose", "adrian");
		Proyecto z4 = new Proyecto("oop", "alan", "jorge");

		A.adiPrimero(z1);
		A.adiPrimero(z2);
		A.adiPrimero(z3);
		A.adiPrimero(z4);
		
		A.mostrar();
		System.out.println("-------------------");
		A.eliPrimero();
		A.eliFinal();
		A.mostrar();
		
		System.out.println("-------------------");
		
		A.adiFinal(z1);
		A.adiFinal(z4);
		
		A.mostrar();
		
		
	}
}













