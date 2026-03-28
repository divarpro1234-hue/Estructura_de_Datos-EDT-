import java.util.Scanner;

public class Hogar {
	private int nroCasa;
	private String zona;
	private String propietario;
	private String idPropietario;
	
	public Hogar(int nroCasa, String zona, String propietario, String idPropietario) {
		this.nroCasa = nroCasa;
		this.zona = zona;
		this.propietario = propietario;
		this.idPropietario = idPropietario;
		
	}
	
	public Hogar() {
		this.nroCasa = 0;
		this.zona ="";
		this.propietario = "";
		this.idPropietario = "";
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos de las peliculas: nroCasa, zona, duracion");
		this.nroCasa = lee.nextInt();
		this.zona = lee.next();
		this.propietario = lee.next();
		this.idPropietario = lee.next();
	}

	public void mostrar() {
//		System.out.println("Datos de la lista");
		System.out.println("\nnroCasa : " + this.nroCasa);
		System.out.println("zona: " + this.zona);
		System.out.println("propietario: " + this.propietario);
		System.out.println("idPropietario: " + this.idPropietario);
	}
	
	public int getNroCasa() {
		return nroCasa;
	}

	public void setNroCasa(int nroCasa) {
		this.nroCasa = nroCasa;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getIdPropietario() {
		return idPropietario;
	}

	public void setIdPropietario(String idPropietario) {
		this.idPropietario = idPropietario;
	}
	
}
