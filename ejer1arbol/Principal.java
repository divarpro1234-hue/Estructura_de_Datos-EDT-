//Lic. Marcelo Aruquipa
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB_Normal z = new AB_Normal();
		Nodo r = new Nodo();
		z.setRaiz(r);
		z.crear(z.getRaiz());
		
		System.out.println("\nmostrar en preorden");
		z.preorden(z.getRaiz());
		
		System.out.println("\nmostrar en inorden");
		z.inorden(z.getRaiz());
		
		System.out.println("\nmostrar en postorden");
		z.postOrden(z.getRaiz());
		
		System.out.println("numero hojas");
		System.out.println(z.contarHojas(r));
		
		
	}
	
}
