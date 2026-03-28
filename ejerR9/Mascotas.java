import java.util.Scanner;

public class Mascotas {
	private String nomMas;
	private String edadMas;
	private String sexoMas;
	private String tipoMas;
	private String idProp;
	
	public Mascotas(String nomMas, String edadMas, String sexoMas, String tipoMas,String idProp) {
		this.nomMas = nomMas;
		this.edadMas = edadMas;
		this.sexoMas = sexoMas;
		this.tipoMas = tipoMas;
		this.idProp = idProp;
		
	}
	
	public Mascotas() {
		this.nomMas = "";
		this.edadMas ="";
		this.sexoMas = "";
		this.tipoMas = "";
		this.idProp = "";
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos de las peliculas: nomMas, edadMas, duracion");
		this.nomMas = lee.next();
		this.edadMas = lee.next();
		this.sexoMas = lee.next();
		this.tipoMas = lee.next();
		this.idProp = lee.next();
	}

	public void mostrar() {
//		System.out.println("Datos de la lista");
		System.out.println("\nnomMas : " + this.nomMas);
		System.out.println("edadMas: " + this.edadMas);
		System.out.println("sexoMas: " + this.sexoMas);
		System.out.println("tipoMascota: " + this.tipoMas);
		System.out.println("idProp: " + this.idProp);
	}
	
	public String getnomMas() {
		return nomMas;
	}

	public void setnomMas(String nomMas) {
		this.nomMas = nomMas;
	}

	public String getedadMas() {
		return edadMas;
	}

	public void setedadMas(String edadMas) {
		this.edadMas = edadMas;
	}

	public String getsexoMas() {
		return sexoMas;
	}

	public void setsexoMas(String sexoMas) {
		this.sexoMas = sexoMas;
	}
	public String getTipoMas() {
		return tipoMas;
	}

	public void setTipoMas(String tipoMas) {
		this.tipoMas = tipoMas;
	}
	public String getidProp() {
		return idProp;
	}

	public void setidProp(String idProp) {
		this.idProp = idProp;
	}

	
	
}
