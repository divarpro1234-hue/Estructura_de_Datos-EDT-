
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PilaLibro z = new PilaLibro();
		Libro z1 = new Libro(501, "Por Trece Razones", "Jay Asher" , 1998);
		Libro z2 = new Libro(500, "En las montañas de la locura", "H.P. Lovecraft" , 2001);
		Libro z3 = new Libro(505, "Orgullo y Prejuicio", "jane austen" , 1740);
		Libro z4 = new Libro(506, "El Mundo del Mañana", "Susan EE" , 1999);
		Libro z5 = new Libro(500, "Emma", "jane austen" , 2006);
		//z.llenar(5);
		z.adi(z1);
		z.adi(z2);
		z.adi(z3);
		z.adi(z4);
		z.adi(z5);
		
		//a)
		int pag = 500;
		z.mostrar();
		LibroPaginas(z, pag);
		//b)
		String autorx = "Jane austen";
		System.out.println("\nMover al final de la pila libros con el autor "+ autorx);
		moverLibroAutorFinal(z, autorx);
		z.mostrar();
		//c)
		System.out.println("\nLibros ordenados de manera ascendente");
		ordenarLibrosAscen(z);
		
	}
	static void ordenarLibrosAscen(PilaLibro z) {
		// TODO Auto-generated method stub
		PilaLibro aux1 = new PilaLibro();
		PilaLibro aux2 = new PilaLibro();
		while(!z.esVacia()) {
			int Mayor = buscarLibroAnioMay(z);
			while(!z.esVacia()) {
				Libro x = z.eli();
				if(x.getAnioPublicado() == Mayor)
					aux1.adi(x);
				else
					aux2.adi(x);
			}
			z.vaciar(aux2);
		}
		z.vaciar(aux1);
		z.mostrar();
	}
	static int buscarLibroAnioMay(PilaLibro z) {
		// TODO Auto-generated method stub
		int mayor=0;
		PilaLibro aux = new PilaLibro();
		while (!z.esVacia()) {
	        Libro x = z.eli();
	        if (x.getAnioPublicado() > mayor) {
	            mayor = x.getAnioPublicado(); // Encontramos el mayor
	        }
	        aux.adi(x); // Guardamos los libros en aux para restaurar la pila después
	    }
		z.vaciar(aux);
		return mayor;
	}
	private static void moverLibroAutorFinal(PilaLibro z, String autorx) {
		// TODO Auto-generated method stub
		PilaLibro aux1 = new PilaLibro();
		PilaLibro aux2 = new PilaLibro();
		while(!z.esVacia()) {
			Libro x = z.eli();
			if(x.getautor().equalsIgnoreCase(autorx)) {
				aux1.adi(x);
			}else
				aux2.adi(x);
		}
		z.vaciar(aux1);
		z.vaciar(aux2);
	}

	private static void LibroPaginas(PilaLibro z, int pag) {
		// TODO Auto-generated method stub
		PilaLibro aux = new PilaLibro();
		int contador = 0;
		while(!z.esVacia()) {
			Libro x = z.eli();
			aux.adi(x);
			if(x.getNroPag() >pag)
				contador++;
		}
		System.out.println("\nLos libros que tienen mas de " + pag + " paginas son: "+contador+" libros");
		z.vaciar(aux);
	}
	
}
