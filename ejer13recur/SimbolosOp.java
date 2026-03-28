import java.util.Scanner;

public class SimbolosOp {
	private int numero;
	private char operacion;
	
	public SimbolosOp(int numero, char operacion) {
		this.numero = numero;
		this.operacion = operacion;
	}
	
	public SimbolosOp() {
		this.numero = 0;
		this.operacion = 0;
	}
	
//	public void leer() {
//		Scanner lee = new Scanner(System.in);
//		System.out.println("Datos persona: numerobre, edad");
//		this.numero = lee.next();
//		this.operacion = lee.next();
//		this.anio = lee.nextInt();
//		this.tipoSan = lee.next();
//		this.nivMagia = lee.nextInt();
//	}

	public void mostrar() {
		System.out.println();
		System.out.println("numero : " + this.numero);
		System.out.println("operacion: " + this.operacion);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public char getOperacion() {
		return operacion;
	}

	public void setOperacion(char operacion) {
		this.operacion = operacion;
	}

}
