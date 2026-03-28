
public class CajaRefresco {
		private int precio;
		private String nombre;
		private int cantidad;
		
		public CajaRefresco(int precio, String nombre, int cantidad) {
			this.precio = precio;
			this.nombre = nombre;
			this.cantidad = cantidad;
		}
		
		public CajaRefresco() {
			this.precio = 0;
			this.nombre = "";	
			this.cantidad = 0;
		}

		public int getPrecio() {
			return precio;
		}


		public void setPrecio(int precio) {
			this.precio = precio;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public int getCantidad() {
			return cantidad;
		}


		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}

		public void mostrar1() {
			System.out.println();
			System.out.println("precio: " + precio);
			System.out.println("nombre caja de refresco: " + nombre);
			System.out.println("catidad: " + cantidad);
		}
		
//		@Override
//		public String toString() {
//			return "Estudiante [unidades=" + unidades + ", materia=" + materia + "]";
//		}
//		
//		public void mostrar() {
//			System.out.println(toString());
//		}
	}
