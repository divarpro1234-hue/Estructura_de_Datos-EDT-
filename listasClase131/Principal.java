import java.util.Iterator;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
				
		LS_NormalPer A = new LS_NormalPer();
		A.adiFinal(new Persona("jose",31));
		A.adiFinal(new Persona("ana",21));
		A.adiFinal(new Persona("maria",41));
		A.adiFinal(new Persona("saul",21));
		A.adiFinal(new Persona("daniel", 20));
		
		System.out.println("\n" + A.esVacia());
		
		System.out.println("numero de nodos de la lista: " + A.nroNodos());
		System.out.println("\nadicionar principio");
		A.adiPrincipio(new Persona("hola", 20));
		//a) contar y mostrar las personas que tienen una edad mayor a 20.
		
		System.out.println("\nelimina nodo principio");
		NodoPer z = A.eliPrincipio();
		A.mostrar();
		System.out.println("\nNodo eliminado");
		z.getDato().mostrar();
		
		//promedio de edad de la lista
		double prom = promedioEdad(A);
		System.out.println("el promedio es: " + prom);
		
//		System.out.println();
//		System.out.println("\ninsertar nodo despues de cada nodo");
//		insetaNodo(A);
		
		//opcion 2 
		System.out.println("------------opcion 2--------------------");
		double promm = promEdad(A);
		System.out.println("promedio de las personas de edad es: "+ promm);
		System.out.println("++--------lista------------------");
		A.mostrar();
	}

	private static double promEdad(LS_NormalPer a) {
		// TODO Auto-generated method stub
		LS_NormalPer aux = new LS_NormalPer();
		int sumaEdad = 0;
		int nNodo = a.nroNodos();
		for (int i = 1; i <= nNodo; i++) {
			NodoPer x = a.eliPrincipio();
			Persona z = x.getDato();
			sumaEdad = sumaEdad + z.getEdad();
			aux.adiFinal(z);
		}
		a.setP(aux.getP());
		return (sumaEdad/a.nroNodos());
		
	}

//	private static void insetaNodo(LS_NormalPer a) {
//		// TODO Auto-generated method stub
//		NodoPer R = a.getP();
//		while(R.getSig() != null) {
//			NodoPer nuevo = new NodoPer();
//			Persona x = new Persona();
//			x.leer();
//			nuevo.setDato(x);
//			
//		}
//	}

	static double promedioEdad(LS_NormalPer a) {
		// TODO Auto-generated method stub
		NodoPer R = a.getP();
		
		int sumaEdad = 0;
		while(R != null) {
			
			Persona x = R.getDato();
			sumaEdad = sumaEdad + x.getEdad();
			R = R.getSig();
		}
		return (sumaEdad/a.nroNodos());
	}
		
}