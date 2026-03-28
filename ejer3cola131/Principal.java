
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ColaSimpleSH c1 = new ColaSimpleSH();
		c1.adi(new SuperHeroe("invincible", "inserbible", 56, 10, "viltrumita"));
		c1.adi(new SuperHeroe("allen", "ciclope", 7, 70, "viltrumitaHibrido"));
		c1.adi(new SuperHeroe("opniman", "papa", 8, 100, "viltrumita"));
		c1.adi(new SuperHeroe("rex", "mujeriego", 8, 50, "tim tim"));
		c1.adi(new SuperHeroe("atomIve", "Ive", 5, 150, "tim tim"));
		c1.adi(new SuperHeroe("david", "cyberpunk", 55, 65, "independiente"));
		c1.adi(new SuperHeroe("atomIve", "Ive", 5, 150, "tim tim"));
		
		c1.mostrar();
		
		
		System.out.println();
		System.out.println("\nb) Contar cuántos superhéroes independientes"
				+ " hay en la cola.");
		contarSuperHeroeInd(c1);
		
		System.out.println("\nd) Eliminar a los superhéroes que tengan más "
				+ "de 50 cómics comprados (porque están\r\n"
				+ "acaparando todo).");
		
		eliminarSuperHeroeComic(c1);
		c1.mostrar();
	}

	private static void eliminarSuperHeroeComic(ColaSimpleSH c1) {
		// TODO Auto-generated method stub
		ColaSimpleSH aux = new ColaSimpleSH();
		while(!c1.esVacia()) {
			
			SuperHeroe x = c1.eli();
			if(x.getNroComicComp() < 50) {
				aux.adi(x);
			}
		}
		c1.vaciar(aux);
	
		
	}

	private static void contarSuperHeroeInd(ColaSimpleSH c1) {
		// TODO Auto-generated method stub
		ColaSimpleSH aux = new ColaSimpleSH();
		int cnt = 0;
		while(!c1.esVacia()) {
			SuperHeroe x = c1.eli();
			if(x.getEquipo() == "independiente") {
				cnt++;
			}
			aux.adi(x);
		}
		c1.vaciar(aux);
		System.out.println("la cantidad de SuperHeroes independientes es: " + cnt);
	}
}