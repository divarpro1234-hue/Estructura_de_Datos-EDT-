	
public class Casa {
		private String codigo;
		private String nombreProp;
		private int tamanio;
		
		public Casa(String codigo, String nombreProp, int tamanio) {
			this.codigo = codigo;
			this.nombreProp = nombreProp;
			this.tamanio = tamanio;
		}
		public Casa() {
			this.codigo = "";
			this.nombreProp = "";
			this.tamanio = 0;
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getNombreProp() {
			return nombreProp;
		}

		public void setNombreProp(String nombreProp) {
			this.nombreProp = nombreProp;
		}

		public int getTamanio() {
			return tamanio;
		}

		public void setTamanio(int tamanio) {
			this.tamanio = tamanio;
		}
		
		public void mostrar() {
			System.out.println();
			System.out.println("Codigo: " + codigo);
			System.out.println("nombre Propietario: " + nombreProp);
			System.out.println("tamaño: " + tamanio + "m*m");
		}
	}
