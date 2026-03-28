/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiples.colas.pilas.restaurante;

/**
 *
 * @author inafh
 */
public class CSimpleProd {
    private int MAX=60;
    private String v[]=new String[MAX+1];
    private int fr, fi;
    
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

    public void adi(String elem) {
        if (!esllena()) {
            fi++;
            v[fi] = elem;
        } else {
            System.out.println("Cola Simple llena");
        }
    }

    public String eli() {
        String elem = null;
        if (esvacia()) {
            System.out.println("Cola Simple vacia");
        } else {
            fr++;
            elem = v[fr];
        }
        return elem;
    }

    public void mostrar() {
        CSimpleProd aux = new CSimpleProd ();
        String x;
	while(!esvacia()){
            x = eli();
            System.out.println(x);
            aux.adi(x);
        }
        reiniciar();
        vaciar(aux);
    }

    public void vaciar(CSimpleProd a) {
        while (!a.esvacia()) {
            adi(a.eli());
        }
    }
    
    public void reiniciar(){
        this.fi = -1;
        this.fr = -1;
    }
}
