
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ColaSimpleCar c1 = new ColaSimpleCar();
		
		c1.adi('a');
		c1.adi('s');
		c1.adi('d');
		c1.adi('e');
		c1.adi('e');
		
		ColaSimpleCar c2 = new ColaSimpleCar();
		
		c2.adi('m');
		c2.adi('e');
		c2.adi('m');
		c2.adi('o');
		
		ColaSimpleCar c3 = new ColaSimpleCar();
		
		c3.adi('j');
		c3.adi('h');
		
		ColaSimpleCar c4 = new ColaSimpleCar();
		
		c4.adi('j');
		c4.adi('e');
		System.out.println("\tMultiColaSimple de caracteres:");		
		Mp_ColaSimpleCar a = new Mp_ColaSimpleCar(4);
		a.vaciar(0, c1);
		a.vaciar(1, c2);
		a.vaciar(2, c3);
		a.vaciar(3, c4);
		
		a.mostrar();
		
	}
	
	
}