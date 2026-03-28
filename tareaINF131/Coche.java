//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Coche {
	private String modelo;
	private String marca;
	private String color;
	private String placa;
	
	public Coche(String modelo, String marca, String color, String placa) {
		this.modelo = modelo;
		this.marca = marca;
		this.color = color;
		this.placa = placa;

	}
	public Coche() {
		this.modelo = "";
		this.marca = "";
		this.color = "";
		this.placa = "";
		
	}
	public void mostrar() {
		System.out.println("modelo: " + this.modelo);
		System.out.println("marca: " + this.marca);
		System.out.println("color: " + this.color);
		System.out.println("placa: " + this.placa);
		System.out.println();
	}
//	public void leer() {
//		Scanner lee = new Scanner(System.in);
//		this.modelo = lee.next();
//	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

}