//Lic. Marcelo Aruquipa
import java.util.Scanner;

public class Mascota {
	private String idMascota;
	private String tipoMascota;
	private String nombreMascota;
	private String sexoMascota;
	private int edadMascota;
	private String idDueñoMascota;
	Scanner lee = new Scanner(System.in);
	
	public Mascota() {
		this.idMascota = "";
		this.tipoMascota = "";
		this.nombreMascota = "";
		this.sexoMascota = "";
		this.edadMascota = 0;
		this.idDueñoMascota = "";
	}

	public Mascota(String idMascota, String tipoMascota, String nombreMascota, 
			String sexoMascota, int edadMascota, String idDueñoMascota) {
		this.idMascota = idMascota;
		this.tipoMascota = tipoMascota;
		this.nombreMascota = nombreMascota;
		this.sexoMascota = sexoMascota;
		this.edadMascota = edadMascota;
		this.idDueñoMascota = idDueñoMascota;
	
	}

	public void leer() {
		System.out.println("Ingrese idMascota");
		this.idMascota = lee.next();
		System.out.println("Ingrese tipoMascota");
		this.tipoMascota = lee.next();
		System.out.println("Ingrese nombreMascota");
		this.nombreMascota = lee.next();
		System.out.println("Ingrese sexoMascota");
		this.sexoMascota = lee.next();
		System.out.println("Ingrese edadMascota");
		this.edadMascota = lee.nextInt();
		System.out.println("Ingrese idDueñoMascota");
		this.idDueñoMascota = lee.next();
	}
	public void mostrar() {
		System.out.println("\ndatos de la mascota");
		System.out.println("idMascota = " + this.idMascota);
		System.out.println("tipoMascota = " + this.tipoMascota);
		System.out.println("nombreMascota = " + this.nombreMascota);
		System.out.println("sexoMascota = " + this.sexoMascota);
		System.out.println("edadMascota = " + this.edadMascota);
		System.out.println("idDueñoMascota = " + this.idDueñoMascota);
	}

	public String getIdMascota() {
		return idMascota;
	}
	
	public void setIdMascota(String idMascota) {
		this.idMascota = idMascota;
	}

	public String getTipoMascota() {
		return tipoMascota;
	}

	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public String getSexoMascota() {
		return sexoMascota;
	}

	public void setSexoMascota(String sexoMascota) {
		this.sexoMascota = sexoMascota;
	}

	public int getEdadMascota() {
		return edadMascota;
	}

	public void setEdadMascota(int edadMascota) {
		this.edadMascota = edadMascota;
	}

	public String getIdDueñoMascota() {
		return idDueñoMascota;
	}

	public void setIdDueñoMascota(String idDueñoMascota) {
		this.idDueñoMascota = idDueñoMascota;
	}

	public Scanner getLee() {
		return lee;
	}

	public void setLee(Scanner lee) {
		this.lee = lee;
	}
	
}
