
public class Flor {
	private int numero;
	private int energia;
	
	public Flor(int numero, int energia) {
		this.numero = numero;
		this.energia = energia;
	}

	public Flor() {
		this.numero = 0;
		this.energia = 0;
	}
	
	public void mostrar() {
		System.out.println();
		System.out.println("numero: " + this.numero);
		System.out.println("energia: "+ this.energia);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

}
