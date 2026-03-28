//Lic Aruquipa Marcelo
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LD_NormalM A = new LD_NormalM();
		A.adiFinal(new Mascota("Max", "8234567", "76543210", 130, 5));
		A.adiFinal(new Mascota("Rocky", "9345612", "71234567", 125, 3));
		A.adiFinal(new Mascota("Bella", "7543981", "78901234", 95, 4));
		A.adiFinal(new Mascota("Luna", "8432156", "70112233", 98, 2));
		A.adiFinal(new Mascota("Toby", "9032145", "76445566", 40, 6));
		A.adiFinal(new Mascota("Princesa", "9898222", "61122354", 135, 5));
		
		A.mostrar();
		System.out.println("a) Mostrar la cantidad de perros y gatos según"
				+ " el precio que se pagó para su corte.");
		mostrarCantPerro(A);
		
		System.out.println("b) Mostrar a las mascotas que tienen una edad mayor "
				+ "a X y especificar si son perros o\r\n"
				+ "gatos.");
		int edadX = 4;
		mostrarMascotaEdad(A,edadX);
		
		System.out.println("c) Cambiar el número de celular del dueño con CI X.");
		String ciX = "9032145";
		cambiarNumCel(A,ciX);
		
		
		
	}

	private static void cambiarNumCel(LD_NormalM a, String ciX) {
		// TODO Auto-generated method stub
		NodoM R = a.getP();
		boolean sw = false; 
		while(R != null) {
			if(R.getMas().getCiDuenio().equals(ciX)) {
				sw = true;
				R.getMas().setNumCelDue("63000125");
			}
			R = R.getSig();
		}
		if(!sw) {
			System.out.println("no hay duenio con cix = " + ciX);
		}else {
			a.mostrar();
		}
	}

	private static void mostrarMascotaEdad(LD_NormalM a, int edadX) {
		// TODO Auto-generated method stub
		NodoM R = a.getP();
		while(R != null) {
			if(R.getMas().getEdad() > edadX) {
				if(R.getMas().getCostoCorte() > 100) {
					System.out.println(R.getMas().getNombre() + " es un perro");
				}else {
					System.out.println(R.getMas().getNombre() + " es un gato");
				}
			}
			R = R.getSig();
		}
		
	}

	private static void mostrarCantPerro(LD_NormalM a) {
		// TODO Auto-generated method stub
		NodoM R = a.getP();
		int cntP = cantPerro(a);
		int cntG = cantGato(a);
		System.out.println("cantidad de perros es: " + cntP);
		while(R != null) {
			
			if(R.getMas().getCostoCorte() > 100) {
				System.out.println("nombre: "+R.getMas().getNombre() + " costo corte "+R.getMas().getCostoCorte());
			}
			R = R.getSig();
		}
		R = a.getP();
		System.out.println();
		System.out.println("cantidad de gatos es: " + cntG);
		while(R != null) {
			
			if(R.getMas().getCostoCorte() < 100) {
				System.out.println("nombre: "+R.getMas().getNombre() + " costo corte "+R.getMas().getCostoCorte());
			}
			R = R.getSig();
		}
	}

	private static int cantGato(LD_NormalM a) {
		// TODO Auto-generated method stub
		NodoM R = a.getP();
		int cnt = 0;
		while(R != null) {
			if(R.getMas().getCostoCorte() < 100) {
				cnt++;
			}
			R = R.getSig();
		}
		return cnt;
	}

	private static int cantPerro(LD_NormalM a) {
		// TODO Auto-generated method stub
		NodoM R = a.getP();
		int cnt = 0;
		while(R != null) {
			if(R.getMas().getCostoCorte() > 100) {
				cnt++;
			}
			R = R.getSig();
		}
		return cnt;
	}
}













