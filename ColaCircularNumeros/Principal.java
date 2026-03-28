//
public class Principal {

	public static double promedioPares(int q, int suma, int contador) {
        if (q == 0) {
            if (contador == 0) {
                return 0;
            }
            return (double) suma / contador;
        }
        int ultimoDig = q % 10;
        if (ultimoDig % 2 == 0) {
            suma += ultimoDig;
            contador++;
        }
        return promedioPares(q / 10, suma, contador);
    }

    public static void main(String[] args) {
        int q = 5197612;
        double promedio = promedioPares(q, 0, 0);
        System.out.println("El promedio de los números pares en " + q + " es: " + promedio);
    }
}
//	static void ordenamientoAscMejorado(ColaCircularNum ccz) {
//		ColaCircularNum aux = new ColaCircularNum();
//		while(!ccz.esVacia()) {
//			int menor = Integer.MAX_VALUE;
//			int nroElem = ccz.nroElem();
//			
//			for (int i = 1; i <= nroElem; i++) {
//				int elem = ccz.eli();
//				//aux.adi(elem);
//				ccz.adi(elem);
//				if(elem < menor)
//					menor = elem;
//			}
//			//ccz.vaciar(aux);
//			
//			for (int i = 1; i <=nroElem; i++) {
//				int elem = ccz.eli();
//				if(elem == menor)
//					aux.adi(elem);
//				else
//					ccz.adi(elem);
//			}
//		}
//		ccz.vaciar(aux);
//	}
//
//
//	static void ordenarDescendentementeCC(ColaCircularNum ccz) {
//		ColaCircularNum aux1 = new ColaCircularNum();
//		ColaCircularNum aux2 = new ColaCircularNum();
//		
//		while(!ccz.esVacia()) {
//			int mayor = Integer.MIN_VALUE;
//			//1� determinar cual es el elemento menor
//			while(!ccz.esVacia()) {
//				int elem = ccz.eli();
//				aux2.adi(elem);
//				if(elem > mayor)
//					mayor = elem;
//			}
//			ccz.vaciar(aux2);
//			
//			//2� determinar quienes son iguales al menor
//			while(!ccz.esVacia()) {
//				int elem = ccz.eli();
//				if(elem == mayor)
//					aux1.adi(elem);
//				else
//					aux2.adi(elem);
//			}
//			ccz.vaciar(aux2);
//		}
//		ccz.vaciar(aux1);
//		
//	}
//
//	static void ordenarAscendentementeCC(ColaCircularNum ccz) {
//		ColaCircularNum aux1 = new ColaCircularNum();
//		ColaCircularNum aux2 = new ColaCircularNum();
//		
//		while(!ccz.esVacia()) {
//			int menor = Integer.MAX_VALUE;
//			//1� determinar cual es el elemento menor
//			while(!ccz.esVacia()) {
//				int elem = ccz.eli();
//				aux2.adi(elem);
//				if(elem < menor)
//					menor = elem;
//			}
//			ccz.vaciar(aux2);
//			
//			//2� determinar quienes son iguales al menor
//			while(!ccz.esVacia()) {
//				int elem = ccz.eli();
//				if(elem == menor)
//					aux1.adi(elem);
//				else
//					aux2.adi(elem);
//			}
//			ccz.vaciar(aux2);
//		}
//		ccz.vaciar(aux1);
//	}
//
//	static int contarDato(ColaCircularNum ccz, int datox) {
//		ColaCircularNum aux = new ColaCircularNum();
//		int cnt = 0;
//		while(!ccz.esVacia())  //mientras la cola circular NO ES VACIA
//		{
//			int elem = ccz.eli();
//			aux.adi(elem);
//			
//			if(elem == datox)
//				cnt++;			
//		}
//		ccz.vaciar(aux);
//		return cnt;
//	}
//
//}

//public static void encuentra_a_Bob() {
//	int n = 4;
//	String s = "bob";
//	char M[][] = {
//			{'b','v','p','c'},
//			{'a','l','e','b'},
//			{'l','o','t','k'},
//			{'i','c','b','m'}};
//	int i =0, j=0, k=0;
//	while (i<n) {
//		while(j<n) {
//			if(k<j && M[j][i]== s.charAt(k)) {
//				k++;
//				break;
//			}
//			j++;
//		}
//		i++;
//	}
//	system.out.println(k);
//}
//	

		




































