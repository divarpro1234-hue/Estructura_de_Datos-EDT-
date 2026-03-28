
public class ColaSimple {

    public static void main(String[] args) {
        ColaSimpleCorredor A = new ColaSimpleCorredor();
        
        A.adi(new Corredor("2", "alanbrito", 0));
        A.adi(new Corredor("1", "divar", 5));
        A.adi(new Corredor("3", "juan", 14));
        A.adi(new Corredor("4", "danner", 16));
        A.adi(new Corredor("5", "daniel", 0));
        A.adi(new Corredor("7", "kevin", 10));
        A.mostrar();
            
        System.out.println();
//        System.out.println("\njugadores que ganaron mas de 10 carreras");
        System.out.println();
//        verificarCarreras(A);
//        verificarCarrerasCorrecto(A);
        A.mostrar();
        System.out.println("\njugadores que no ganaron ni una carrera");
        mostrarCorredoresNoGanadores(A);
        
        System.out.println();
        ordenarCorredores(A);
        A.mostrar();
        
    }
    private static void ordenarCorredores(ColaSimpleCorredor a) {
        ColaSimpleCorredor ordenada = new ColaSimpleCorredor();
        
        while (!a.esvacia()) {
            ColaSimpleCorredor aux = new ColaSimpleCorredor();
            Corredor menor = a.eli(); // Extraemos el primer corredor como referencia

            while (!a.esvacia()) {
                Corredor actual = a.eli();
                if (Integer.parseInt(actual.getnumeroCorredor()) < Integer.parseInt(menor.getnumeroCorredor())) {
                    aux.adi(menor); // Guarda el anterior "menor" en la auxiliar
                    menor = actual; // Actualiza el menor
                } else {
                    aux.adi(actual);
                }
            }

            ordenada.adi(menor); // Añade el menor a la cola ordenada
            a.vaciar(aux); // Restaura la cola original sin el menor encontrado
        }

        a.vaciar(ordenada); // Retorna los elementos ordenados a la cola original
    }
	private static void mostrarCorredoresNoGanadores(ColaSimpleCorredor a) {
		// TODO Auto-generated method stub
    	ColaSimpleCorredor aux = new ColaSimpleCorredor();
		while(!a.esvacia()) {
			Corredor z = a.eli();
			if(z.getCarrerasGanadas() == 0) {
				z.mostrar();
			}
			aux.adi(z);
		}
		a.vaciar(aux);
	}
//	static boolean verificarCarrerasCorrecto(ColaSimpleCorredor a) {
//		// TODO Auto-generated method stub
//    	ColaSimpleCorredor aux = new ColaSimpleCorredor();
//		while(!a.esvacia()) {
//			Corredor z = a.eli();
//			if(z.getCarrerasGanadas()>10) {
//				aux.adi(z);
//				a.adi(z);
//				return true;
//			}
//			aux.adi(z);
//		}
//		a.vaciar(aux);
//		return false;
//	}
    
//	static void verificarCarreras(ColaSimpleCorredor a) {
//		// TODO Auto-generated method stub
//    	ColaSimpleCorredor aux2 = new ColaSimpleCorredor();
//		while(!a.esvacia()) {
//			Corredor z = a.eli();
//			if(z.getCarrerasGanadas()>10) {
//				z.mostrar();
//			}
//			aux2.adi(z);
//		}
//		a.vaciar(aux2);
//	}
//   
	
}
