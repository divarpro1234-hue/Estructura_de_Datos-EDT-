//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Numero {
	private String numero;
	
	public Numero(String numero) {
		this.numero = numero;
	}
	public Numero() {
		this.numero = "";
	}
	public void mostrar() {
		System.out.println("numero: " + this.numero);
		System.out.println();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.numero = lee.next();
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}