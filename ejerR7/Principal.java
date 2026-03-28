import java.util.Iterator;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		

		LS_NormalE A = new LS_NormalE();
		A.adiFinal(new Estudiante("1", "joel", "doctor","cardiologo"));
		A.adiFinal(new Estudiante("2", "eren", "doctor","traumatologo"));
		A.adiFinal(new Estudiante("3", "elias", "doctor","fisioterapia"));
		A.adiFinal(new Estudiante("4", "daniel", "doctor","pediatra"));
		System.out.println("datos de la lista");
		A.mostrar();
		
		//c)
		
	}


	
}