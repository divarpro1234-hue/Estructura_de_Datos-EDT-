
public class Principal {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("fabian", 2);
		Cliente c2 = new Cliente("alicia", 1);
		Cliente c3 = new Cliente("erland", 2);
		
		LS_NormalC lc1 = new LS_NormalC();
		lc1.adiFinal(c1);
		lc1.adiFinal(c2);
		lc1.adiFinal(c3);
		System.out.println("datos lista cliente");
		System.out.println();
		lc1.mostrar();
	
		Venta v1 = new Venta("polera", "L", 45);
		Venta v2 = new Venta("jeans", "40", 120);
		Venta v3 = new Venta("vestido", "36", 75);
		Venta v4 = new Venta("camisa", "M", 55);
		Venta v5 = new Venta("jeans", "40", 100);
		LS_CircularV lv1 = new LS_CircularV();
		lv1.adiFinal(v1);
		lv1.adiFinal(v2);
		lv1.adiFinal(v3);
		lv1.adiFinal(v4);
		lv1.adiFinal(v5);
		System.out.println("datos lista venta");
		System.out.println();
		lv1.mostrar();
		System.out.println("a) Mostrar al cliente número 𝑿 de la lista y las prendas que compró.");
		mostrarClientePrendas(lc1,lv1,1);
	}
	static void mostrarClientePrendas(LS_NormalC lc, LS_CircularV lv, int i) {
	    
	    NodoC R = lc.getP();
	    int p = 0;
	    while (R != null && p < i) {
	        R = R.getSig();
	        p++;
	    }
	    Cliente x = R.getCliente();
	    System.out.println("Cliente númerox " + i + ":");
	    System.out.println("Nombre: " + x.getNombre());
	    System.out.println("Cantidad prendas compradas: " + x.getNroCompra());
	    NodoV S = lv.getP();
	    int pcnt = 0;
	    do {
	        Venta y = S.getVenta();
	        if (pcnt < x.getNroCompra()) {
	        	System.out.println("prenda comprada");
	            System.out.println(y.getPrenda()+", "+ y.getTalla()+", "+y.getPrecio());
	            pcnt++;
	        }
	        S = S.getSig();
	    } while (S != lv.getP() && pcnt < x.getNroCompra());
	    
	}



}