import java.util.Scanner;

public class Materia {
    private String sigla;
    private String nombre;
    private String paralelo;
    private String nomDoc;
    private LS_NormalEst le;

    
    	
    public Materia(String sigla, String nombre, String paralelo, String nomDoc, LS_NormalEst le) {
        this.sigla = sigla;
        this.nombre = nombre;
        this.paralelo = paralelo;
        this.nomDoc = nomDoc;
        this.le = le;
    }

	public void mostrar() {
		System.out.println("\t lista de materias");
		System.out.println("sigla: "+sigla);
		System.out.println("nombre: "+nombre);
		
		System.out.println("paralelo: "+paralelo);
		System.out.println("nomDoc: "+nomDoc);
		System.out.println("lista de estudiantes");
		le.mostrar();
	}

    @Override
    public String toString() {
        return "Materia{" + "sigla=" + sigla + ", nombre=" + nombre + ", paralelo=" + paralelo + ", nomDoc=" + nomDoc + ", le=" + le + '}';
    }


    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public String getNomDoc() {
        return nomDoc;
    }

    public void setNomDoc(String nomDoc) {
        this.nomDoc = nomDoc;
    }

    public LS_NormalEst getLe() {
        return le;
    }

    public void setLe(LS_NormalEst le) {
        this.le = le;
    }
    
    
}