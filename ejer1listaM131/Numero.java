import java.util.Scanner;

public class Numero {
	private String numero;
	
	public Numero(String numero) {
		this.numero = numero;
	}
	
	public Numero() {
		this.numero = "";
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos persona: numerobre, edad");
		this.numero = lee.next();
	}

	public void mostrar() {
		System.out.println();
		System.out.println("numero : " + this.numero);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
