import java.util.Scanner;

public class Cultivo {
	private String idCultivo;
	private String nombre;
	private String tipo;
	
	public Cultivo(String idCultivo, String nombre, String tipo) {
		this.idCultivo = idCultivo;
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	public Cultivo() {
		this.idCultivo = "";
		this.nombre ="";
		this.tipo = "";
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos de los cultivos: idCultivo, nombre, tipo");
		this.idCultivo = lee.next();
		this.nombre = lee.next();
		this.tipo = lee.next();
	}

	public void mostrar() {
		System.out.println("idCultivo : " + this.idCultivo);
		System.out.println("nombre: " + this.nombre);
		System.out.println("tipo: " + this.tipo);
		System.out.println();
	}
	
	public String getIdCultivo() {
		return idCultivo;
	}

	public void setIdCultivo(String idCultivo) {
		this.idCultivo = idCultivo;
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
	
}
