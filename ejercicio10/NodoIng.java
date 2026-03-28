
public class NodoIng {
	private Ingrediente ingrediente;  //define el dato objeto persona
	private NodoIng sig; //definiendo el campo enlace sig
	
	public NodoIng() {  
		sig = null;
	}

	public Ingrediente getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}

	public NodoIng getSig() {
		return sig;
	}

	public void setSig(NodoIng sig) {
		this.sig = sig;
	}
	
}
