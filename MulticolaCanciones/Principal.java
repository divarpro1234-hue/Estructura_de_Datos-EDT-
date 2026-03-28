import java.util.Iterator;

/**
 *
 * @author CALLISAYA
 */
public class Principal {

	public static void main(String[] args) {
		ColaSimpleC c1 = new ColaSimpleC();  //3 canciones
		ColaSimpleC c2 = new ColaSimpleC();  //2 canciones
		ColaSimpleC c3 = new ColaSimpleC();  //4 canciones
		ColaSimpleC c4 = new ColaSimpleC();  //1 cancion
		
		Cancion t1 = new Cancion("Hotel california", "rock","Eagles",1);
		Cancion t2 = new Cancion("My Eyes", "pop","Travis",5);
		Cancion t3 = new Cancion("pollito pio", "balada","Elba Lazo",2);
		
		
		Cancion t4 = new Cancion("Thriller", "pop","Michel",7);
		Cancion t5 = new Cancion("Billie", "pop","Michael",5);
		
		Cancion t6 = new Cancion("Hotel california 1", "rock","Eagles",3);
		Cancion t7 = new Cancion("Hotel california 3", "rock","Eagles",1);
		Cancion t8 = new Cancion("Hotel california 5", "rock","Eagles",4);
		Cancion t9 = new Cancion("Hotel california 2 ", "rock","Eagles",7);
		
		Cancion t10 = new Cancion("california", "balada","Armando Lios",3);
		Cancion t11 = new Cancion("cali", "balada","Armando Lios",4);
		
		c1.adi(t1);  c1.adi(t2); c1.adi(t3);
		c2.adi(t4);  c2.adi(t5);
		c3.adi(t6); c3.adi(t7); c3.adi(t8); c3.adi(t9);
		c4.adi(t10); c4.adi(t11);
		
		Mc_Canciones A = new Mc_Canciones(4);
		A.vaciar(0, c1);
		A.vaciar(1, c2);
		A.vaciar(2, c3);
		A.vaciar(3, c4);
		
		A.mostrar();
		
		//a)
		
		//System.out.println("\n mover canciones del cantante x a la ultima cola");
		//moverCancionCantante(A, "Eagles");
		//A.mostrar();
		
		//b
		System.out.println("\nordenar canciones de forma decendente");
		ordenarDesDur(A);
		A.mostrar();
	}

	private static void ordenarDesDur(Mc_Canciones mc) {
		// TODO Auto-generated method stub
		for (int i = 0; i < mc.getN(); i++) {
			ColaSimpleC aux = new ColaSimpleC();
			while(!mc.esVacia(i)) {
				
				double may = 0;
				int nc = mc.nroElem(i);
				for (int j = 1; j <= nc; j++) {
					Cancion x = mc.eliminar(i);
					if(x.getDuracion()>may) {
						may = x.getDuracion();
					}
					mc.adicionar(i, x);	
				}
				for (int j = 1; j <= nc; j++) {
					Cancion x = mc.eliminar(i);
					if(x.getDuracion() == may) {
						aux.adi(x);
					}else {
						mc.adicionar(i, x);
					}
				}
			}
			mc.vaciar(i, aux);
		}
		
		
	}

	static void moverCancionCantante(Mc_Canciones mc, String nomx) {
		for (int i = 0; i <= mc.getN()-2; i++) {
			int nc = mc.nroElem(i);
			for (int j = 1; j <= nc; j++) {
				Cancion x = mc.eliminar(i);
				if(x.getCantante().equals(nomx))
					mc.adicionar(mc.getN()-1, x);
				else
					mc.adicionar(i, x);
			}
		}
	}
	
}
