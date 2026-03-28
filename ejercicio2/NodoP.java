
public class NodoP {
	private Pelicula peli;  //define el dato objeto persona
	private NodoP sig; //definiendo el campo enlace sig
	
	public NodoP() {  
		sig = null;
	}

	public Pelicula getPelicula() {
		return peli;
	}

	public void setPelicula(Pelicula pelicula) {
		this.peli = pelicula;
	}

	public NodoP getSig() {
		return sig;
	}

	public void setSig(NodoP sig) {
		this.sig = sig;
	}
	
}
