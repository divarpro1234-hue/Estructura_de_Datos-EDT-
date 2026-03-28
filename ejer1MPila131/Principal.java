public class Principal {
	public static void main(String[] args) {
		
		PilaCar car1 = new PilaCar();
		car1.adi('a');
		car1.adi('r');
		car1.adi('o');
		car1.adi('n');
	
		
		PilaCar car2 = new PilaCar();
		car2.adi('l');
		car2.adi('a');
		car2.adi('u');
		car2.adi('r');
		car2.adi('a');

		PilaCar car3 = new PilaCar();
		car3.adi('m');
		car3.adi('i');
		car3.adi('g');
		car3.adi('u');
		car3.adi('e');
		car3.adi('l');
		
		PilaCar car4 = new PilaCar();
		car4.adi('l');
		car4.adi('e');
		car4.adi('n');
		car4.adi('n');
		car4.adi('y');
		

		Mp_PilaCar b = new Mp_PilaCar(4);
		System.out.println("\tMultipila de caracteres:");
		b.vaciar(0, car1);
		b.vaciar(1, car2);
		b.vaciar(2, car3);
		b.vaciar(3, car4);

		//mostrar datos de la multipila
		b.mostrar();
		
		System.out.println();
		System.out.println("\na) Eliminar los caracteres de las pilas que formen el nombre X (variable), y dejarlas con\r\n"
				+ "0 elementos.\r\n"
				+ "");
		eliminarCaracterPilaNombre(b , "aron");
		b.mostrar();
		
		System.out.println("\nc) Eliminar el carácter X (variable) de cada pila. ");
		char carx = 'a';
		eliminarXcaracterX(b, carx);
		b.mostrar();
		
	}
	
	private static void eliminarXcaracterX(Mp_PilaCar b, char carx) {
		// TODO Auto-generated method stub
		for (int i = 0; i < b.getN(); i++) {
			PilaCar aux = new PilaCar();
			while(!b.esVacia(i)) {
				char x = b.eliminar(i);
				if(x != carx) {
					aux.adi(x);
				}
			}
			b.vaciar(i, aux);
		}
	}

	public static void eliminarCaracterPilaNombre(Mp_PilaCar mp, String nomx) {
		for (int i = 0; i < mp.getN(); i++) {
			PilaCar aux1 = new PilaCar();
			PilaCar aux2 = new PilaCar();
			PilaCar resultadoFinal = new PilaCar();
			while (!mp.esVacia(i)) {
				aux1.adi(mp.eliminar(i));
			}
			while (!aux1.esVacia()) {
				aux2.adi(aux1.eli());
			}
			boolean sw = true;
			int posicion = 0;
			while (!aux2.esVacia()) {
				char ch = aux2.eli();
				resultadoFinal.adi(ch); 
				if (posicion < nomx.length()) {
					if (ch != nomx.charAt(posicion)) {
						sw = false;
					}
				} else {
					sw = false;
				}
				posicion++;
			}
			if (posicion != nomx.length()) {
				sw = false;
			}
			if (!sw) {
				mp.vaciar(i, resultadoFinal);
			}
		}
	}
}
