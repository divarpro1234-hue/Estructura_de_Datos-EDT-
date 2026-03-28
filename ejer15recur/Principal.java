
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaSimpleF A = new ColaSimpleF();
		A.adi(new Flor(1, 3));
		A.adi(new Flor(2, 2));
		A.adi(new Flor(3, 8));
		A.adi(new Flor(4, 3));
		A.adi(new Flor(5, 4));
		
		A.mostrar();
		int energiaTotal = A.energiaRecolectada();
        System.out.println("\nEnergía total recolectada por la abeja: " + energiaTotal);
	}
	
	
}