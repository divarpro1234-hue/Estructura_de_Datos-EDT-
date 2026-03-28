package lugaresventas;

public class Venta {
	private String equipo;
	private String cliente;
	
	public Venta(String equipo, String cliente) {
		this.equipo = equipo;
		this.cliente = cliente;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public void mostrar() {
		System.out.println("DATOS DE LA VENTA:");
		System.out.println("Equipo: " + this.equipo);
		System.out.println("Cliente: " + this.cliente);
	}
}
