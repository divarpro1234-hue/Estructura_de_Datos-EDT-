package MultiColaDeEstudiantes;

public class Estudiante {
		private co
		private String dia;
		private String nomActividad;
		
		
		
		public Estudiante(String dia, String nomActividad) {
			this.dia = dia;
			this.nomActividad = nomActividad;
		}

		public String getdia() {
			return dia;
		}

		public void setdia(String dia) {
			this.dia = dia;
		}

		public String getnomActividad() {
			return nomActividad;
		}

		public void setnomActividad(String nomActividad) {
			this.nomActividad = nomActividad;
		}

		@Override
		public String toString() {
			return "Estudiante [dia=" + dia + ", nomActividad=" + nomActividad + "]";
		}
		
		public void mostrar() {
			System.out.println(toString());
		}
	}
