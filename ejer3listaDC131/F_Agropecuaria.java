import java.util.Scanner;

public class F_Agropecuaria {
	private String id;  //define el dato objeto persona
	private String nomFeria;
	private String fecha;
	private String lugar;
		
	public F_Agropecuaria(String id, String nomFeria, String fecha, String lugar){
		this.id = id;
		this.nomFeria = nomFeria;
		this.fecha = fecha;
		this.lugar = lugar;
	}
	public F_Agropecuaria() {
		this.id = "";
		this.nomFeria = "";
		this.fecha = "";
		this.lugar = "";
	}
	public String toString() {
		return "Artista [id=" + id + ", nomFeria=" + nomFeria + ", fecha=" + fecha + "]";
	}
	
	public void mostrar() {
		System.out.println("id : " + this.id);
		System.out.println("nomFeria: " + this.nomFeria);
		System.out.println("fecha: " + this.fecha);
		System.out.println("lugar: " + this.lugar);
		System.out.println();
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos de la cancion:id, nomFeria, fecha");
		this.id = lee.next();
		this.nomFeria = lee.next();
		this.fecha = lee.next();
				
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNomFeria() {
		return nomFeria;
	}
	public void setNomFeria(String nomFeria) {
		this.nomFeria = nomFeria;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
}