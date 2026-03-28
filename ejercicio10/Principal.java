
public class Principal {
	public static void main(String[] args) {
		
		Ingrediente i1 = new Ingrediente("mandragora", "01",20);
		Ingrediente i2 = new Ingrediente("pelo de gato", "02",15);
		Ingrediente i3 = new Ingrediente("plumas", "03",16);
		Ingrediente i4 = new Ingrediente("agua", "01",19);
		LS_NormalIng lig1 = new LS_NormalIng();
		lig1.adiFinal(i1);
		lig1.adiFinal(i2);
		lig1.adiFinal(i3);
		
		System.out.println("\tdatos lista ingrediente");
		System.out.println();
		lig1.mostrar();
	
		Hechizo h1 = new Hechizo("abadacadabra", "ofensivo", i1, i2);
		Hechizo h2 = new Hechizo("imperio", "ofensivo", i2,i3);
		Hechizo h3 = new Hechizo("crucio", "ofensivo", i4,i1);
		LS_CircularHec lh1 = new LS_CircularHec();
		lh1.adiFinal(h1);
		lh1.adiFinal(h2);
		lh1.adiFinal(h3);
		
		System.out.println("\tdatos lista hechizo");
		System.out.println();
		lh1.mostrar();
		
		Mago m1 = new Mago("harry", h2.getNombre());
		Mago m2 = new Mago("voldemort", h1.getNombre());
		Mago m3 = new Mago("severuz", h3.getNombre());
		LS_CircularMag lm1= new LS_CircularMag();
		lm1.adiFinal(m1);
		lm1.adiFinal(m2);
		lm1.adiFinal(m3);
		System.out.println("\tdatos lista mago");
		System.out.println();
		lm1.mostrar();
		System.out.println();
		//e)
		System.out.println("Ordenar la Lista de Magos ascendentemente "
				+ "por el \r\ncosto de realizar su hechizo"
				+ "favorito");
		ordenarMagosPorCosto(lm1,lh1,lig1);
	}
	static void ordenarMagosPorCosto(LS_CircularMag lm, LS_CircularHec lh, LS_NormalIng lig) {
	    boolean intercambio;
	    do {
	        intercambio = false;
	        NodoMag R = lm.getP();
	        do {
	            NodoMag S = R.getSig();
	            Hechizo h1 = obtenerHechizoPorNombre(lh, R.getMago().getNombreHechizoFav());
	            Hechizo h2 = obtenerHechizoPorNombre(lh, S.getMago().getNombreHechizoFav());

	            int ca = calcularCostoHechizo(h1, lig);
	            int cs = calcularCostoHechizo(h2, lig);
	            if (ca > cs) {
	              
	                Mago x = R.getMago();
	                R.setMago(S.getMago());
	                S.setMago(x);
	                intercambio = true;
	            }
	            R = R.getSig();
	        } while (R.getSig() != lm.getP());
	    } while (intercambio);

	    System.out.println("\nLista de magos ordenada por costo del hechizo favorito:");
	    lm.mostrar();
	}

	static Hechizo obtenerHechizoPorNombre(LS_CircularHec lh1, String nomh) {
	    NodoHec R = lh1.getP();
	    if (R == null) 
	    	return null;
	    do {
	        Hechizo x = R.getHechizo();
	        if (x.getNombre().equals(nomh)) {
	            return x;
	        }
	        R = R.getSig();
	    } while (R != lh1.getP());
	    return null;
	}

	static int calcularCostoHechizo(Hechizo y, LS_NormalIng lig1) {
	    if (y == null) 
	    	return 0;
	    Ingrediente ing1 = y.getId_primer_ing();
	    Ingrediente ing2 = y.getId_ultimo_ing();
	    int costoIng1 = obtenerCostoIngrediente(lig1, ing1.getNombre());
	    int costoIng2 = obtenerCostoIngrediente(lig1, ing2.getNombre());
	    return costoIng1 + costoIng2;
	}

	static int obtenerCostoIngrediente(LS_NormalIng lig1, String nombreIngrediente) {
	    NodoIng R = lig1.getP();
	    while (R != null) {
	        Ingrediente x = R.getIngrediente();
	        if (x.getNombre().equals(nombreIngrediente)) {
	            return x.getCosto();
	        }
	        R = R.getSig();
	    }
	    return 0; 
	}

}