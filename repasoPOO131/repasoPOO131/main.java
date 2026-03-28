package repasoPOO131;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de votantes: ");
        int n = sc.nextInt();
        sc.nextLine();

        ListaVoto z = new ListaVoto(n);
        z.leer();
        z.mostrar();
        System.out.println("\ncandidato que gano en la ciudad x");
        z.cadidatoGanador("oruro");
        System.out.println("\ntotal de votos para el i-esimo ganador: " +z.totalVotos(3));
    }

}
