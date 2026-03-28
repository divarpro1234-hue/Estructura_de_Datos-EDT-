import java.util.Scanner;

public class Especialidad {
	private String nomEspecialidad;
	private String nomDoc;
	
	
	public Especialidad(String nomEspecialidad, String nomDoc) {
		this.nomEspecialidad = nomEspecialidad;
		this.nomDoc = nomDoc;
	}
	
	public Especialidad() {
		this.nomEspecialidad = "";
		this.nomDoc ="";
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos de las peliculas: nomEspecialidad, nomDoc, duracion");
		this.nomEspecialidad = lee.next();
		this.nomDoc = lee.next();
		
	}

	public void mostrar() {
//		System.out.println("Datos de la lista");
		System.out.println("\nnomEspecialidad : " + this.nomEspecialidad);
		System.out.println("nomDoc: " + this.nomDoc);
		
	}
	
	public String getNomEspecialidad() {
		return nomEspecialidad;
	}

	public void setNomEspecialidad(String nomEspecialidad) {
		this.nomEspecialidad = nomEspecialidad;
	}

	public String getNomDoc() {
		return nomDoc;
	}

	public void setNomDoc(String nomDoc) {
		this.nomDoc = nomDoc;
	}

	
	
}
