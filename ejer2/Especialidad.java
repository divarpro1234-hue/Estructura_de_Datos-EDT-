
public class Especialidad {
		private String nombre;
		private int sala;
		
		public Especialidad(String nombre, int sala) {
			this.nombre = nombre;
			this.sala = sala;
		}

		public String getnombre() {
			return nombre;
		}

		public void setnombre(String nombre) {
			this.nombre = nombre;
		}

		public int getsala() {
			return sala;
		}

		public void setsala(int sala) {
			this.sala = sala;
		}

		@Override
		public String toString() {
			return "Especialidad [nombre=" + nombre + ", sala=" + sala + "]";
		}
		
		public void mostrar() {
			System.out.println(toString());
		}
	}
