//Lic. Marcelo Aruquipa
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB_NormalL z = new AB_NormalL();
		NodoL r = new NodoL();
		z.setRaiz(r);
		z.crear(z.getRaiz());
		
		System.out.println("\na) Verifica si hay libros del autor X");
		
		if(z.verificarLibroAutor(r, "carlos")) {
			System.out.println("si existe");
		}else {
			System.out.println("no existe");
		}
		
		System.out.println("\nb) Muestra los libros del autor X.");
		z.mostrarLibroAutorX(r, "carlos");
		
		System.out.println("\nc) Cuenta cuantos libros tiene el autor X.\r\n"
				+ "");
		
		System.out.println(z.contarLibrosAutor(r, "carlos"));
		
	}
	
}
