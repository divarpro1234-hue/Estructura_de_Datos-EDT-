package lugaresventas;

public class NodoV {
    private Venta venta;   // Objeto de tipo Materia
    private NodoV sig;   // Enlace al siguiente nodo

    // Getters y Setters
    public NodoV() {
        this.sig = null;
    }

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public NodoV getSig() {
		return sig;
	}

	public void setSig(NodoV sig) {
		this.sig = sig;
	}
}
