
public class Pasajero {
		private String nom;
		private int edad;
		private String tipo;
		
		
		public Pasajero(String nom, int materia, String tipo) {
			this.nom = nom;
			this.edad = edad;
			this.tipo = tipo;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		public String getTipo() {
			return tipo;
		}

		public void setTipo(String materia, String tipo) {
			this.tipo = tipo;
		}
		@Override
		public String toString() {
			return "Pasajero [nom=" + nom + ", edad=" + edad + ", tipo="+ tipo +"]";
		}
		
		public void mostrar() {
			System.out.println(toString());
		}
	}
