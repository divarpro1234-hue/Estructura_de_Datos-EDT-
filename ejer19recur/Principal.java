
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
		verificarMunicipioRioRegistrado(A, municipiox);
		
		System.out.println("\nb) Verificar si existe al menos un río que "
				+ "atraviesa más de un municipio.");
		if(verificarRioAtraviesaMasDeUnMunicipio(A)) {
			System.out.println("si existe");
		}else {
			System.out.println("no existe");
		}
	
		
		System.out.println();
		
		
	}

	private static boolean verificarRioAtraviesaMasDeUnMunicipio(PilaRio a) {
		// TODO Auto-generated method stub
		PilaRio aux = new PilaRio();
		PilaRio aux2 = new PilaRio();
		while(!a.esVacia()) {
			Rio x = a.eli();
			while(!a.esVacia()) {
				Rio z = a.eli();
				if(x.getNombre().equalsIgnoreCase(z.getNombre())) {
					aux.adi(z);
					aux.adi(x);
					a.vaciar(aux);
					return true;
				}
				aux.adi(z);
			}
			aux2.adi(x);
		}
		a.vaciar(aux);
		a.vaciar(aux2);
		return false;
	}

	private static void verificarMunicipioRioRegistrado(PilaRio a, String municipiox) {
		// TODO Auto-generated method stub
		PilaRio aux = new PilaRio();
		boolean sw = true;
		while(!a.esVacia()) {
			Rio x = a.eli();
			if(x.getMunicipio().equalsIgnoreCase(municipiox)) {
				sw = false;
				aux.adi(x);
			}else
				aux.adi(x);
		}
		a.vaciar(aux);
		if(!sw) {
			System.out.println("el municipio "+ municipiox+" tiene al menos un rio registrado");
		}else
			System.out.println("el municipio "+ municipiox+" no tiene un rio registrado");
	}
}
