
public class Paciente {
		private String nom;
		private int ci;
		private Doctor doctor;
		private Especialidad especialidad;
		
		public Paciente(String nom, int ci, Doctor doctor, Especialidad especialidad) {
			this.nom = nom;
			this.ci = ci;
			this.doctor = doctor;
			this.especialidad = especialidad;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public int getci() {
			return ci;
		}

		public void setci(int ci) {
			this.ci = ci;
		}

		public Doctor getDoctor() {
			return doctor;
		}

		public void setDoctor(Doctor doctor) {
			this.doctor = doctor;
		}

		public Especialidad getEspecialidad() {
			return especialidad;
		}

		public void setEspecialidad(Especialidad especialidad) {
			this.especialidad = especialidad;
		}
		
		@Override
		public String toString() {
			return "Paciente [nom=" + nom + ", ci=" + ci + ", " +doctor+ ", especialidad=" + especialidad + "]";
		}
		
		public void mostrar() {
			System.out.println(toString());
			System.out.println("nombre= "+nom+" ci= "+ci);
			System.out.println(doctor);
			System.out.println(especialidad);
		}

		
	}
