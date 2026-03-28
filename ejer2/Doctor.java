
public class Doctor {
		private String nombreDoc;
		private Especialidad especialidad;
		private int experiencia;
		
		public Doctor(String nombreDoc, Especialidad especialidad, int experiencia) {
			this.nombreDoc = nombreDoc;
			this.especialidad = especialidad;
			this.experiencia = experiencia;
		}

		public String getnombreDoc() {
			return nombreDoc;
		}

		public void setnombreDoc(String nombreDoc) {
			this.nombreDoc = nombreDoc;
		}
		
		public Especialidad getEspecialidad() {
			return especialidad;
		}

		public void setEspecialidad(Especialidad especialidad) {
			this.especialidad = especialidad;
		}
		
		public int getExperiencia() {
			return experiencia;
		}

		public void setExperiencia(int experiencia) {
			this.experiencia = experiencia;
		}

		@Override
		public String toString() {
			return "Doctor [nombreDoc=" + nombreDoc + ", Experiencia=" + experiencia + ", Especialidad= "+especialidad+"]";
		}
		
		public void mostrar() {
			System.out.println(toString());
		}

		
	}
