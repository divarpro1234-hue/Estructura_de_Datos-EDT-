
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ColaSimpleC c1 = new ColaSimpleC();
		ColaSimpleC c2 = new ColaSimpleC();
		ColaSimpleC c3 = new ColaSimpleC();
		ColaSimpleC c4 = new ColaSimpleC();
		
		Canciones t1 = new Canciones("Hotel C", "roqck", "Eagles", 3);
		Canciones t2 = new Canciones("Hotel C", "roqck", "eagles", 5);
		Canciones t3 = new Canciones("Hotel C", "roqck", "eagles", 3);
		
		Canciones t4 = new Canciones("thriller", "roqck", "eagles", 3);
		Canciones t5 = new Canciones("Hotel C", "roqck", "eagles", 3);
		
		Canciones t6 = new Canciones("Hotel C", "roqck", "Eagles", 3);
		Canciones t7 = new Canciones("thriller", "roqck", "Eagles", 3);
		Canciones t8 = new Canciones("Hotel C", "roqck", "Eagles", 3);
		Canciones t9 = new Canciones("Hotel C", "roqck", "Eagles", 3);
		
		Canciones t10 = new Canciones("california", "roqck", "eagles", 3);
		
		
		c1.adi(t1); c1.adi(t2); c1.adi(t3);
		c2.adi(t4); c2.adi(t5);
		c3.adi(t6); c3.adi(t7); c3.adi(t8); c3.adi(t9);
		c4.adi(t10);
		
		
		Mp_ColaSimpleCanciones a = new Mp_ColaSimpleCanciones(4);
		a.vaciar(0, c1);
		a.vaciar(1, c2);
		a.vaciar(2, c3);
		a.vaciar(3, c4);
		
		a.mostrar();
		
		System.out.println("mover canciones");
		moverCancioneCantante(a, "Eagles");
		a.mostrar();
	}

	private static void moverCancioneCantante(Mp_ColaSimpleCanciones a, String nomx) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.getN(); i++) {
			int nc = a.nroElem(i);
			for (int j = 0; j < nc; j++) {
				Canciones x = a.eliminar(i);
				if(x.getCantante() == nomx)
					a.adicionar(a.getN()-1,x);
				else
					a.adicionar(i,x);
			}
		}
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ColaSimpleC a = new ColaSimpleC();
		
//		Estudiante a1 = new Estudiante("marca", "info");
//		a.adi(a1);
		
//		ColaSimpleC b = new ColaSimpleC();
		
//		Estudiante b1 = new Estudiante("sonia", "info");
//		Estudiante b2 = new Estudiante("lucia", "fis");
//		Estudiante b3 = new Estudiante("juan", "info");
//		Estudiante b4 = new Estudiante("marco", "est");
//		b.adi(b1);
//		b.adi(b2);
//		b.adi(b3);
//		b.adi(b4);
		
//		ColaSimpleC c =  new ColaSimpleC();
		
//		Estudiante c1 = new Estudiante("juan", "info");
//		Estudiante c2 = new Estudiante("rodrigo", "info");
//		Estudiante c3 = new Estudiante("ana", "info");
		
//		c.adi(c1);
//		c.adi(c2);
//		c.adi(c3);
		
/*		ColaSimpleC d = new ColaSimpleC();
		
		Estudiante d1 = new Estudiante("diego", "info");
		d.adi(d1);
		
		
		ColaSimpleC e = new ColaSimpleC();
		Estudiante e1 = new Estudiante("ruben", "info");
		Estudiante e2 = new Estudiante("alvaro", "est");
		
		e.adi(e1);
		e.adi(e2);
		
		//multicola simple de objetos estudiante
		Mp_ColaSimpleEstudiante z = new Mp_ColaSimpleEstudiante(5);
		System.out.println("\tMulticola simple de objetos estudiante:");
		z.vaciar(0, a);
		z.vaciar(1, b);
		z.vaciar(2, c);
		z.vaciar(3, d);
		z.vaciar(4, e);
		z.mostrar();
		
	}
*/
}