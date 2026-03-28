import java.util.Scanner;

public class LS_CircularP extends ListaSimpleP {

    public LS_CircularP() {
        super();  // Llama al constructor de la clase padre ListaSimpleMat
    }

    public boolean esVacia() {
        return P == null;  // Verifica si la lista está vacía
    }

    public int nroNodos() {
        int c = 0;
        if (P != null) {
            NodoP R = P;
            while (R.getSig() != P) {
                c++;
                R = R.getSig();
            }
            c++;  // Para contar el último nodo
        }
        return c;
    }

    public void adiFinal(Pais Pais) {
        NodoP nuevo = new NodoP();
        nuevo.setPais(Pais);
        
        if (P == null) {
            P = nuevo;   // P apunta a nuevo
            P.setSig(P);
        } else {
            NodoP R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
        }
    }

    public void adiPrincipio(Pais Pais) {
        NodoP nuevo = new NodoP();
        nuevo.setPais(Pais);
        if (P == null) {
            P = nuevo;
            P.setSig(P);
        } else {
            NodoP R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
            P = nuevo;
        }
    }

    public void mostrar() {
    	NodoP R = P;
        do {
            R.getPais().mostrar();
            R = R.getSig();
        } while (R != P); 
    }

    public NodoP eliPrincipio() {
        NodoP x = null;
        if (!esVacia()) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                x = P;     // x apunta a la raíz P
                NodoP R = P;
                while (R.getSig() != P) {
                    R = R.getSig();
                }
                P = P.getSig();
                R.setSig(P);
                x.setSig(null);
            }
        }
        return x;
    }

    public NodoP eliFinal() {
        NodoP x = null;
        if (P != null) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                NodoP S = null;
                NodoP R = P;
                while (R.getSig() != P) {
                    S = R;
                    R = R.getSig();
                }
                x = R;
                x.setSig(null);
                S.setSig(P);
            }
        }
        return x;
    }

    public void leer1(int n) {
        Scanner lee = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
        	System.out.println("Ingrese nombre pais");
            String pais = lee.next();
            Idioma v = new Idioma(); // Crea un objeto Materia
            v.leer();
            Pais z = new Pais(pais, v);  
            adiPrincipio(z);
        }
    }

    public void leer2(int n) {
        Scanner lee = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese nombre pais");
            String pais = lee.next();
            Idioma v = new Idioma(); // Crea un objeto Materia
            v.leer();
            Pais z = new Pais(pais, v);  
            adiPrincipio(z);
        }
    }
}