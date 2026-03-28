
package lugaresventas;

public class Principal {
	static int cb = 0, ct = 0;
    public static void main(String[] args) {
        
    	Venta v1 = new Venta("bolivar", "juan");
    	Venta v2 = new Venta("bolivar", "carlos");
    	Venta v3 = new Venta("tigre", "pepe");
    	LS_CircularVenta l1 = new LS_CircularVenta();
    	l1.adiFinal(v1);
    	l1.adiFinal(v2);
    	l1.adiFinal(v3);
    	
    	Venta v4 = new Venta("tigre", "elba");
       	Venta v5 = new Venta("bolivar", "juan");
    	Venta v6 = new Venta("tigre", "carlos");
    	Venta v7 = new Venta("bolivar", "pepe");
    	LS_CircularVenta l2 = new LS_CircularVenta();
    	l2.adiFinal(v4);
    	l2.adiFinal(v5);
    	l2.adiFinal(v6);
    	l2.adiFinal(v7);
    	
    	Venta v8 = new Venta("bolivar", "eren");
    	Venta v9 = new Venta("bolivar", "fernanado");
    	LS_CircularVenta l3 = new LS_CircularVenta();
    	l3.adiFinal(v8);
    	l3.adiFinal(v9);
    	
    	Venta v10 = new Venta("tigre", "pedro");
    	Venta v11 = new Venta("bolivar", "daniel");
    	LS_CircularVenta l4 = new LS_CircularVenta();
    	l4.adiFinal(v10);
    	l4.adiFinal(v11);
    	
    	LD_NormalLug A = new LD_NormalLug();
    	A.adiFinal("curva sur", 100, l1);
    	A.adiFinal("curva norte", 100, l2);
    	A.adiFinal("recta", 200, l3);
    	A.adiFinal("preferencial", 600, l4);
        // Mostrar todos los lugares con sus ventas
    	System.out.println();
    	System.out.println("\tCLASICO PACEÑO");
        A.mostrar();
        
        //a)
        System.out.println("\na) Mostrar cual es el equipo con mayor hinchada");
        mostrarEquipoMayHinchada(A);
        //b)
        System.out.println("\nb) Mover hinchas del bolivar al lugar curva norte,");
        System.out.println(" tigre al lugar curva sur");
        String cn= "curva norte", cs = "curva sur";
        moverHinchasLugar(A, cn, cs);
        A.mostrar();
    }

    private static void moverHinchasLugar(LD_NormalLug z, String cn, String cs) {
        NodoLug R = z.getP();
        LS_CircularVenta la = new LS_CircularVenta();
        LS_CircularVenta lb = new LS_CircularVenta();
        while (R != null) {
            if (R.getLugar().equals(cn)) {
                la = R.getLV(); 
            }
            if (R.getLugar().equals(cs)) {
                lb = R.getLV();
            }
            R = R.getSig();
        }
        moverLugarBolivar(la, lb);
        moverLugarTigre(la, lb);
        
        NodoLug R1 = z.getP();
        while (R1 != null) {
            if (R1.getLugar().equals(cn)) {
                la = R1.getLV();
            }
            if (R1.getLugar().equals(cs)) {
                lb = R1.getLV();
            }
            R1 = R1.getSig();
        }
    }

    private static void moverLugarBolivar(LS_CircularVenta la, LS_CircularVenta lb) {
        int nd = la.nroNodos();
        for (int i = 1; i <= nd; i++) {
            NodoV x = la.eliPrincipio();
            Venta ve = x.getVenta();
            if (ve.getEquipo().equals("bolivar")) {
                lb.adiFinal(ve);
            } else {
                la.adiFinal(ve);
            }
        }
    }

    private static void moverLugarTigre(LS_CircularVenta lb, LS_CircularVenta la) {
        int nd = la.nroNodos();
        for (int i = 1; i <= nd; i++) {
            NodoV x = la.eliPrincipio();
            Venta ve = x.getVenta();
            if (ve.getEquipo().equals("tigre")) {
                lb.adiFinal(ve);
            } else {
                la.adiFinal(ve);
            }
        }
    }
    
	private static void mostrarEquipoMayHinchada(LD_NormalLug a) {
		// TODO Auto-generated method stub
		NodoLug R = a.getP();
		while(R != null) {
			LS_CircularVenta z = R.getLV();
			contarHinchas(z);
			R = R.getSig();
		}
		if(cb == ct)
			System.out.println("no hay hinchada mayor");
		else {
			if(cb > ct)
				System.out.println("hinchada mayor bolivar");
			else
				System.out.println("hinchada mayor tigre");
		}
	}

	private static void contarHinchas(LS_CircularVenta z) {
		// TODO Auto-generated method stub
		int nv = z.nroNodos();
		NodoV R = z.getP();
		for (int i = 1; i <= nv; i++) {
			if(R.getVenta().getEquipo().equals("bolivar"))
				cb++;
			else
				ct++;
			R = R.getSig();
		}
	}
    
}
