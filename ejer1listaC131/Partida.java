//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Partida {
	
	private String jugador1;
	private String jugador2;
	private String resultado;
	
	public Partida(String jugador1, String jugador2, String resultado) {
		
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.resultado = resultado;
	}
	public Partida() {
		
		this.jugador1 = "";
		this.jugador2 = "";
		this.resultado = "";
	}
	public void mostrar() {
		
		System.out.println("jugador1: " + this.jugador1);
		System.out.println("jugador2: " + this.jugador2);
		System.out.println("resultado: " + this.resultado);
		System.out.println();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.resultado = lee.next();
		this.jugador1 = lee.next();
		this.jugador2 = lee.next();
	}
	
	public String getJugador1() {
		return jugador1;
	}
	public void setJugador1(String jugador1) {
		this.jugador1 = jugador1;
	}
	public String getJugador2() {
		return jugador2;
	}
	public void setJugador2(String jugador2) {
		this.jugador2 = jugador2;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
}
