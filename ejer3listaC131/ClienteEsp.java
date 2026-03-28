//Lic Aruquipa Marcelo
import java.util.Scanner;

public class ClienteEsp {
	private int nroTurn;
	private String nomCli;
	private String tipoTra;
	
	public ClienteEsp(int nroTurn, String nomCli, String tipoTra) {
		this.nroTurn = nroTurn;
		this.nomCli = nomCli;
		this.tipoTra = tipoTra;
	}
	public ClienteEsp() {
		this.nroTurn = 0;
		this.nomCli = "";
		this.tipoTra = "";
	}
	public void mostrar() {
		System.out.println("numero de turno: " + this.nroTurn);
		System.out.println("nombre Cliente: " + this.nomCli);
		System.out.println("tipo Trampite: " + this.tipoTra);
		System.out.println();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.nroTurn = lee.nextInt();
		this.nomCli = lee.next();
	}
	
	public int getNroTurn() {
		return nroTurn;
	}
	public void setNroTurn(int nroTurn) {
		this.nroTurn = nroTurn;
	}
	public String getNomCli() {
		return nomCli;
	}
	public void setNomCli(String nomCli) {
		this.nomCli = nomCli;
	}
	public String getTipoTra() {
		return tipoTra;
	}
	public void setTipoTra(String tipoTra) {
		this.tipoTra = tipoTra;
	}
	
}
