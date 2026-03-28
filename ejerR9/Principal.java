import java.util.Iterator;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		

		LS_NormalH A = new LS_NormalH();
		A.adiFinal(new Hogar(2, "ceja", "saul","002"));
		A.adiFinal(new Hogar(3, "vita", "will","003"));
		A.adiFinal(new Hogar(1, "irpavi", "daniel","004"));
		A.adiFinal(new Hogar(4, "miraflores", "kevin","005"));
		A.adiFinal(new Hogar(5, "senkata", "fernando","006"));
		
		System.out.println("datos de la lista");
		A.mostrar();
		

		LS_NormalM M = new LS_NormalM();
		M.adiFinal(new Mascotas("rufo", "15", "macho","gato", "002"));
		M.adiFinal(new Mascotas("tony", "17", "macho","sapo", "003"));
		M.adiFinal(new Mascotas("cap", "10", "hembra","perro", "004"));
		M.adiFinal(new Mascotas("fer", "5", "hembra","lagarto", "005"));
		M.adiFinal(new Mascotas("rex", "6", "macho","caiman", "006"));
		
		System.out.println("datos de la lista");
		M.mostrar();
		
		System.out.println("b) Del propietario X mostrar las macotas que tiene");
		String idPropx = "003";
        System.out.println("\nMascotas del propietario con código '" + idPropx + "':");
        mostrarMascotasPropX(M.getP(), idPropx);
	}


	public static void mostrarMascotasPropX(NodoM R, String idPropx) {
        if (R == null) {
            return;
        }
        Mascotas x = R.getMascota();
        if (x.getidProp().equals(idPropx)) {
            x.mostrar();
        }
        mostrarMascotasPropX(R.getSig(), idPropx);
    }
}