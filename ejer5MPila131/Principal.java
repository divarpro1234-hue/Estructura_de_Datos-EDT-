
public class Principal {

	public static void main(String[] args) {
		
		PilaCasa z = new PilaCasa();
		z.adi(new Casa("0001", "alan", 50000));
		z.adi(new Casa("0007", "lucho", 40000));
		z.adi(new Casa("0008", "saul", 50000));
	
		PilaCasa w =  new PilaCasa();
		w.adi(new Casa("0002", "fercho", 45000));
		w.adi(new Casa("0009", "daniel", 46000));
		w.adi(new Casa("0003", "joel", 42000));
		
		PilaCasa x = new PilaCasa();
		x.adi(new Casa("0012", "brice", 61000));
		x.adi(new Casa("0011", "will", 65000));
		x.adi(new Casa("0013", "german", 69000));
			
		PilaCasa y = new PilaCasa();
		y.adi(new Casa("0014", "xavier", 41000));
		y.adi(new Casa("0016", "danna", 45000));
		y.adi(new Casa("0015", "henry", 45000));
		
		PilaZona z1 = new PilaZona();
		z1.adi(new Zona("Alpacoma"));
		z1.adi(new Zona("cotacota"));
		z1.adi(new Zona("irpavi"));
		z1.adi(new Zona("Pasankeri"));
		
		
		
		Mp_PilaCasa b = new Mp_PilaCasa(4);
		System.out.println("\tMultipila de objetos auxiliar:");
		b.vaciar(0, z);
		b.vaciar(1, w);
		b.vaciar(2, x);
		b.vaciar(3, y);
		//mostrar datos de la multipila
		b.mostrar();
 		
		System.out.println("\ndatos de la pila zonas");
		z1.mostrar();
		
		System.out.println("\na) De la zona con nombre X, mostrar "
				+ "cual(es) es/son la(s) casa(s) más grande(s).");
		String zonaX = "cotacota";
		mostrarZonaXCasaGrande(b, z1, zonaX);
		
		System.out.println("\nc) Por problemas de límites territoriales"
				+ ", eliminar la primera casa de la zona “Pasankeri”\r\n"
				+ "y adicionarla a la zona “Alpacoma”.");
		
		String zonaQ = "Alpacoma";
		String zonaW = "Pasankeri";
		eliminarZonaYAdicionarZona(b,z1);
		b.mostrar();
	}

	private static void eliminarZonaYAdicionarZona(Mp_PilaCasa b, PilaZona z1) {
		// TODO Auto-generated method stub
		PilaZona aux = new PilaZona();
		Casa h = new Casa();
		int cnt = -1;
		int cnt1 = -1;
		while(!z1.esVacia()) {
			cnt++;
			Zona z = z1.eli();
			if(z.getNombre().equals("Pasankeri")) {
				h = b.eliminar(cnt);
			}
			aux.adi(z);
		}
		z1.vaciar(aux);
		
		while(!z1.esVacia()) {
			cnt1++;
			Zona zo = z1.eli();
			if(zo.getNombre().equals("Alpacoma")) {
				b.adicionar(cnt1, h);;
			}
			aux.adi(zo);
		}
		z1.vaciar(aux);
	}

	private static void mostrarZonaXCasaGrande(Mp_PilaCasa b, PilaZona z1, String zonaX) {
		PilaZona aux = new PilaZona();
		int cnt = -1;
		while(!z1.esVacia()) {
			cnt++;
			Zona x = z1.eli();
			if(x.getNombre().equals(zonaX)) {
				for (int i = 0; i < b.getN(); i++) {
					if(cnt == i) {
						PilaCasa aux2 = new PilaCasa();
						int may = 0;
						while(!b.esVacia(i)) {
							Casa y = b.eliminar(i);
							if(y.getTamanio() >= may) {
								may = y.getTamanio();
							}
							aux2.adi(y);
						}
						b.vaciar(i, aux2);
						while(!b.esVacia(i)) {
							Casa z = b.eliminar(i);
							if(z.getTamanio() == may)
								z.mostrar();
						}
					}
					
				}
			}
			aux.adi(x);
		}
		z1.vaciar(aux);
	}
	
}
