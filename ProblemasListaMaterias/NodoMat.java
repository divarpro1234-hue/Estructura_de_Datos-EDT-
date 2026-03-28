public class NodoMat {
    private Materia q;  
    private NodoMat sig; 
    
    public NodoMat() {
        this.sig = null; 
    }

    public NodoMat getSig() {
        return sig;
    }

    public Materia getQ() {
		return q;
	}

	public void setQ(Materia q) {
		this.q = q;
	}

	public void setSig(NodoMat sig) {
        this.sig = sig;
    }
}
