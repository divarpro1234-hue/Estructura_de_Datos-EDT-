
public class Principal {

	public static void main(String[] args) {
	
		PilaRio A = new PilaRio();
		Rio r1 = new Rio("mamore", "achocalla", 4, 3);
		Rio r2 = new Rio("beni", "achocalla", 4, 3);
		Rio r3 = new Rio("nilo", "palca", 4, 3);
		Rio r4 = new Rio("mamore", "achocalla", 4, 3);
		Rio r5 = new Rio("itenez", "yungas", 4, 3);
		Rio r6 = new Rio("pilcomayo", "achocalla", 4, 3);
		Rio r7 = new Rio("desaguadero", "chasquipampa", 4, 3);
		Rio r8 = new Rio("nilo", "apolo", 4, 3);		
		A.adi(r1);
		A.adi(r2);
		A.adi(r3);
		A.adi(r4);
		A.adi(r5);
		A.adi(r6);
		A.adi(r7);
		A.adi(r8);
		
		A.mostrar();
		System.out.println("\na) Verificar si el municipio de \"Palca\" tiene al "
				+ "menos un río registrado.");
		String municipiox = "palca";
		if(verificarMunicipioRioRegistrado(A, municipiox)) {
			System.out.println("encontrado");
		}else {
			System.out.println("no encontrado");
		}
		
		System.out.println("\nb) Verificar si existe al menos un río que "
				+ "atraviesa más de un municipio.");
		if(verificarRioAtraviesaMasDeUnMunicipio(A)) {
			System.out.println("si existe");
		}else {
			System.out.println("no existe");
		}
	
		System.out.println();
		
		System.out.println("\nc) Listar los ríos desbordados:");
		listarRiosDesbordados(A);

		System.out.println("\nd) Río con mayor diferencia de altura:");
		Rio rioMayorDif = rioConMayorDiferencia(A);
		if (rioMayorDif != null) {
		    System.out.println("nombre: " + rioMayorDif.getNombre());
		    System.out.println("municipio: " + rioMayorDif.getMunicipio());
		    System.out.println("altura actual: " + rioMayorDif.getAlturanActual() + " metros");
		    System.out.println("altura normal: " + rioMayorDif.getAlturanNormal() + " metros");
		}
	}

	public static boolean verificarMunicipioRioRegistrado(PilaRio p, String municipio) {
	    if (p.esVacia()) return false;

	    Rio r = p.eli();
	    boolean encontrado = r.getMunicipio().equalsIgnoreCase(municipio) || verificarMunicipioRioRegistrado(p, municipio);
	    p.adi(r);
	    return encontrado;
	}
	
	public static boolean verificarRioAtraviesaMasDeUnMunicipio(PilaRio p) {
	    if (p.esVacia()) return false;

	    Rio r = p.eli();
	    boolean existe = buscarNombreEnMunicipiosRec(p, r.getNombre(), r.getMunicipio()) || verificarRioAtraviesaMasDeUnMunicipio(p);
	    p.adi(r);
	    return existe;
	}

	private static boolean buscarNombreEnMunicipiosRec(PilaRio p, String nombre, String municipioOriginal) {
	    if (p.esVacia()) return false;

	    Rio r = p.eli();
	    boolean encontrado = (r.getNombre().equalsIgnoreCase(nombre) &&
	                         !r.getMunicipio().equalsIgnoreCase(municipioOriginal)) ||
	                         buscarNombreEnMunicipiosRec(p, nombre, municipioOriginal);
	    p.adi(r);
	    return encontrado;
	}

	
	public static void listarRiosDesbordados(PilaRio p) {
	    if (p.esVacia()) return;

	    Rio r = p.eli();
	    if (r.getAlturanActual() > r.getAlturanNormal()) {
	        System.out.println("nombre: " + r.getNombre());
	        System.out.println("municipio: " + r.getMunicipio());
	        System.out.println("altura actual: " + r.getAlturanActual() + " metros");
	        System.out.println("altura normal: " + r.getAlturanNormal() + " metros\n");
	    }
	    listarRiosDesbordados(p);
	    p.adi(r);
	}

	
	public static Rio rioConMayorDiferencia(PilaRio p) {
	    if (p.esVacia()) return null;

	    Rio r = p.eli();
	    Rio mayor = rioConMayorDiferencia(p);
	    p.adi(r);

	    if (mayor == null) return r;

	    int diffR = Math.abs(r.getAlturanActual() - r.getAlturanNormal());
	    int diffMayor = Math.abs(mayor.getAlturanActual() - mayor.getAlturanNormal());

	    return (diffR > diffMayor) ? r : mayor;
	}

}
