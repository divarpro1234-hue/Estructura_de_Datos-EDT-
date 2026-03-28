
public class Canciones {
	private String nom;
	private String materia;
	private String cantante;
	private double duracion;
	public Canciones(String nom, String materia, String cantante, double duracion) {
		super();
		this.nom = nom;
		this.materia = materia;
		this.cantante = cantante;
		this.duracion = duracion;
	}
	public String toString() {
		return "Cancion [titulo=" + nom + ", genero=" + materia
				+ ", cantante=" + cantante + ", duracion=" + duracion + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getCantante() {
		return cantante;
	}
	public void setCantante(String cantante) {
		this.cantante = cantante;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
}
