import java.util.Scanner;

public class Habitacion {
	private String idCasa;  //define el dato objeto persona
	private String tipoHab;
	private String color;
	private String tamanio;
		
	public Habitacion(String idCasa, String tipoHab, String color, String tamanio){
		this.idCasa = idCasa;
		this.tipoHab = tipoHab;
		this.color = color;
		this.tamanio = tamanio;
	}
	public Habitacion() {
		this.idCasa = "";
		this.tipoHab= "";
		this.color = "";
		this.tamanio = "";
	}
	public String toString() {
		return "Artista [idCasa=" + idCasa + ", tipoHab=" + tipoHab + ", color=" + color + "]";
	}
	
	public void mostrar() {
		System.out.println("idCasa : " + this.idCasa);
		System.out.println("tipoHab: " + this.tipoHab);
		System.out.println("color: " + this.color);
		System.out.println("tamanio: " + this.tamanio);
		System.out.println();
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos de la cancion:idCasa, tipoHab, color");
		this.idCasa = lee.next();
		this.tipoHab = lee.next();
		this.color = lee.next();
				
	}
	public String getIdCasa() {
		return idCasa;
	}
	public void setIdCasa(String idCasa) {
		this.idCasa = idCasa;
	}
	public String getTipoHab() {
		return tipoHab;
	}
	public void setTipoHab(String tipoHab) {
		this.tipoHab = tipoHab;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	
}