	
public class Zona {
		private String nombre;
		
		public Zona(String nombre) {
			this.nombre = nombre;
		}
		public Zona() {
			this.nombre = "";
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public void mostrar() {
			System.out.println();
			System.out.println("nombre: " + nombre);
		}
	}
