//Lic. Marcelo Aruquipa
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB_BusquedaL z = new AB_BusquedaL();
		NodoL r = new NodoL();
		z.setRaiz(r);
		z.crear(z.getRaiz());
		z.preorden(r);
		
		System.out.println("\na) Verifica si existe el libro de título x, si existe, muéstralo.");
		z.verificarLibroExiste(r, "propuesta");
		
		System.out.println("\nb) Mostrar el titulo todos los libros con más de 5 ejemplares disponibles.");
		z.mostrarLibro(r);
	
		System.out.println("c) Encontrar el libro con menos ejemplares");
		
		z.menorEjem();
	}
	
}
