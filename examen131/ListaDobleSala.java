public class ListaDobleSala {
    NodoSala inicio, fin;

    public ListaDobleSala() {
        inicio = fin = null;
    }

    public void adicionarSala(Sala s) {
        NodoSala nuevo = new NodoSala(s);
        if (inicio == null)
            inicio = fin = nuevo;
        else {
            fin.sig = nuevo;
            nuevo.ant = fin;
            fin = nuevo;
        }
    }

    public NodoSala getInicio() {
        return inicio;
    }
}