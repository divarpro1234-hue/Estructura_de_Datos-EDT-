//Lic Aruquipa Marcelo
import java.util.Date;
public class Principal {

	public static void main(String[] args) {
		
		//LISTA NORMAL integrante 1 
		Integrantes i1 = new Integrantes("juan","61145611");
		Integrantes i2 = new Integrantes("marco","68040521");
		Integrantes i3 = new Integrantes("ana","75588952");
		Integrantes i4 = new Integrantes("fredy","71519727");
		Integrantes i5 = new Integrantes("elba","75588952");
		Integrantes i6 = new Integrantes("pepe","71519727");
		
		LS_NormalInt linteg1 = new LS_NormalInt();
		linteg1.adiFinal(i1);
		linteg1.adiFinal(i2);
		linteg1.adiFinal(i3);
		linteg1.adiFinal(i4);
		linteg1.adiFinal(i5);
		linteg1.adiFinal(i6);
		
		//LISTA NORMAL integrante 3
		Integrantes i7 = new Integrantes("eren","69874611");
		Integrantes i8 = new Integrantes("arion","71230521");
		Integrantes i9 = new Integrantes("carlos","69938952");
		Integrantes i10 = new Integrantes("jhamil","70029727");
		Integrantes i11= new Integrantes("victor","74418952");
		Integrantes i12 = new Integrantes("axel","76119727");
		LS_NormalInt linteg2 = new LS_NormalInt();
		linteg2.adiFinal(i7);
		linteg2.adiFinal(i8);
		linteg2.adiFinal(i9);
		linteg2.adiFinal(i10);
		linteg2.adiFinal(i11);
		linteg2.adiFinal(i12);
		
		
		//LISTA NORMAL integrante 3
		Integrantes i13 = new Integrantes("hector","69996611");
		Integrantes i14 = new Integrantes("danna","71234521");
		Integrantes i15 = new Integrantes("diego","69874952");
		Integrantes i16 = new Integrantes("edwin","76175327");
		Integrantes i17 = new Integrantes("lian","76333952");
		Integrantes i18 = new Integrantes("arnold","70009727");
		LS_NormalInt linteg3 = new LS_NormalInt();
		linteg3.adiFinal(i13);
		linteg3.adiFinal(i14);
		linteg3.adiFinal(i15);
		linteg3.adiFinal(i16);
		linteg3.adiFinal(i17);
		linteg3.adiFinal(i18);
		
		//LISTA NORMAL admin 1
		Admin a1 = new Admin("marco","70552856");
		Admin a2 = new Admin("mario","68116117");
		Admin a3 = new Admin("fernando","77110116");
		LS_NormalAdmin ladm1 = new LS_NormalAdmin();
		ladm1.adiFinal(a1);
		ladm1.adiFinal(a2);
		ladm1.adiFinal(a3);
		
		//LISTA NORMAL admin 2
		Admin a4 = new Admin("fercho","74453856");
		Admin a5 = new Admin("joel","61177151");
		Admin a6 = new Admin("lucho","79727116");
		LS_NormalAdmin ladm2 = new LS_NormalAdmin();
		ladm2.adiFinal(a1);
		ladm2.adiFinal(a2);
		ladm2.adiFinal(a3);
		
		//LISTA NORMAL admin 3
		
		Admin a7 = new Admin("ever","71516117");
		Admin a8 = new Admin("juan","68972711");
		LS_NormalAdmin ladm3 = new LS_NormalAdmin();
		ladm3.adiFinal(a7);
		ladm3.adiFinal(a8);

		//GRUPOS 
		
		Grupo g1 = new Grupo("grupo java", "05/03/2021", ladm1, linteg1);
		Grupo g2 = new Grupo("grupo python", "15/06/2022", ladm2, linteg2);
		Grupo g3 = new Grupo("grupo c++", "26/12/2024", ladm3, linteg3);
		
		
		
		LS_NormalGrupo lg = new LS_NormalGrupo();
		lg.adiFinal(g1);
		lg.adiFinal(g2);
		lg.adiFinal(g3);
		
		//b)
		String nomGrupox = "grupo java";
		System.out.println("\na) Agregar un nuevo integrante al grupo de bombre: " + nomGrupox);
		agregarNuevoIntegrante(lg, nomGrupox);
		//a)
		String nrox = "69874611";
		System.out.println("\nb) Volver administrador al nro de celx de todos los grupos");
		volverContactoAdmin(lg, nrox);
		
	}

	private static void volverContactoAdmin(LS_NormalGrupo lg, String nrox) {
		// TODO Auto-generated method stub
		NodoGrupo R = lg.getP();
		while(R != null) {
			LS_NormalInt z = R.getGrupo().getLinteg();
			LS_NormalAdmin y = R.getGrupo().getLadm();
			NodoInt S = z.getP();
			while(S != null) {
				if(S.getInteg().getNroCel().equals(nrox)) {
					Integrantes x = S.getInteg();
					Admin ad = new Admin(S.getInteg().getNombre(), S.getInteg().getNroCel());
					y.adiFinal(ad);
					lg.mostrar();
					System.out.println("\nEL INTEGRANTE A ADMIN: "+ ad.getNombre());
					System.out.println("CON EL NUMERO DE CELULAR: "+ ad.getNroCel());
					System.out.println("EN EL GRUPO DE NOMBRE: " + R.getGrupo().getNombre());

				}
				S = S.getSig();
			}
			R = R.getSig();
		}
	}

	private static void agregarNuevoIntegrante(LS_NormalGrupo lg, String nomGrupox) {
		
		NodoGrupo R = lg.getP();
		while(R != null) {
			
			if(R.getGrupo().getNombre().equals(nomGrupox)) {
				LS_NormalInt z = R.getGrupo().getLinteg();
				Integrantes a = new Integrantes("kevin", "68555112");
				z.adiFinal(a);
				lg.mostrar();
				System.out.println("\nEL INTEGRANTE AÑADIDO ES: "+ a.getNombre());
				System.out.println("CON EL NUMERO DE CELULAR: "+ a.getNroCel());
				System.out.println("EN EL GRUPO DE NOMBRE: " + nomGrupox);

			}
			R = R.getSig();
		}
	}

}













