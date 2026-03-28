import java.util.Scanner;

public class Hechizo {
	private String nombre;
	private String tipo;
	private Ingrediente id_primer_ing;
	private Ingrediente id_ultimo_ing;
	
	public Hechizo(String nombre, String tipo, Ingrediente id_primer_ing, Ingrediente id_ultimo_ing) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.id_primer_ing = id_primer_ing;
		this.id_ultimo_ing = id_ultimo_ing;
	}
	
	public Hechizo(Ingrediente id_primer_ing, Ingrediente id_ultimo_ing) {
		this.nombre = "";
		this.tipo = "";
		this.id_primer_ing = id_primer_ing;
		this.id_ultimo_ing = id_ultimo_ing;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos de las peliculas: titulo, director, duracion");
		this.nombre = lee.next();
		this.tipo = lee.next();
		Ingrediente z = new Ingrediente();
		Ingrediente y = new Ingrediente();
		z.leer();
		z.leer();
	}

	public void mostrar() {
		
		System.out.println("nombre : " + this.nombre);
		System.out.println("tipo : " + this.tipo);
		System.out.println("\tprimer ingrediente");
		id_primer_ing.mostrar();;
		System.out.println("\tultimo ingrediente");
		id_ultimo_ing.mostrar();
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Ingrediente getId_primer_ing() {
		return id_primer_ing;
	}

	public void setId_primer_ing(Ingrediente id_primer_ing) {
		this.id_primer_ing = id_primer_ing;
	}

	public Ingrediente getId_ultimo_ing() {
		return id_ultimo_ing;
	}

	public void setId_ultimo_ing(Ingrediente id_ultimo_ing) {
		this.id_ultimo_ing = id_ultimo_ing;
	}

}
