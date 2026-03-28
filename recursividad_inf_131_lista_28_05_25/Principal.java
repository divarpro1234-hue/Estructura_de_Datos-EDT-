
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		LS_NormalM A = new LS_NormalM();
		A.adiFinal(new Mensaje("61174521", "reunion equipo", "2025/06/03", "10:00", "no olvidar reunion"));
		A.adiFinal(new Mensaje("68850000", "reunion trabajo", "2025/06/04", "12:00", "no olvidar reunion"));
		A.adiFinal(new Mensaje("68117421", "ninguno", "2025/07/04", "09:00", "no olvidar reunion"));
		A.adiFinal(new Mensaje("71519727", "cita medica", "2025/06/09", "13:00", "no olvidar reunion"));
		A.adiFinal(new Mensaje("68117421", "evento academico", "2025/07/04", "08:00", "no olvidar reunion"));
		A.adiFinal(new Mensaje("69115423", "ninguno", "2025/07/01", "09:00", "no olvidar reunion"));
		
		System.out.println("\n\t----datos de la lista---");
		System.out.println("\nmostrar datos de manera iterativa");
		mostrarIterativa(A);
		System.out.println();
		System.out.println("\nb) Mostrar los mensajes recibidos con asunto “ninguno”");
		mostrarMensajeRecibido(A.getP());
		
		System.out.println("\nc) Cuantos mensajes se recibieron en la fecha X del #celular Y");
		String fechax = "2025/07/04";
		String cely = "68117421";
		System.out.println("son: "+cuantosMensajesRecibieronFechaXCelY(A.getP(),fechax,cely));
		
		System.out.println("\nd) Verificar si se recibió algún mensaje del #celular X");
		String celx = "68117421";
		if(verificarMensajeCel(A.getP(),celx)) {
			System.out.println("si se recibio mensaje");
		}else {
			System.out.println("no se recibio mensaje");
		}
	}

	private static boolean verificarMensajeCel(NodoM R, String celx) {
		// TODO Auto-generated method stub
		if(R != null) {
			Mensaje x = R.getMensaje();
			if(x.getNumCel().equals(celx)) {
				return true;
			}else {
				return verificarMensajeCel(R.getSig(), celx);
			}
		}else{
			return false;
		}
	}

	private static int cuantosMensajesRecibieronFechaXCelY(NodoM R, String fechax, String cely) {
		// TODO Auto-generated method stub
		if(R != null) {
			Mensaje x = R.getMensaje();
			int c = cuantosMensajesRecibieronFechaXCelY(R.getSig(), fechax, cely);
			if(x.getFecha().equals(fechax) && x.getNumCel().equals(cely)) {
				return c+1;
			}else {
				return c;
			}
		}else {
			return 0;
		}
	}

	private static void mostrarMensajeRecibido(NodoM R) {
		// TODO Auto-generated method stub
		if(R != null) {
			Mensaje x = R.getMensaje();
			if(x.getAsunto().equals("ninguno")) {
				x.mostrar();
				mostrarMensajeRecibido(R.getSig());
			}else {
				mostrarMensajeRecibido(R.getSig());
			}
		}
	}

	private static void mostrarIterativa(LS_NormalM a) {
		// TODO Auto-generated method stub
		NodoM R = a.getP();
		while(R != null) {
			R.getMensaje().mostrar();
			R = R.getSig();
		}
	}

	
}