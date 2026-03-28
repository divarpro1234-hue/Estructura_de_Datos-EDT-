
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaSimpleT A = new ColaSimpleT();
		A.adi(new Tarea(1));
		A.adi(new Tarea(2));
		A.adi(new Tarea(3));
		A.adi(new Tarea(4));
		A.adi(new Tarea(5));
		A.adi(new Tarea(8));
		A.adi(new Tarea(7));
		
		A.mostrar();
		
		int tiempo = A.tiempoTotal();
        System.out.println("\nTiempo total que tomará completar las tareas: " + tiempo);
	
	}
	
	
}