public class NodoL {
    private Libro letra;
    private NodoL izq, der;

    public NodoL() {
        this.letra = null;
        this.izq = null;
        this.der = null;
    }

    public Libro getLetra() {
        return letra;
    }

    public void setLetra(Libro letra) {
        this.letra = letra;
    }

    public NodoL getIzq() {
        return izq;
    }

    public void setIzq(NodoL izq) {
        this.izq = izq;
    }

    public NodoL getDer() {
        return der;
    }

    public void setDer(NodoL der) {
        this.der = der;
    }
}
