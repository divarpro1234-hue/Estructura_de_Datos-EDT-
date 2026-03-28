//Lic Aruquipa Marcelo
import java.util.Scanner;

public class M_num {
	
	private LS_NormalNum lnum;
	
	public M_num(LS_NormalNum lnum) {
		this.lnum = lnum;
	}
	public M_num() {
		
		this.lnum = null;
	}
	public void mostrar() {
		
		lnum.mostrar();
		System.out.println();
	}
//	public void leer() {
//		Scanner lee = new Scanner(System.in);
//		this.resultado = lee.next();
//		this.jugador1 = lee.next();
//		this.jugador2 = lee.next();
//	}
	public LS_NormalNum getLnum() {
		return lnum;
	}
	public void setLnum(LS_NormalNum lnum) {
		this.lnum = lnum;
	}
	
}
