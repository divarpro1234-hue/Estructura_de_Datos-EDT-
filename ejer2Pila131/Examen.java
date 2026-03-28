
public class Examen {
		private int nroExamen;
		private int nota;
		private String nombreOso;
		private String idioma;
		
		public Examen(int nroExamen, int nota, String nombreOso, String idioma) {
			this.nroExamen = nroExamen;
			this.nota = nota;
			this.nombreOso = nombreOso;
			this.idioma = idioma;
		}
		public Examen() {
			this.nroExamen = 0;
			this.nota = 0;
			this.nombreOso = "";
			this.idioma = "";
		}

		public int getNroExamen() {
			return nroExamen;
		}

		public void setNroExamen(int nroExamen) {
			this.nroExamen = nroExamen;
		}

		public int getNota() {
			return nota;
		}

		public void setNota(int nota) {
			this.nota = nota;
		}

		public String getNombreOso() {
			return nombreOso;
		}

		public void setNombreOso(String nombreOso) {
			this.nombreOso = nombreOso;
		}

		public String getIdioma() {
			return idioma;
		}

		public void setIdioma(String idioma) {
			this.idioma = idioma;
		}
		
		public void mostrar() {
			System.out.println();
			System.out.println("nroExamen: " + nroExamen);
			System.out.println("nota: " + nota);
			System.out.println("nombre oso: " + nombreOso);
			System.out.println("idioma: " + idioma);
		
		}
	
	}
