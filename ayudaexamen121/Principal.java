import java.util.Iterator;

/**
 *
 * @author CALLISAYA
 */
public class Principal {

	public static void main(String[] args) {
		
		ColaSimpleP c1 = new ColaSimpleP(); 
		ColaSimpleP c2 = new ColaSimpleP();
		ColaSimpleP c3 = new ColaSimpleP();  		
		
		Pedido t1 = new Pedido("001", "011", 3, 120);
		Pedido t2 = new Pedido("001", "011", 3, 120);
		Pedido t3 = new Pedido("001", "011", 3, 120);
		
		
		Pedido t4 = new Pedido("001", "011", 3, 120);
		Pedido t5 = new Pedido("001", "011", 3, 120);
		
		Pedido t6 = new Pedido("001", "011", 3, 120);
		Pedido t7 = new Pedido("001", "011", 3, 120);
		Pedido t8 = new Pedido("001", "011", 3, 120);
		
		c1.adi(t1);  
		c1.adi(t2); 
		c1.adi(t3);
		c2.adi(t4);  
		c2.adi(t5);
		c3.adi(t6); 
		c3.adi(t7); 
		c3.adi(t8); 
		
		Mc_Canciones A = new Mc_Canciones(4);
		A.vaciar(0, c1);
		A.vaciar(1, c2);
		A.vaciar(2, c3);
		
		A.mostrar();
		
		PilaIngrediente pi1 = new PilaIngrediente();
		
		Ingredientes i1 = new Ingredientes("zapallo", "vegetal");
		Ingredientes i2 = new Ingredientes("zanahoria", "vegetal");
		Ingredientes i3 = new Ingredientes("papa", "vegetal");
		Ingredientes i4 = new Ingredientes("lechuga", "vegetal");
		
		pi1.adicionar(i1);
		pi1.adicionar(i2);
		pi1.adicionar(i3);
		pi1.adicionar(i4);
		
		PilaIngrediente pi2 = new PilaIngrediente();
		
		Ingredientes i5 = new Ingredientes("zapallo", "vegetal");
		Ingredientes i6 = new Ingredientes("zanahoria", "vegetal");
		Ingredientes i7 = new Ingredientes("papa", "vegetal");
		Ingredientes i8 = new Ingredientes("lechuga", "vegetal");
		
		pi1.adicionar(i5);
		pi1.adicionar(i6);
		pi1.adicionar(i7);
		pi1.adicionar(i8);
		
		pi2.mostrar();
		
		PilaIngrediente pi3 = new PilaIngrediente();
		
		Ingredientes i9 = new Ingredientes("zapallo", "vegetal");
		Ingredientes i10 = new Ingredientes("zanahoria", "vegetal");
		Ingredientes i11 = new Ingredientes("papa", "vegetal");
		Ingredientes i12 = new Ingredientes("lechuga", "vegetal");
		
		pi1.adicionar(i9);
		pi1.adicionar(i10);
		pi1.adicionar(i11);
		pi1.adicionar(i12);
		
		pi3.mostrar();
		PilaIngrediente pi4 = new PilaIngrediente();

		Ingredientes i13 = new Ingredientes("zapallo", "vegetal");
		Ingredientes i14 = new Ingredientes("zanahoria", "vegetal");
		Ingredientes i15 = new Ingredientes("papa", "vegetal");
		Ingredientes i16 = new Ingredientes("lechuga", "vegetal");
		
		pi1.adicionar(i13);
		pi1.adicionar(i14);
		pi1.adicionar(i15);
		pi1.adicionar(i16);
		
		pi3.mostrar();
		
		Platillo p1 = new Platillo("002", "silpancho", pi1, 10);
		Platillo p2 = new Platillo("003", "pescado", pi2, 10);
		Platillo p3 = new Platillo("004", "pique", pi3, 10);
		Platillo p4 = new Platillo("005", "majado", pi4, 10);
		LS_NormalP B = new LS_NormalP();
		B.adiFinal(p1);
		B.adiFinal(p2);
		B.adiFinal(p3);
		B.adiFinal(p4);
		B.mostrar();
	}
}
