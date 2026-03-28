

public class Principal {
	public static void main(String[] args) {
		
		ColaCircularCar car1 = new ColaCircularCar();
		
		car1.adi('a');
		car1.adi('u');
		car1.adi('x');
		car1.adi('i');
		
		ColaCircularCar car2 = new ColaCircularCar();
		
		car2.adi('l');
		car2.adi('u');
		car2.adi('c');
		car2.adi('h');
		car2.adi('o');
		
		ColaCircularCar car3 = new ColaCircularCar();
		
		car3.adi('t');
		car3.adi('h');
		car3.adi('a');
		car3.adi('n');
		
		ColaCircularCar car4 = new ColaCircularCar();
		
		car4.adi('k');
		car4.adi('s');
		car4.adi('.');
		car4.adi('*');
		
		//multicola simple de objetos estudiante
		Mp_ColaCircularCar z = new Mp_ColaCircularCar(4);
		System.out.println("\tMultiColaCircular de caracteres:");
		z.vaciar(0, car1);
		z.vaciar(1, car2);
		z.vaciar(2, car3);
		z.vaciar(3, car4);
		z.mostrar();
	}
}
