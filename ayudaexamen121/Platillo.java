import java.util.Scanner;

public class Platillo {
	private String idPlatillo;
	private String nom_Platillo;
	private PilaIngrediente pi;
	private int precio;
	
	public Platillo(String idPlatillo, String nom_Platillo, PilaIngrediente pi,int precio) {
		this.idPlatillo = idPlatillo;
		this.nom_Platillo = nom_Platillo;
		this.pi=pi;
		this.precio = precio;
	}
	
	public Platillo() {
		this.idPlatillo = "";
		this.nom_Platillo ="";
		
		this.precio = 0;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos de las peliculas: idPlatillo, nom_Platillo, precio");
		this.idPlatillo = lee.next();
		this.nom_Platillo = lee.next();
		this.precio = lee.nextInt();
	}

	public void mostrar() {
		System.out.println("Datos de la lista");
		System.out.println("\nidPlatillo : " + this.idPlatillo);
		System.out.println("nom_Platillo: " + this.nom_Platillo);
		pi.mostrar();
		System.out.println("precio: " + this.precio);
	}
	
	public String getidPlatillo() {
		return idPlatillo;
	}

	public void setidPlatillo(String idPlatillo) {
		this.idPlatillo = idPlatillo;
	}

	public String getnom_Platillo() {
		return nom_Platillo;
	}

	public void setnom_Platillo(String nom_Platillo) {
		this.nom_Platillo = nom_Platillo;
	}

	public double getprecio() {
		return precio;
	}

	public void setprecio(int precio) {
		this.precio = precio;
	}
	
}
