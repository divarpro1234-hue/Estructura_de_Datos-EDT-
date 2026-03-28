
public class Medico {
		private String id_medico;
		private String especialidad;
		private String nombre;
		
		public Medico(String id_medico, String especialidad, String nombre) {
			this.id_medico = id_medico;
			this.especialidad = especialidad;
			this.nombre = nombre;
		}
		public Medico() {
			this.id_medico = "";
			this.especialidad = "";
			this.nombre = "";
		}
		
		public void mostrar() {
			System.out.println();
			System.out.println("id_medico: " + this.id_medico);
			System.out.println("especialidad: " + this.especialidad);
			System.out.println("nombre: " + this.nombre );
		
		}
		public String getId_medico() {
			return id_medico;
		}
		public void setId_medico(String id_medico) {
			this.id_medico = id_medico;
		}
		public String getEspecialidad() {
			return especialidad;
		}
		public void setEspecialidad(String especialidad) {
			this.especialidad = especialidad;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
	
	}
