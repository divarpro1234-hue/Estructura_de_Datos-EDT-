//Lic. Marcelo Aruquipa
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB_Normal z = new AB_Normal();
		Nodo r = new Nodo();
		z.setRaiz(r);
		z.crear(z.getRaiz());
		
		System.out.println("a) Mostrar todas las hojas del árbol.");
		z.mostrarHojas(r);
		
		System.out.println("b) Verificar si hay la letra X dentro del árbol");
		if(z.verificarLetraX(r, "j")) {
			System.out.println("si existe");
		}else {
			System.out.println("no existe");
		}
		
		System.out.println("c) Contar cuantas “F” hay en el árbol. ");
		System.out.println(z.contarCuantasF(r, "f"));
	}
	
}
