

public class Consultorio {
		private String id_consultorio;
		private String id_medico;
		private ColaSimpleIn cin;
		
		public Consultorio(String id_consultorio, String id_medico, ColaSimpleIn cin) {
			this.id_consultorio = id_consultorio;
			this.id_medico = id_medico;
			this.cin = cin;
		}
		
		public Consultorio() {
			this.id_consultorio = "";
			this.id_medico = "";
			this.cin = null;
		}

		public void mostrar() {
			System.out.println();
			System.out.println("\n\tDatos del consultorio");
			System.out.println();
			System.out.println("id_consultorio: " + this.id_consultorio);
			System.out.println("id_medico: "+ this.id_medico);
			cin.mostrar();
		}
		
		public String getId_consultorio() {
			return id_consultorio;
		}

		public void setId_consultorio(String id_consultorio) {
			this.id_consultorio = id_consultorio;
		}

		public String getId_medico() {
			return id_medico;
		}

		public void setId_medico(String id_medico) {
			this.id_medico = id_medico;
		}

		public ColaSimpleIn getCin() {
			return cin;
		}

		public void setCin(ColaSimpleIn cin) {
			this.cin = cin;
		}

		
	}
