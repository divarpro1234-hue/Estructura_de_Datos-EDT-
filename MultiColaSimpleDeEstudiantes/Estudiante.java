
public class Estudiante {
	private String nom;
	private String materia;
	
	public Estudiante(String nom, String materia) {
		this.nom = nom;
		this.materia = materia;
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

	@Override
	public String toString() {
		return "Estudiante [nom=" + nom + ", materia=" + materia + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
}
