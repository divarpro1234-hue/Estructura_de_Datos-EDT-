//Lic. Marcelo Aruquipa
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB_Normal z = new AB_Normal();
		Nodo r = new Nodo();
		//z.setRaiz(r);
		//z.crear(z.getRaiz());
		z.crearPorDefecto();
		System.out.println("Árbol");
		z.inorden(z.getRaiz());

		int nivelX = 3;
		System.out.println("\nArbol podado desde el nivel " + nivelX);
		z.podarDesdeNivelX(nivelX);
		z.inorden(z.getRaiz());

	}
}
