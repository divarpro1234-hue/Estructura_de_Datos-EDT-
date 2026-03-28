
public class Motocicleta {
		private String color;
		private String marca;
		private String placa;
		
		public Motocicleta(String color, String marca, String placa) {
			this.color = color;
			this.marca = marca;
			this.placa = placa;
		}
		public Motocicleta() {
			this.color = "";
			this.marca = "";
			this.placa = "";
		}
	
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getPlaca() {
			return placa;
		}
		public void setPlaca(String placa) {
			this.placa = placa;
		}
		public void mostrar() {
			System.out.println();
			System.out.println("color: " + this.color);
			System.out.println("marca: " + this.marca);
			System.out.println("placa: " + this.placa);
		
		}
	
	}
