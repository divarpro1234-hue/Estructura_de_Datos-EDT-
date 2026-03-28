package lugaresventas;

public class ListaSimpleVenta {
    protected NodoV P;   // Atributo de tipo NodoMat

    public ListaSimpleVenta() {
        P = null;
    }

    // Getters y Setters
    public NodoV getP() {
        return P;
    }

    public void setP(NodoV p) {
        P = p;
    }
}