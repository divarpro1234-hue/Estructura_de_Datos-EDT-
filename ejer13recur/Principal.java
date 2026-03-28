
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		LD_CircularS A = new LD_CircularS();
		A.adiFinal(new SimbolosOp(2, '+'));
		A.adiFinal(new SimbolosOp(2, '/'));
		A.adiFinal(new SimbolosOp(2, '-'));
		A.adiFinal(new SimbolosOp(2, '*'));
		A.adiFinal(new SimbolosOp(2, '\0'));
		
		A.mostrar();
		
		System.out.println("Resultado: " + A.evaluar());
	}

}