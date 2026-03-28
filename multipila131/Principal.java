public class Principal {
	public static void main(String[] args) {
		
		PilaCar car1 = new PilaCar();
		car1.adi('d');
		car1.adi('i');
		car1.adi('v');
		car1.adi('i');
		
		PilaCar car2 = new PilaCar();
		car2.adi('m');
		car2.adi('e');
		car2.adi('m');
		car2.adi('o');

		PilaCar car3 = new PilaCar();
		car3.adi('j');
		car3.adi('o');
		car3.adi('e');
		car3.adi('l');
		
		PilaCar car4 = new PilaCar();
		car4.adi('p');
		car4.adi('a');
		car4.adi('t');
		car4.adi('o');
		
		PilaCar car5 = new PilaCar();
		car5.adi('b');
		car5.adi('e');
		car5.adi('t');
		car5.adi('a');
		

		Mp_PilaCar b = new Mp_PilaCar(5);
		System.out.println("\tMultipila de caracteres:");
		b.vaciar(0, car1);
		b.vaciar(1, car2);
		b.vaciar(2, car3);
		b.vaciar(3, car4);
		b.vaciar(4, car5);
		//mostrar datos de la multipila
		b.mostrar();
	}
}
