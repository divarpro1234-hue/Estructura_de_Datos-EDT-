//Lic. Marcelo Aruquipa
import java.util.Scanner;

public class Letra {
	private String letra;

	Scanner lee = new Scanner(System.in);
	
	public Letra() {
		this.letra = "";
	}
	public Letra(String letra) {
		this.letra = letra;
	}
	public String getletra() {
		return letra;
	}

	public void setletra(String letra) {
		this.letra = letra;
	}

	public void leer() {
		System.out.println("ïngrese la letra");
		this.letra = lee.next();
	}
	public void mostrar() {
		System.out.println("nom = " + this.letra);
	
	}
	
}
