import java.util.Iterator;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		Tecnologia t1 = new Tecnologia("riego por goteo", "agua directamente al cultivo");
		Tecnologia t2 = new Tecnologia("maquina cosecha", "recoleccion del grano");
		Tecnologia t3 = new Tecnologia("drones agricolas", "monitorea salud cultivo");
		LS_NormalTec lt1 = new LS_NormalTec();
		lt1.adiFinal(t1);
		lt1.adiFinal(t2);
		lt1.adiFinal(t3);
		
		Produccion p1 = new Produccion("01", 400, 4000);
		Produccion p2 = new Produccion("02", 500, 5000);
		Produccion p3 = new Produccion("03", 300, 6000);
		LS_NormalPro lp1 = new LS_NormalPro();
		lp1.adiFinal(p1);
		lp1.adiFinal(p2);
		lp1.adiFinal(p3);
		
		Tecnologia t4 = new Tecnologia("riego por goteo", "agua directamente al cultivo");
		Tecnologia t5 = new Tecnologia("maquina cosecha", "recoleccion del grano");
		Tecnologia t6 = new Tecnologia("drones agricolas", "monitorea salud cultivo");
		LS_NormalTec lt2 = new LS_NormalTec();
		lt2.adiFinal(t4);
		lt2.adiFinal(t5);
		lt2.adiFinal(t6);
		
		Produccion p4 = new Produccion("01", 400, 4000);
		Produccion p5 = new Produccion("02", 500, 5000);
		Produccion p6 = new Produccion("03", 300, 6000);
		LS_NormalPro lp2 = new LS_NormalPro();
		lp2.adiFinal(p4);
		lp2.adiFinal(p5);
		lp2.adiFinal(p6);
		
		Tecnologia t7 = new Tecnologia("riego por goteo", "agua directamente al cultivo");
		Tecnologia t8 = new Tecnologia("maquina cosecha", "recoleccion del grano");
		Tecnologia t9 = new Tecnologia("drones agricolas", "monitorea salud cultivo");
		LS_NormalTec lt4 = new LS_NormalTec();
		lt4.adiFinal(t7);
		lt4.adiFinal(t8);
		lt4.adiFinal(t9);
		
		Produccion p7 = new Produccion("01", 400, 4000);
		Produccion p8 = new Produccion("02", 500, 5000);
		Produccion p9 = new Produccion("03", 300, 6000);
		LS_NormalPro lp3 = new LS_NormalPro();
		lp3.adiFinal(p7);
		lp3.adiFinal(p8);
		lp3.adiFinal(p9);
		
		Productora pro1 = new Productora("chapare", lp1, lt1);
		Productora pro2 = new Productora("altiplano", lp2, lt2);
		LD_NormalProductora lpro1 = new LD_NormalProductora();
		lpro1.adiFinal(pro1);
		lpro1.adiFinal(pro2);
		
		Productora pro3 = new Productora("chapare", lp1, lt1);
		Productora pro4 = new Productora("altiplano", lp2, lt2);
		LD_NormalProductora lpro2 = new LD_NormalProductora();
		lpro2.adiFinal(pro3);
		lpro2.adiFinal(pro4);
		
		Departamento d1 = new Departamento("la paz", lpro1);
		Departamento d2 = new Departamento("beni", lpro2);
		
		LD_NormalDep ld1 = new LD_NormalDep();
		ld1.adiFinal(d1);
		ld1.adiFinal(d2);
		ld1.mostrar();
		
		Cultivo c1 = new Cultivo("01", "maiz", "grano seco");
		Cultivo c2 = new Cultivo("04", "repollo", "verdura");
		Cultivo c3 = new Cultivo("05", "lenteja", "legumbre");
		LS_NormalCu lc1 = new LS_NormalCu();
		lc1.adiFinal(c1);
		lc1.adiFinal(c2);
		lc1.adiFinal(c3);
		lc1.mostrar();
		String depx = "beni";
		System.out.println("a) Mostrar el nombre y tipo de cultivo que no se produce en el Departamento X");
		mostrarCultivoNoProduccidoDep(ld1,lc1,depx);
	}

	private static void mostrarCultivoNoProduccidoDep(LD_NormalDep a, LS_NormalCu b, String depx) {
		// TODO Auto-generated method stub
		NodoDep aux = buscarDep(a,depx);
		if(aux == null)
			System.out.println("no se encontro el dep");
		else {
			NodoCu R = b.getP();
			while(R != null) {
				if(!buscarCultivo(R.getCultivo().getIdCultivo(),aux.getDep().getLpro())) {
					System.out.println("los cultivos no producidos "
							+ "son: "+R.getCultivo().getNombre()+", "+R.getCultivo().getTipo());
				}
				R = R.getSig();
			}
		}
	}

	private static NodoDep buscarDep(LD_NormalDep a, String depx) {
		NodoDep R = a.getP();
		while(R != null) {
			if(R.getDep().getNomDep().equals(depx)) {
				return R;
			}R= R.getSig();
		}
		return null;
	}

	private static boolean buscarCultivo(String idCultivo, LD_NormalProductora lpro) {
		NodoProductora R = lpro.getP();
		while(R != null) {
			NodoPro S = R.getProductora().getLp().getP();
			while(S != null) {
				if(S.getProduccion().getIdcultivo().equals(idCultivo)) {
					return true;
				}
				S = S.getSig();
			}
			R = R.getSig();
		}
		return false;
	}
}