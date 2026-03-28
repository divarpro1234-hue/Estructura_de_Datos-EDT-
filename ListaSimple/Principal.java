import java.util.Iterator;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
//		LS_NormalPer A = new LS_NormalPer();
//		System.out.println(A.esVacia());
//		System.out.println("numero de nodos de la lista: " + A.nroNodos());
//		
//		A.leer1(4);  
//		A.mostrar();
		
		LS_NormalPer A = new LS_NormalPer();
		A.adiFinal(new Persona("jose",31));
		A.adiFinal(new Persona("ana",21));
		A.adiFinal(new Persona("maria",41));
		A.adiFinal(new Persona("saul",21));
		A.mostrar();
		System.out.println("\n" + A.esVacia());
		System.out.println("numero de nodos de la lista: " + A.nroNodos());
		
		//a) contar y mostrar las personas que tienen una edad mayor a 20.
		
		//METODOS POR PUNTEROS Y METODOS
		System.out.println();
		//mostrarPersonasMayoresEdad(A, 20);
		System.out.println("Contar y mostrar las personas que tienen una edad mayor a 20.");
		mostrarPersonasMayoresEdadVersion2(A, 20);
		A.mostrar();
		
		System.out.println("numero de nodos de la lista: " + A.nroNodos());
		LS_NormalPer B = new LS_NormalPer();
		B.adiPrincipio(new Persona("fernando",23));
		B.adiPrincipio(new Persona("carlos",24));
		B.adiPrincipio(new Persona("ana",21));
		B.adiPrincipio(new Persona("saul",21));
		B.mostrar();

		System.out.println("\n\t**EJERCICIO 1*");
		//1. Sea la lista de personas, agregar un nuevo nodo despues de cada nodo de la lista
		agregarNodosDespuesCadaNodo(A);
		A.mostrar();
		System.out.println("\nNro de nodos" + A.nroNodos());
		
		System.out.println("\n\t**EJERCICIO 2*");
		// Sean dos listas de personas mostrar elementos en comun.
		mostrar_Elementos_en_Comun(A,B);	
		
		System.out.println("\n\t**EJERCICIO 3");
		int i = 1;
		insertarLista(A,B,i);
		A.mostrar();
		
	}
	
	static void insertarLista(LS_NormalPer a, LS_NormalPer b, int i) {
		int nd = a.nroNodos();
		NodoPer R = a.getP();
		for (int j = 1; j < nd-1 ; j++) {
			R = R.getSig();
		}
		NodoPer T = R.getSig();
		NodoPer S = b.getP();
		R.setSig(S);
		while(S.getSig() != null) {
			S = S.getSig();
		}
		S.setSig(T);
	}

	private static void mostrar_Elementos_en_Comun(LS_NormalPer a, LS_NormalPer b) {
		NodoPer R = a.getP();
		boolean sw = false;
		System.out.println("\t---La personas con elemento en comun son---");
		while (R!=null) {
			Persona x = R.getDato();
			NodoPer S = b.getP();
			while (S!=null) {
				Persona k = S.getDato();
				if (x.getNom().equals(k.getNom()) && x.getEdad() == k.getEdad()) {
					sw = false;
					//System.out.println("nombre : "+ x.getNom() + "edad: " + x.getEdad());
					x.mostrar();
				}
				S = S.getSig();
			}
			R = R.getSig();
		}
		if(sw)
			System.out.println("listas no tiene datos en comun");
	}
	//procedimiento agregar Nodos Despues Cada Nodo
	
	static LS_NormalPer agregarNodosDespuesCadaNodo(LS_NormalPer a) {
		NodoPer R = a.getP();
			
		while(R != null) {
			NodoPer T = R.getSig();
			NodoPer nuevo = new NodoPer();
			Persona x = new Persona();
			x.leer();
			nuevo.setDato(x);
			R.setSig(nuevo);
			nuevo.setSig(T);
			R = nuevo.getSig();
		}
		return a;
	}

	static void mostrarPersonasMayoresEdadVersion2(LS_NormalPer A, int edadx) {
		// TODO Auto-generated method stub
		int c = 0;
		int nNodos = A.nroNodos();
		LS_NormalPer aux = new LS_NormalPer();
		
		for (int i = 1; i <= nNodos; i++) {
			NodoPer x = A.eliPrincipio();
			Persona z = x.getDato();
			aux.adiFinal(z);
			if(z.getEdad() > edadx) {
				c++;
				System.out.println(z.getNom());
			}
		}
		System.out.println("nro de personas mayores a " + edadx+ " = " +c);
		A.setP(aux.getP());
	}

	static void mostrarPersonasMayoresEdad(LS_NormalPer a, int edadx) {
		// TODO Auto-generated method stub
		int c = 0;
		NodoPer R = a.getP(); //R apunta a la raiz P
		while(R != null) {
			Persona x = R.getDato();
			if(x.getEdad() > edadx) {
				c++;
				System.out.println("nom: " + x.getNom());
			}
			R=R.getSig();
		}
		System.out.println("nro de personas mayores a " + edadx+ " = " +c);
	}
	
}