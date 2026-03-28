/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colasimple;

/**
 *
 * @author inafh
 */
public class ColaSimpleAli extends ColaAli{
    public ColaSimpleAli(){
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

    public void adi(Alienigena elem) {
        if (!esllena()) {
            fi++;
            v[fi] = elem;
        } else {
            System.out.println("Cola Simple llena");
        }
    }

    public Alienigena eli() {
        Alienigena elem = null;
        if (esvacia()) {
            System.out.println("Cola Simple vacia");
        } else {
            fr++;
            elem = v[fr];
        }
        return elem;
    }

    public void mostrar() {
        ColaSimpleAli aux = new ColaSimpleAli ();
        Alienigena x;
	while(!esvacia()){
            x = eli();
            x.mostrar();
            aux.adi(x);
        }
        reiniciar();
        vaciar(aux);
    }

    public void vaciar(ColaSimpleAli a) {
        while (!a.esvacia()) {
            adi(a.eli());
        }
    }
    
    public void reiniciar(){
        this.fi = -1;
        this.fr = -1;
    }
}
