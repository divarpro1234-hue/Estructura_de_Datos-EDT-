
public class ColaSimpleCorredor extends ColaCorredor{
    public ColaSimpleCorredor(){
        super();
    }
    
    public boolean esvacia() {
        if (fr == fi) {
            return (true);
        }
        return (false);
    }

    public boolean esllena() {
        if (fi == MAX - 1) {
            return (true);
        }
        return (false);
    }

    public int nroelem() {
        return (fi - fr);
    }

    public void adi(Corredor elem) {
        if (!esllena()) {
            fi++;
            v[fi] = elem;
        } else {
            System.out.println("Cola Simple llena");
        }
    }

    public Corredor eli() {
        Corredor elem = null;
        if (esvacia()) {
            System.out.println("Cola Simple vacia");
        } else {
            fr++;
            elem = v[fr];
        }
        return elem;
    }

    public void mostrar() {
        ColaSimpleCorredor aux = new ColaSimpleCorredor ();
        Corredor x;
	while(!esvacia()){
            x = eli();
            x.mostrar();
            aux.adi(x);
        }
        reiniciar();
        vaciar(aux);
    }

    public void vaciar(ColaSimpleCorredor a) {
        while (!a.esvacia()) {
            adi(a.eli());
        }
    }
    
    public void reiniciar(){
        this.fi = -1;
        this.fr = -1;
    }
}
