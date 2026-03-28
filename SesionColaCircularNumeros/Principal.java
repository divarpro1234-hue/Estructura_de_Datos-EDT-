import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaCircularNum z = new ColaCircularNum();
		ColaCircularNum ccprimo = new ColaCircularNum();
		ColaCircularNum ccrepetidos = new ColaCircularNum();
		
		ccrepetidos.adi(12);
		ccrepetidos.adi(13);
		ccrepetidos.adi(6);
		ccrepetidos.adi(12);
		ccrepetidos.adi(11);
		ccrepetidos.adi(12);
			
		
		ccprimo.adi(12);
		ccprimo.adi(13); 
		ccprimo.adi(6);
		ccprimo.adi(2);		
		ccprimo.adi(11);		
		ccprimo.adi(12);	
		
		//z.llenar(10);
		z.adi(30);
		z.adi(20);
		z.adi(30);
		z.adi(40);
		z.adi(30);
		z.mostrar();
		System.out.println("\nNro de elementos: " + z.nroElem());
		//z.eli();
		//z.eli();
		//System.out.println("\nNro de elementos: " + z.nroElem());
		//z.mostrar();
		
		//a)determinar la cantidad de veces ocurre el dato x=30
		int datox = 30;
		System.out.println();
		System.out.println("nombre: Divar Husaman Mamani Callisaya");
		System.out.println("c.i. 9898030");
		System.out.println("session cola circular numeros");
		System.out.println("\nnro de veces que ocurre el dato " + datox + " = "+ contarDato(z,datox));
		
		//b) ordenar la cola cirular
		System.out.println("\n\nOrdenando cola circular de numeros");
		ordenarCC(z);
		z.mostrar();
		
		//c) ordenar cola circular asendentemente
		System.out.println("\n\nOrdenando cola circular de numeros");
		ordenarCCAsce(z);
		z.mostrar();
		
		//d) codigo mejorado del c)
		System.out.println("\n\nOrdenamiento ascendente mejorado");
		ordenarMejorado(z);
		z.mostrar();
		
		//TAREA!!!
		//E) Dado una cola circular de numeros enteros, determinar la cantidad de numeros primos?
		System.out.println("\n\n\tinciso e)");
		System.out.println("\nDeterminar cuantos numeros primos hay en la cola cicular. ");
		ccprimo.mostrar();
		int cantidadPrimos = NumPrimos(ccprimo);
		System.out.println("\nLa cantidad de numeros primos es: " + cantidadPrimos);
		
		
		//F) Dado una cola circular de numeros enteros, eliminar los numeros repetidos 
		System.out.println("\n\n\tinciso f)");
		ccrepetidos.mostrar();
		System.out.println("\nEliminar numeros repetidos ");
		eliminarRepeditos(ccrepetidos);
		ccrepetidos.mostrar();
	}

	private static void eliminarRepeditos(ColaCircularNum ccrepetidos) {
		// TODO Auto-generated method stub
		ColaCircularNum aux = new ColaCircularNum();
	    ColaCircularNum aux2 = new ColaCircularNum();
	    int nroElem = ccrepetidos.nroElem();

	    for (int i = 0; i < nroElem; i++) {
	        aux2.adi(ccrepetidos.eli());
	    }
	    while (!aux2.esVacia()) {
	        int elem = aux2.eli(); 
	        boolean repetido = false;
	        int elemAux = aux.nroElem();
	        for (int j = 0; j < elemAux; j++) {
	            int auxElem = aux.eli(); 
	            if (auxElem == elem) {
	                repetido = true; 
	            }
	            aux.adi(auxElem); 
	        }
	        if (!repetido) {
	            aux.adi(elem);
	        }
	    }
	    ccrepetidos.vaciar(aux);
	}

	static int NumPrimos(ColaCircularNum ccprimo) {
		ColaCircularNum aux = new ColaCircularNum();
		int contadorPrimo = 0;
		while(!ccprimo.esVacia()) {
			int elem = ccprimo.eli();
			aux.adi(elem);
			int c = 0; 
			for (int i = 1; i <= elem; i++) {
				if(elem % i == 0)
					c++;
			}
			if(c == 2) {
				contadorPrimo++;
			}
		}
		aux.vaciar(ccprimo);
		return contadorPrimo;
	}

	static void ordenarMejorado(ColaCircularNum z) {
		ColaCircularNum aux = new ColaCircularNum();
		while(!z.esVacia()) {
			int menor = Integer.MAX_VALUE;
			int nroElem = z.nroElem();
			
			for (int i = 1; i <= nroElem; i++) {
				int elem = z.eli();
				//aux.adi(elem);
				z.adi(elem);
				if(elem < menor)
					menor = elem;
			}
			//ccz.vaciar(aux);
			
			for (int i = 1; i <=nroElem; i++) {
				int elem = z.eli();
				if(elem == menor)
					aux.adi(elem);
				else
					z.adi(elem);
			}
		}
		z.vaciar(aux);
	}

	static void ordenarCCAsce(ColaCircularNum z) {
		// TODO Auto-generated method stub
		ColaCircularNum aux1 = new ColaCircularNum();
		ColaCircularNum aux2 = new ColaCircularNum();
		
		
		while(!z.esVacia()) {
			int mayor = Integer.MIN_VALUE;
			//1 determina el menor de todos
			while(!z.esVacia()) {
				int elem = z.eli();
				aux2.adi(elem);
				if(elem > mayor)
					mayor = elem;
			}
			z.vaciar(aux2);
			
			//2 determina quienes con iguales al menor
			while(!z.esVacia()) {
				int elem = z.eli();
				if(elem == mayor)
					aux1.adi(elem);
				else
					aux2.adi(elem);
			}
			z.vaciar(aux2);
		}
		z.vaciar(aux1);
	}

	static void ordenarCC(ColaCircularNum z) {
		// TODO Auto-generated method stub
		ColaCircularNum aux1 = new ColaCircularNum();
		ColaCircularNum aux2 = new ColaCircularNum();
		
		
		while(!z.esVacia()) {
			int menor = Integer.MAX_VALUE;
			//1 determina el menor de todos
			while(!z.esVacia()) {
				int elem = z.eli();
				aux2.adi(elem);
				if(elem < menor)
					menor = elem;
			}
			z.vaciar(aux2);
			
			//2 determina quienes con iguales al menor
			while(!z.esVacia()) {
				int elem = z.eli();
				if(elem == menor)
					aux1.adi(elem);
				else
					aux2.adi(elem);
			}
			z.vaciar(aux2);
		}
		z.vaciar(aux1);
	}

	static int contarDato(ColaCircularNum z, int datox) {
		// TODO Auto-generated method stub
		ColaCircularNum aux = new ColaCircularNum();
		int contador = 0;
		while(!z.esVacia())
		{
			int elem = z.eli();
			aux.adi(elem);
			
			if(elem == datox)
				contador++;	
		}
		z.vaciar(aux);
		return contador;
	}

}
/*
static void eliminarRepetidos(ColaCircularNum z) {
    ColaCircularNum aux = new ColaCircularNum();
    ColaCircularNum aux2 = new ColaCircularNum();

    // Paso 1: Transferir todos los elementos de z a aux2
    while (!z.esVacia()) {
        aux2.adi(z.eli());
    }

    // Paso 2: Eliminar duplicados y almacenar elementos únicos en aux
    while (!aux2.esVacia()) {
        int elem = aux2.eli();
        boolean repetido = false;

        // Verificar si el elemento ya está en aux
        ColaCircularNum temp = new ColaCircularNum(); // Cola temporal para verificar elementos
        while (!aux.esVacia()) {
            int auxElem = aux.eli();
            if (auxElem == elem) {
                repetido = true; // El elemento ya está en aux
            }
            temp.adi(auxElem); // Restaurar elementos a aux
        }

        // Restaurar aux
        while (!temp.esVacia()) {
            aux.adi(temp.eli());
        }

        // Si el elemento no está en aux, agregarlo
        if (!repetido) {
            aux.adi(elem);
        }
    }

    // Paso 3: Vaciar aux en z para mantener solo los elementos únicos
    z.vaciar(aux);
}
*/