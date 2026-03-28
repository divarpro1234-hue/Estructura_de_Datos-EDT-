//Lic Aruquipa Marcelo
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//lista persona
		
		LS_CircularJu A = new LS_CircularJu();
		
		A.adiFinal(new Jugador("juan", 15, 5));
		A.adiFinal(new Jugador("alan", 19, 6));
		A.adiFinal(new Jugador("pepe", 20, 7));
		A.adiFinal(new Jugador("gabriel", 18, 8));
		A.adiFinal(new Jugador("saul", 16, 7));
		A.adiFinal(new Jugador("fercho", 19, 8));
		
		A.mostrar();
		
		LD_NormalP B = new LD_NormalP();
		
		B.adiFinal(new Partida("julio", "pedroo", "ganador"));
		B.adiFinal(new Partida("pepe", "gabriel", "perdedor"));
		B.adiFinal(new Partida("saul", "fercho", "ganador"));
		
		B.mostrar();
		
		System.out.println("\na) Un torneo similar ha sido cancelado. Dada su Lista"
				+ " de Jugadores y Lista de Partidas,\r\n"
				+ "fusionar los datos en el torneo actual.\r\n"
				+ "");
		
		fusionarTabla(A,B);
		A.mostrar();
		
		System.out.println("\nb) Mostrar el jugador con el nivel más alto y todas sus partidas");
		mostrarJugador(A,B);
	}

	private static void mostrarJugador(LS_CircularJu a, LD_NormalP b) {
		// TODO Auto-generated method stub
		NodoJu R = a.getP();
		int may = 0;
		do {
		
			
			if(R.getJug().getNivel() > may) {
				may = R.getJug().getNivel();
			}
			R = R.getSig();
			
		} while (R != a.getP());
		
		R = a.getP();
		do {
			if(R.getJug().getNivel() == may) {
				R.getJug().mostrar();
				NodoP S = b.getP();
				while(S != null) {
					if(S.getPart().getJugador1().equals(R.getJug().getNom()) || S.getPart().getJugador2().equals(R.getJug().getNom())) {
						S.getPart().mostrar();
					}
					S = S.getSig();
				}
			}
			R = R.getSig();
		}while(R != a.getP());
	}

	private static void fusionarTabla(LS_CircularJu a, LD_NormalP b) {
	    NodoP R = b.getP();
	    Scanner lee = new Scanner(System.in);
	    
	    while (R != null) {
	        Partida x = R.getPart();
	        if (!existeJugador(a, x.getJugador1())) {
	            System.out.println("Jugador '" + x.getJugador1() + "' no existe. Ingrese sus datos:");
	            System.out.println("Edad: ");
	            int edad = lee.nextInt();
	            System.out.println("Nivel: ");
	            int nivel = lee.nextInt();
	            Jugador nuevo1 = new Jugador(x.getJugador1(), edad, nivel);
	            a.adiFinal(nuevo1);
	        }
	        if (!existeJugador(a, x.getJugador2())) {
	            System.out.println("Jugador '" + x.getJugador2() + "' no existe. Ingrese sus datos:");
	            System.out.println("Edad: ");
	            int edad = lee.nextInt();
	            System.out.println("Nivel: ");
	            int nivel = lee.nextInt();
	            Jugador nuevo2 = new Jugador(x.getJugador2(), edad, nivel);
	            a.adiFinal(nuevo2);
	        }

	        R = R.getSig();
	    }
	}
	private static boolean existeJugador(LS_CircularJu a, String nombre) {
	    NodoJu R = a.getP();
	    NodoJu S = R;
	    do {
	        if (R.getJug().getNom().equals(nombre)) {
	            return true;
	        }
	        R = R.getSig();
	    } while (R != S);

	    return false;
	}
}













