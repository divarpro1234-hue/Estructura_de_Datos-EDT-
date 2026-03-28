
public class Equipamiento {
		private String nombre;
		private String tipo;
		private int cantidad;
		private int defectuosas;
		
		public Equipamiento(String nombre, String tipo, int cantidad, int defectuosas) {
			this.nombre = nombre;
			this.tipo = tipo;
			this.cantidad = cantidad;
			this.defectuosas = defectuosas;
		}
		public Equipamiento() {
			this.nombre = "";
			this.tipo = "";
			this.cantidad = 0;
			this.defectuosas = 0;
		}
		public void mostrar() {
			System.out.println();
			System.out.println("nombre: " + this.nombre);
			System.out.println("tipo: " + this.tipo);
			System.out.println("cantidad: " + this.cantidad);
			System.out.println("defectuosas: " + this.defectuosas);

		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public int getCantidad() {
			return cantidad;
		}
		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
		public int getDefectuosas() {
			return defectuosas;
		}
		public void setDefectuosas(int defectuosas) {
			this.defectuosas = defectuosas;
		}
	
	}
