//Lic Aruquipa Marcelo
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilaF A = new PilaF();
		
		Folder f1 = new Folder("amarillo", "oficio",2);
		Folder f2 = new Folder("verde", "carta",1.5);
		Folder f3 = new Folder("rojo", "oficio",3);
		Folder f4 = new Folder("amarillo", "carta",2);
		Folder f5 = new Folder("azul", "oficio",2);
		A.adi(f1);
		A.adi(f2);
		A.adi(f3);
		A.adi(f4);
		A.adi(f5);
		
		A.mostrar();
		
		//b)agrupar por tama�o
//		System.out.println("\npila de folder agrupado por tama�o");
//		agruparFolderTamanio(A);
//		A.mostrar();
		
		//c)comparar dos pilas de folder y mostrar los folders iguales
		PilaF B = new PilaF();
			
		Folder f6 = new Folder("amarillo", "oficio",2);
		Folder f7 = new Folder("verde", "carta",1.5);
		Folder f8 = new Folder("rojo", "oficio",3);
		
		B.adi(f6);
		B.adi(f7);
		B.adi(f8);
		B.mostrar();
//		System.out.println("\nDado dos pilas de folders, mostrar los folders que son iguales en color y tama�o");
//		compPilaFolderIagual(A, B);
//		System.out.println();
		System.out.println("Determinar cuántos folders son de tamaño z");
		String tamanioz = "carta";
		DeterminarFolderTamanioZ(A,tamanioz);
	}
	
	static void DeterminarFolderTamanioZ(PilaF a, String tamanioz) {
	    PilaF aux = new PilaF();
	    int contador = 0;

	    while (!a.esVacia()) {
	        Folder x = a.eli();
	        if (x.getTamanio().equals(tamanioz)) {
	            contador++; 
	        }
	        aux.adi(x);
	    }
	    a.vaciar(aux);

	    System.out.println("Total de folders con tamaño " + tamanioz + ": " + contador);
	}


	//b)
	static void agruparFolderTamanio(PilaF a) {
		// TODO Auto-generated method stub
		PilaF aux = new PilaF();
		PilaF agrupado = new PilaF();
		
		while(!a.esVacia()) {
			Folder x = a.eli();
			while(!a.esVacia()) {
				Folder z = a.eli();
				if(x.getTamanio().equals(z.getTamanio()))
					agrupado.adi(z);
				else
					aux.adi(z);
			}
			agrupado.adi(x);
			a.vaciar(aux);
		}
		a.vaciar(agrupado);
	}
	//c)
	static void compPilaFolderIagual(PilaF A, PilaF B) {
		// TODO Auto-generated method stub
		PilaF auxA = new PilaF();
		PilaF auxB = new PilaF();
		while(!A.esVacia()){
			Folder x = A.eli();
			while(!B.esVacia()){
				Folder z = B.eli();
				if(x.getColor().equals(z.getColor()) && x.getTamanio().equals(z.getTamanio()))
					x.mostrar();
				auxA.adi(x);
				auxB.adi(z);
			}
			B.vaciar(auxB);
		}
		A.vaciar(auxA);
	}
	
}
