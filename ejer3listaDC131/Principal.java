public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LD_CircularFA A = new LD_CircularFA();
		A.adiFinal(new F_Agropecuaria("401", "Feria del Trigo", "2025-06-15", "Santa Cruz"));
		A.adiFinal(new F_Agropecuaria("402", "Expo Agro Valle", "2025-07-10", "	Cochabamba"));
		A.adiFinal(new F_Agropecuaria("403", "Feria Ganadera Altiplano", "2025-08-05", "Oruro"));
		A.adiFinal(new F_Agropecuaria("404", "Agroexpo Chiquitania", "2025-09-20", "San Ignacio"));
		A.mostrar();
		
		LD_NormalP B = new LD_NormalP();
		B.adiFinal(new Puesto("501", "P-01", "Juan", "401"));
		B.adiFinal(new Puesto("501", "P-02", "María", "402"));
		B.adiFinal(new Puesto("501", "P-03", "Luis", "403"));
		B.adiFinal(new Puesto("501", "P-04", "Saul", "404"));
		B.mostrar();
		
		LS_CircularProd C = new LS_CircularProd();
		C.adiFinal(new Producto("Trigo", 80, "501"));
		C.adiFinal(new Producto("Harina Integral", 50, "501"));
		C.adiFinal(new Producto("Miel de abeja", 45, "502"));
		C.adiFinal(new Producto("Quinua real", 60, "503"));
		C.mostrar();
		
		System.out.println("\na) Mostrar el producto más vendido en las "
				+ "ferias de nombre Y.\r\n"
				+ "");
		String nombreFeriaY = "Feria del Trigo";
		productoMasVendidoEnFeriaY(A, B, C, nombreFeriaY);
	}

	private static void productoMasVendidoEnFeriaY(LD_CircularFA A, LD_NormalP B, LS_CircularProd C, String nomY) {
	    NodoFA R = A.getP();
	    int maxCant = -1;
	    Producto prodMax = null;
	    do {
	        F_Agropecuaria x = R.getF_agro();
	        if (x.getNomFeria().equalsIgnoreCase(nomY)) {
	            String codFeria = x.getId(); 
	            NodoP S = B.getP();
	            while (S != null) {
	                Puesto p = S.getPuesto();
	                if (p.getIdF_agro().equals(codFeria)) {
	                    String idP = p.getId();
	                    NodoProd T = C.getP();
	                    if (T != null) {
	                        NodoProd aux = T;
	                        do {
	                            Producto prod = T.getProd();
	                            if (prod.getIdPuesto().equals(idP)) {
	                                if (prod.getPrecio() > maxCant) {
	                                    maxCant = prod.getPrecio();
	                                    prodMax = prod;
	                                }
	                            }
	                            T = T.getSig();
	                        } while (T != aux);
	                    }
	                }

	                S = S.getSig();
	            }
	        }

	        R = R.getSig();
	    } while (R != A.getP());

	    if (prodMax != null) {
	        System.out.println("Producto más vendido en la feria " + nomY );
	        prodMax.mostrar();
	    } else {
	        System.out.println("No se encontraron productos en la feria " + nomY);
	    }
	}
}