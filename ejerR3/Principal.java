import java.util.Iterator;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		

		LS_NormalP A = new LS_NormalP();
		A.adiFinal(new Paciente("1", "joel", "doctor","cardiologo"));
		A.adiFinal(new Paciente("2", "eren", "doctor","traumatologo"));
		A.adiFinal(new Paciente("3", "elias", "doctor","fisioterapia"));
		A.adiFinal(new Paciente("4", "daniel", "doctor","pediatra"));
		System.out.println("datos de la lista");
		A.mostrar();
		
		LS_NormalE E = new LS_NormalE();
		E.adiFinal(new Especialidad("cardiologo", "diego"));
		E.adiFinal(new Especialidad("traumatologo", "lucho"));
		E.adiFinal(new Especialidad("fisioterapia", "fernando"));
		E.adiFinal(new Especialidad("pediatra", "daniel"));
		
		System.out.println("\ndatos de la lista especialidad");
		E.mostrar();
		
		String espx = "cardiologo";
		boolean sw = verificarSinPacientes(A, espx);

	    if (sw) {
	    	System.out.println("\nLa especialidad " + espx + " no tiene pacientes en espera.");
	    } else {
	        System.out.println("\nLa especialidad " + espx + " tiene pacientes en espera.");
	    }
	}

    public static boolean verificarSinPacientes(LS_NormalP lp, String espx) {
        return verificarSinPacientesAux(lp.getP(), espx);
    }
    private static boolean verificarSinPacientesAux(NodoP nodo, String especialidad) {
        if (nodo == null) {
            return true;
        }
        if (nodo.getPaciente().getEspecialidadPaciente().equals(especialidad)) {   
            return false;
        }
        return verificarSinPacientesAux(nodo.getSig(), especialidad);
    }
     
}