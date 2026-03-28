//Lic. Marcelo Aruquipa
public class Principal {

	public static void main(String[] args) {
		
        // arbol de duenios
        AB_NormalD A = new AB_NormalD();
        NodoD r = new NodoD();
        A.setRaiz(r);
        System.out.println("\narbol de duenios");
        A.crearPorDefecto();
        A.preorden(r);
        
        // arbol de mascotas
        AB_NormalM B = new AB_NormalM();
        NodoM s = new NodoM();
        B.setRaiz(s);
        System.out.println("\narbol de mascotas");
        B.crearPorDefecto();
        B.preorden(s);
        
        // b) Determinar el dueño con más mascotas.
        System.out.println("\nb) Determinar el dueño con más mascotas.");
        A.determinarDuenoConMasMascotas(A.getRaiz(), B.getRaiz());
    }
	
}
