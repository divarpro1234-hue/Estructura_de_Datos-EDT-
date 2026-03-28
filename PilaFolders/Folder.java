//Lic Aruquipa Marcelo
public class Folder {
	private String color;
	private String tamanio;
	private double precio;
	
	public Folder(String color, String tamanio, double precio) {
		this.color = color;
		this.tamanio = tamanio;
		this.precio = precio;
	}
	public Folder() {
		this.color = "";
		this.tamanio = "";
		this.precio = 0.0;
	}
	@Override
	public String toString() {
		return "Folder [color=" + color + ", tamanio=" + tamanio + ", precio=" + precio + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}

	public String getColor() {
		return color;
	}

	public String getTamanio() {
		return tamanio;
	}

	public double getPrecio() {
		return precio;
	}
	
	public void mostrar1() {
		System.out.println("folder");
		System.out.println("color: "+color);
		System.out.println("tamaño: "+tamanio);
		System.out.println("Precio: "+precio);
		System.out.println();
	
	}
	
}
