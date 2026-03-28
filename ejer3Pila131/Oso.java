
public class Oso {
		private String nomAlimento;
		private int cantidad;
		
		
		public Oso(String nomAlimento, int cantidad) {
			this.nomAlimento = nomAlimento;
			this.cantidad = cantidad;
		}
		public Oso() {
			this.nomAlimento = "";
			this.cantidad = 0;
		}

		public String getNomAlimento() {
			return nomAlimento;
		}

		public void setNomAlimento(String nomAlimento) {
			this.nomAlimento = nomAlimento;
		}

		public int getCantidad() {
			return cantidad;
		}

		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}

		public void mostrar() {
			System.out.println();
			System.out.println("nombre alimento: " + nomAlimento);
			System.out.println("cantidad: " + cantidad + " kg");
		}
	
	}
