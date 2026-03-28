import java.util.Scanner;

public class Bien_Inmueble {
	private String idCasa;  //define el dato objeto persona
	private int tamanio;
	private String ubicacion;
		
	public Bien_Inmueble(String idCasa, int tamanio, String ubicacion){
		this.idCasa = idCasa;
		this.tamanio = tamanio;
		this.ubicacion = ubicacion;
	}
	public Bien_Inmueble() {
		this.idCasa = "";
		this.tamanio= 0;
		this.ubicacion = "";
	}
	public String toString() {
		return "Artista [idCasa=" + idCasa + ", tamanio=" + tamanio + ", ubicacion=" + ubicacion + "]";
	}
	
	public void mostrar() {
		System.out.println("idCasa : " + this.idCasa);
		System.out.println("tamanio: " + this.tamanio);
		System.out.println("ubicacion: " + this.ubicacion);
		System.out.println();
		
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos de la cancion:idCasa, tamanio, ubicacion");
		this.idCasa = lee.next();
		this.tamanio = lee.nextInt();
		this.ubicacion = lee.next();		
	}
	public String getIdCasa() {
		return idCasa;
	}
	public void setIdCasa(String idCasa) {
		this.idCasa = idCasa;
	}
	public int getTamanio() {
		return tamanio;
	}
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
}