public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LD_CircularH A = new LD_CircularH();
		A.adiFinal(new Habitacion("101", "Dormitorio", "Azul", "Mediano"));
		A.adiFinal(new Habitacion("102", "Sala", "Gris", "Grande"));
		A.adiFinal(new Habitacion("103", "Cocina", "Blanco", "Pequeño"));
		A.adiFinal(new Habitacion("104", "Comedor", "Beige", "Mediano"));
		A.mostrar();
		
		LD_CircularBI B = new LD_CircularBI();
		B.adiFinal(new Bien_Inmueble("101", 120, "La Paz"));
		B.adiFinal(new Bien_Inmueble("102", 95, "Santa Cruz"));
		B.adiFinal(new Bien_Inmueble("103", 150, "Cochabamba"));
		B.adiFinal(new Bien_Inmueble("104", 80, "Oruro"));
		B.mostrar();
		
		LS_NormalM C = new LS_NormalM();
		C.adiFinal(new Mueble("101", 2, "Casa Jardín"));
		C.adiFinal(new Mueble("102", 3, "Villa Esperanza"));
		C.adiFinal(new Mueble("103", 1, "Hogar Feliz"));
		C.adiFinal(new Mueble("104", 4, "Residencia Sol"));
		C.mostrar();
		System.out.println("\na) Mostrar el bien inmueble que tengas más muebles en las "
				+ "habitaciones de tipo\r\n"
				+ "“Sala”.");
		MostrarBienInmuebleMasMuebles(A,B,C);
		
		System.out.println("\nb) Del bien inmueble más grande eliminar las habitaciones "
				+ "que tengan menos de X\r\n"
				+ "muebles");
		eliminarHab(A,B,C);
		
		System.out.println();
	}
	private static void eliminarHab(LD_CircularH A, LD_CircularBI B, LS_NormalM C) {
	    int X = 3;
	    NodoBI R = B.getP();
	    int maxSup = 0;
	    String codMax = "";
	    if (R != null) {
	        do {
	            Bien_Inmueble bi = R.getBien();
	            if (bi.getTamanio() > maxSup) {
	                maxSup = bi.getTamanio();
	                codMax = bi.getIdCasa();
	            }
	            R = R.getSig();
	        } while (R != B.getP());
	    }

	    NodoH ant = A.getP();
	    NodoH act = A.getP();
	    boolean primero = true;

	    if (act != null) {
	        do {
	            Habitacion h = act.getHab();
	            String codHab = h.getIdCasa();
	            int cantidadMuebles = obtenerCantidadMuebles(C, codHab);

	            NodoH sig = act.getSig(); 

	            if (codHab.equals(codMax) && cantidadMuebles < X) {
	                A.eliminarPorCodigo(codHab);
	            }

	            act = sig;
	            if (primero) {
	                ant = A.getP();
	                primero = false;
	            }

	        } while (act != A.getP());
	    }

	    System.out.println("Habitaciones actualizadas:");
	    A.mostrar();
	}
	private static int obtenerCantidadMuebles(LS_NormalM C, String codHab) {
	    NodoM R = C.getP();
	    while (R != null) {
	        Mueble m = R.getMue();
	        if (m.getidCasa().equals(codHab)) {
	            return m.getCantidad();
	        }
	        R = R.getSig();
	    }
	    return 0;
	}
	private static void MostrarBienInmuebleMasMuebles(LD_CircularH A, LD_CircularBI B, LS_NormalM C) {
	    NodoH R = A.getP();
	    String codSala = "";
	    int maxCant = 0;
	    if (R != null) {
	        do {
	            Habitacion h = R.getHab();
	            if (h.getTipoHab().equalsIgnoreCase("Sala")) {
	                String codHab = h.getIdCasa();
	                NodoM aux = C.getP();
	                while (aux != null) {
	                    Mueble m = aux.getMue();
	                    if (m.getidCasa().equals(codHab)) {
	                        if (m.getCantidad() > maxCant) {
	                            maxCant = m.getCantidad();
	                            codSala = codHab;
	                        }
	                    }
	                    aux = aux.getSig();
	                }
	            }
	            R = R.getSig();
	        } while (R != A.getP());
	    }
	    if (!codSala.equals("")) {
	        NodoBI S = B.getP();
	        if (S != null) {
	            do {
	                Bien_Inmueble bi = S.getBien();
	                if (bi.getIdCasa().equals(codSala)) {
	                    System.out.println("Bien inmueble con más muebles en Sala:");
	                    bi.mostrar();
	                    return;
	                }
	                S = S.getSig();
	            } while (S != B.getP());
	        }
	    } else {
	        System.out.println("No se encontró ninguna habitación de tipo 'Sala' con muebles.");
	    }
	}
}