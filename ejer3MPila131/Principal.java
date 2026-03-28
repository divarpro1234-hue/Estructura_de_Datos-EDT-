
public class Principal {

	public static void main(String[] args) {
		
		PilaAux z = new PilaAux();
		z.adi(new Auxiliar("123456", "alan", 48, 2, 620.50));
		z.adi(new Auxiliar("123456", "pepe", 48, 2, 620.50));
		z.adi(new Auxiliar("123456", "juan", 48, 2, 620.50));
		z.adi(new Auxiliar("123456", "dann", 48, 2, 620.50));
	
		PilaAux w =  new PilaAux();
		w.adi(new Auxiliar("789456", "aron", 24, 1, 320.60));
		w.adi(new Auxiliar("789456", "aron", 24, 1, 320.60));
		w.adi(new Auxiliar("789456", "aron", 24, 1, 320.60));
		
		PilaAux x = new PilaAux();
		x.adi(new Auxiliar("456123", "lukas", 72, 3, 890.30));
		x.adi(new Auxiliar("456123", "lukas", 72, 3, 890.30));
		x.adi(new Auxiliar("456123", "lukas", 72, 3, 890.30));
		
		PilaAux y = new PilaAux();
		y.adi(new Auxiliar("123456", "xavier", 48, 2, 620.50));
		y.adi(new Auxiliar("456725", "xavier", 48, 2, 620.50));
		y.adi(new Auxiliar("456725", "xavier", 48, 2, 620.50));
		
		PilaAux q = new PilaAux();
		q.adi(new Auxiliar("125478", "joel", 24, 1 , 320.60));
		q.adi(new Auxiliar("125478", "joel", 24, 1 , 320.60));
		q.adi(new Auxiliar("125478", "joel", 24, 1 , 320.60));
		
		PilaAux s = new PilaAux();
		s.adi(new Auxiliar("325698", "daniel", 72, 3, 890.30));
		s.adi(new Auxiliar("325698", "daniel", 72, 3, 890.30));
		
		
		Mp_PilaAux b = new Mp_PilaAux(6);
		System.out.println("\tMultipila de objetos auxiliar:");
		b.vaciar(0, z);
		b.vaciar(1, w);
		b.vaciar(2, x);
		b.vaciar(3, y);
		b.vaciar(4, q);
		b.vaciar(5, s);
		//mostrar datos de la multipila
//		b.mostrar();
 		
		System.out.println();
		System.out.println("\na) Verificar si existe algún auxiliar que dicta clases"
				+ " en más de una carrera.");
		if(verificaExiteAuxMateria(b)) {
			System.out.println("si existe");
		}else {
			System.out.println("no existe");
		}
		
		System.out.println();
		
		int l = 500;
		int r = 800;
		System.out.println("\nb) Eliminar a los auxiliares que tengan un "
				+ "sueldo en el rango [L, R], excepto los\r\n"
				+ "auxiliares de Informática.");
		
		eliminarAuxSueldoRango(b,l,r);
		b.mostrar();
	}
	

	private static void eliminarAuxSueldoRango(Mp_PilaAux b, int l, int r) {
		// TODO Auto-generated method stub
		for (int i = 1; i < b.getN(); i++) {
			PilaAux aux = new PilaAux();
			while(!b.esVacia(i)) {
				Auxiliar x = b.eliminar(i);
				if(x.getSalario() < l || x.getSalario() > r) {
					aux.adi(x);
				}
			}
			b.vaciar(i, aux);
		}
	}


	private static boolean verificaExiteAuxMateria(Mp_PilaAux b) {
		for (int i = 0; i < b.getN(); i++) {
			PilaAux aux = new PilaAux();
			while (!b.esVacia(i)) {
				Auxiliar x = b.eliminar(i);
				aux.adi(x);
				for (int j = i + 1; j < b.getN(); j++) {
					PilaAux aux2 = new PilaAux();
					while (!b.esVacia(j)) {
						Auxiliar y = b.eliminar(j);
						aux2.adi(y);
						if (x.getCi() == y.getCi()) {
							b.vaciar(j, aux2);
							b.vaciar(i, aux);
							return true;
						}
					}
					b.vaciar(j, aux2);
				}
			}
			b.vaciar(i, aux); 
		}
		return false;
	}

//	private static boolean verificaExiteAuxMateria(Mp_PilaEstudiante b) {
//		// TODO Auto-generated method stub
//		for (int i = 0; i < b.getN(); i++) {
//			PilaAux aux = new PilaAux();
//			while(!b.esVacia(i)) {
//				PilaAux aux2 = new PilaAux();
//				Auxiliar x = b.eliminar(i);
//				while(!b.esVacia(i)) {
//					Auxiliar y = b.eliminar(i);
//					if(x.getCi() == y.getCi()) {
//						aux2.adi(y);
//						b.vaciar(i, aux2);
//						return true;
//					}else
//						aux2.adi(y);
//				}
//				b.vaciar(i, aux2);
//				aux.adi(x);
//			}
//			b.vaciar(i, aux);
//			
//		}
//		return false;
//	}
//	
}
