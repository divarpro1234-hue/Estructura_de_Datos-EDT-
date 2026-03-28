//Lic Aruquipa Marcelo
import java.util.Scanner;

public class CentroConvencion {
	private String nomCentro;
	private LS_NormalE le ;
	
	public CentroConvencion(String nomCentro, LS_NormalE le) {
		this.nomCentro = nomCentro;
		this.le = le;
	}
	public CentroConvencion() {
		this.nomCentro = "";
		this.setLe(le);
		
	}
	public void mostrar() {
		System.out.println("\n\tCENTRO DE CONVENCION: "+this.nomCentro);
		System.out.println("\nlista normal eventos");
		le.mostrar();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.nomCentro= lee.next();

	}
	public String getNomCentro() {
		return nomCentro;
	}
	public void setNomCentro(String nomCentro) {
		this.nomCentro = nomCentro;
	}
	
	public LS_NormalE getLe() {
		return le;
	}
	public void setLe(LS_NormalE le) {
		this.le = le;
	}
	
}
