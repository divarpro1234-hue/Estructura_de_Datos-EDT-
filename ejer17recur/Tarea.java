
public class Tarea {
	private int numero;
	
	public Tarea(int numero) {
		this.numero = numero;
	}

	public Tarea() {
		this.numero = 0;
	}
	
	public void mostrar() {
		System.out.println();
		System.out.println("numero: " + this.numero);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
