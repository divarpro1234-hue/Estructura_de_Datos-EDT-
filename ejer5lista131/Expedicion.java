import java.util.Scanner;

public class Expedicion {
	private String nombreExp;
	private String lider;
	private int cantTrip;
	private int distReco;
	private String exito;
	
	public Expedicion(String nombreExp, String lider, int cantTrip, int distReco, String exito) {
		this.nombreExp = nombreExp;
		this.lider = lider;
		this.cantTrip = cantTrip;
		this.distReco = distReco;
		this.exito = exito;
	}
	
	public Expedicion() {
		this.nombreExp = "";
		this.lider = "";
		this.cantTrip = 0;
		this.distReco = 0;
		this.exito = "";
	}
	
//	public void leer() {
//		Scanner lee = new Scanner(System.in);
//		System.out.println("Datos persona: nombreExpbre, edad");
//		this.nombreExp = lee.next();
//		this.lider = lee.next();
//		this.cantTrip = lee.nextInt();
//		this.distReco = lee.next();
//		this.numVictoria = lee.nextInt();
//	}

	public void mostrar() {
		System.out.println();
		System.out.println("nombreExp : " + this.nombreExp);
		System.out.println("lider: " + this.lider);
		System.out.println("velocidad Maxima: " + this.cantTrip);
		System.out.println("distReco: " + this.distReco);
		System.out.println("exito: " + this.exito);
	}

	public String getNombreExp() {
		return nombreExp;
	}

	public void setNombreExp(String nombreExp) {
		this.nombreExp = nombreExp;
	}

	public String getLider() {
		return lider;
	}

	public void setLider(String lider) {
		this.lider = lider;
	}

	public int getCantTrip() {
		return cantTrip;
	}

	public void setCantTrip(int cantTrip) {
		this.cantTrip = cantTrip;
	}

	public int getDistReco() {
		return distReco;
	}

	public void setDistReco(int distReco) {
		this.distReco = distReco;
	}

	public String getExito() {
		return exito;
	}

	public void setExito(String exito) {
		this.exito = exito;
	}
	
}
