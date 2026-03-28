import java.util.Scanner;

public class LS_CircularHec extends ListaSimpleHec {

    public LS_CircularHec() {
        super();  // Llama al constructor de la clase padre ListaSimpleMat
    }

    public boolean esVacia() {
        return P == null;  // Verifica si la lista está vacía
    }

    public int nroNodos() {
        int c = 0;
        if (P != null) {
            NodoHec R = P;
            while (R.getSig() != P) {
                c++;
                R = R.getSig();
            }
            c++;  // Para contar el último nodo
        }
        return c;
    }

    public void adiFinal(Hechizo Hechizo) {
        NodoHec nuevo = new NodoHec();
        nuevo.setHechizo(Hechizo);
        
        if (P == null) {
            P = nuevo;   // P apunta a nuevo
            P.setSig(P);
        } else {
            NodoHec R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
        }
    }

    public void adiPrincipio(Hechizo Hechizo) {
        NodoHec nuevo = new NodoHec();
        nuevo.setHechizo(Hechizo);
        if (P == null) {
            P = nuevo;
            P.setSig(P);
        } else {
            NodoHec R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
            P = nuevo;
        }
    }

    public void mostrar() {
    	NodoHec R = P;
        do {
            R.getHechizo().mostrar();
            R = R.getSig();
        } while (R != P); 
    }

    public NodoHec eliPrincipio() {
        NodoHec x = null;
        if (!esVacia()) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                x = P;     // x apunta a la raíz P
                NodoHec R = P;
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

    public NodoHec eliFinal() {
        NodoHec x = null;
        if (P != null) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                NodoHec S = null;
                NodoHec R = P;
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
        	System.out.println("Ingrese nombre Hechizo");
            String nombre = lee.next();
            String tipo = lee.next();
            Ingrediente primer = new Ingrediente();
            Ingrediente ultimo = new Ingrediente();
            primer.leer();
            ultimo.leer();
            Hechizo z = new Hechizo(nombre,tipo,primer,ultimo);  
            adiPrincipio(z);
        }
    }

    public void leer2(int n) {
        Scanner lee = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese nombre Hechizo");
            String nombre = lee.next();
            String tipo = lee.next();
            Ingrediente primer = new Ingrediente();
            Ingrediente ultimo = new Ingrediente();
            primer.leer();
            ultimo.leer();
            Hechizo z = new Hechizo(nombre,tipo,primer,ultimo);  
            adiPrincipio(z);
        }
    }
}