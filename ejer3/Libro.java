
public class Libro {
		private int nroPag;
		private String titulo;
		private String autor;
		private int anioPublicado;
		
		public Libro(int nroPag, String titulo, String autor, int anioPublicado) {
			this.nroPag = nroPag;
			this.titulo = titulo;
			this.autor = autor;
			this.anioPublicado= anioPublicado;
		}

		public String gettitulo() {
			return titulo;
		}

		public void settitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getautor() {
			return autor;
		}

		public void setautor(String autor) {
			this.autor = autor;
		}

		public int getNroPag() {
			return nroPag;
		}

		public void setNroPag(int nroPag) {
			this.nroPag = nroPag;
		}

		public int getAnioPublicado() {
			return anioPublicado;
		}

		public void setAnioPublicado(int anioPublicado) {
			this.anioPublicado = anioPublicado;
		}
		
		@Override
		public String toString() {
			return "Libro [nropag=" + nroPag + ", titulo=" + titulo + ", autor=" + autor + ", anioPublicado=" + anioPublicado+ "]";
		}
		
		public void mostrar() {
			System.out.println(toString());
		}
	}
