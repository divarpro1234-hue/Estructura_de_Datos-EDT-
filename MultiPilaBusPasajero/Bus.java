public class Bus {
		private String placa;
		private String color;
		private PilaPasajero pj;
		private String conductor;
		private String ruta;
		
		public Bus(String placa, String color, PilaPasajero pj, String conductor, String ruta) {
			this.placa = placa;
			this.color = color;
			this.pj = pj;
			this.conductor = conductor;
			this.ruta = ruta;
		}

		public String getplaca() {
			return placa;
		}

		public void setplaca(String placa) {
			this.placa = placa;
		}

		public String getcolor() {
			return color;
		}

		public void setcolor(String color) {
			this.color = color;
		}

		public void mostrar() {
			System.out.println("\t BUS");
			System.out.println("Placa: "+placa);
			System.out.println("Color: "+color);
			System.out.println("*Pila de pasajeros*");
			pj.mostrar();
			System.out.println("Conductor: "+conductor);
			System.out.println("Ruta: "+ruta);
		}
		public void mostrar2(PilaPasajero pj) {
	        System.out.println(pj.toString()); // Llama al toString de PilaPasajero
	    }
		public PilaPasajero getPj() {
			return pj;
		}

		public void setPj(PilaPasajero pj) {
			this.pj = pj;
		}

		public String getConductor() {
			return conductor;
		}

		public void setConductor(String conductor) {
			this.conductor = conductor;
		}

		public String getRuta() {
			return ruta;
		}

		public void setRuta(String ruta) {
			this.ruta = ruta;
		}
		@Override
		public String toString() {
			return "Estudiante [placa=" + placa + ", color=" + color + " PilaPasajero=" + pj.toString() + " conductor=" +conductor+ " ruta=" + ruta + "]";
		}
	}