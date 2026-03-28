package ColaSimpleJuguetes;

public class Juguete {
	private String nom;
	private String tipo;
	private int nivelDes;
	private String duenio;
	
	public Juguete(String nom, String tipo, int nivelDes,String duenio) {
		this.nom = nom;
		this.tipo = tipo;
		this.nivelDes = nivelDes;
		this.duenio = duenio;
	}

	public String getDuenio() {
		return duenio;
	}

	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNivelDes() {
		return nivelDes;
	}

	public void setNivelDes(int nivelDes) {
		this.nivelDes = nivelDes;
	}

	@Override
	public String toString() {
		return "Juguete [nom=" + nom + ", tipo=" + tipo + ", nivelDes=" + nivelDes + ", dueño=" + duenio +"]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
	
}
