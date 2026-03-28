
public class Rio {
		private String nombre;
		private String municipio;
		private int alturanActual;
		private int alturanNormal;
		
		public Rio(String nombre, String municipio, int alturanActual, int alturanNormal) {
			this.nombre = nombre;
			this.municipio = municipio;
			this.alturanActual = alturanActual;
			this.alturanNormal = alturanNormal;
		}
		public Rio() {
			this.nombre = "";
			this.municipio = "";
			this.alturanActual = 0;
			this.alturanNormal = 0;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getMunicipio() {
			return municipio;
		}

		public void setMunicipio(String municipio) {
			this.municipio = municipio;
		}

		public int getAlturanActual() {
			return alturanActual;
		}

		public void setAlturanActual(int alturanActual) {
			this.alturanActual = alturanActual;
		}

		public int getAlturanNormal() {
			return alturanNormal;
		}

		public void setAlturanNormal(int alturanNormal) {
			this.alturanNormal = alturanNormal;
		}
		
		public void mostrar() {
			System.out.println();
			System.out.println("nombre: " + nombre);
			System.out.println("municipio: " + municipio);
			System.out.println("altura actual: " + alturanActual + " metros");
			System.out.println("altura normal: " + alturanNormal + " metros");
		
		}
	
	}
