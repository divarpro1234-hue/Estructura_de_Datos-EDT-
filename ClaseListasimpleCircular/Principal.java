//Marcelo Aruquipa
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("nombre: Marcelo Aruauipa");
		System.out.println("tema: Listas circulares");
		
		LS_CircularC A = new LS_CircularC();
		A.llenar1(5);
		A.mostrar();
		
//		System.out.println("-----------------------------------------");
//		NodoPer z = A.eliFinal();
//		System.out.println(z.getNom() + " - " + z.getEdad());
//		System.out.println("-----------------------------------------");
//		A.mostrar();
//		System.out.println("nro de nodos de la lista circular: " + A.nroNodos());

		System.out.println("-----------------------------------------");
		NodoC w = A.eliPrincipio();
		System.out.println("datos eliminados: " + w.getPrenda() + " " + w.getNroCompra());
		A.mostrar();
		
		System.out.println("-----------------------------------------");
		A.eliPrincipio();
		A.mostrar();
		
		
//		System.out.println("-----------------------------------------");
//		A.adiFinal("german", 25);
//		A.mostrar();
		
	}	
}



