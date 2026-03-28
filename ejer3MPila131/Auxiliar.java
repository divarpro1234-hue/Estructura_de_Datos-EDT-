	
public class Auxiliar {
		private String ci;
		private String nombre;
		private int cargaHor;
		private int cantMat;
		private double salario;
		
		public Auxiliar(String ci, String nombre, int cargaHor, int cantMat, double salario) {
			this.ci = ci;
			this.nombre = nombre;
			this.cargaHor = cargaHor;
			this.cantMat = cantMat;
			this.salario = salario;
		}
		public Auxiliar() {
			this.ci = "";
			this.nombre = "";
			this.cargaHor = 0;
			this.cantMat = 0;
			this.salario = 0;
		}

		public String getCi() {
			return ci;
		}

		public void setCi(String ci) {
			this.ci = ci;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getCargaHor() {
			return cargaHor;
		}

		public void setCargaHor(int cargaHor) {
			this.cargaHor = cargaHor;
		}

		public int getCantMat() {
			return cantMat;
		}

		public void setCantMat(int cantMat) {
			this.cantMat = cantMat;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		public void mostrar() {
			System.out.println();
			System.out.println("C.I: " + ci);
			System.out.println("nombre: " + nombre);
			System.out.println("carga horaria: " + cargaHor);
			System.out.println("cantidad de materias: " + cantMat);
			System.out.println("salario: " + salario);
		}
	}
