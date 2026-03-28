//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Comite {
	private String nomCom;
	private String nomEncar;
	private LS_CircularP lpar;
	
	public Comite(String nomCom, String nomEncar, LS_CircularP lpar) {
		this.nomCom = nomCom;
		this.nomEncar = nomEncar;
		this.setLpar(lpar);
	}
	public Comite() {
		this.nomCom = "";
		this.nomEncar = "";
		
	}
	public void mostrar() {
		System.out.println("nomCom: " + this.nomCom);
		System.out.println("nomEncar: " + this.nomEncar);
		System.out.println("datos de la lista participante");
		lpar.mostrar();
		System.out.println();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.nomCom= lee.next();
		this.nomEncar = lee.next();
			
	}
	public String getNomCom() {
		return nomCom;
	}
	public void setNomCom(String nomCom) {
		this.nomCom = nomCom;
	}
	
	public String getNomEncar() {
		return nomEncar;
	}
	public void setNomEncar(String nomEncar) {
		this.nomEncar = nomEncar;
	}
	
	public LS_CircularP getLpar() {
		return lpar;
	}
	public void setLpar(LS_CircularP lpar) {
		this.lpar = lpar;
	}
	
}
