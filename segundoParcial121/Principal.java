//Lic Aruquipa Marcelo
public class Principal {

	public static void main(String[] args) {
		Duenio d1 = new Duenio("juan", 2);
		Duenio d2 = new Duenio("Sam", 1);
		Duenio d3 = new Duenio("rosa", 3);
		
		LD_NormalD ld1 = new LD_NormalD();
		ld1.adiFinal(d1);
		ld1.adiFinal(d2);
		ld1.adiFinal(d3);
		System.out.println("datos lista Duenio");
		System.out.println();
		ld1.mostrar();
	
		Mascota m1 = new Mascota("j1", "j1", 1);
		Mascota m2 = new Mascota("j2", "j2", 2);
		Mascota m3 = new Mascota("s1", "s1", 1);
		Mascota m4 = new Mascota("r1", "r1", 1);
		Mascota m5 = new Mascota("r2", "r2", 2);
		Mascota m6 = new Mascota("r3", "r3", 3);
		
		LD_NormalM lm1 = new LD_NormalM();
		lm1.adiFinal(m1);
		lm1.adiFinal(m2);
		lm1.adiFinal(m3);
		lm1.adiFinal(m4);
		lm1.adiFinal(m5);
		lm1.adiFinal(m6);
		System.out.println("datos lista Mascota");
		System.out.println();
		lm1.mostrar();
		System.out.println("mostrar las mascotar y el nombre "
				+ "de los duenios que tienen mas de  una mascota");
		mostrarMascotaYNombreDuenioMayMascota(ld1,lm1);
	
	}

	private static void mostrarMascotaYNombreDuenioMayMascota(LD_NormalD ld1, LD_NormalM lm1) {
		NodoD R = ld1.getP();
		while(R != null) {
			int y = R.getDuenio().getNroMascota();
			if(y > 1 ) {
				NodoM S = lm1.getP();
				int x = R.getDuenio().getNroMascota();
				for (int i = 0; i < x; i++) {
					S.getMascota().mostrar();
					S = S.getSig();
				}
			}
			R = R.getSig();
		}
	}

}













