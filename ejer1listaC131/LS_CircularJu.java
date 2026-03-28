import java.util.Scanner;

public class LS_CircularJu extends ListaSimpleJu {

    public LS_CircularJu() {
        super();  // Llama al constructor de la clase padre ListaSimpleMat
    }

    public boolean esVacia() {
        return P == null;  // Verifica si la lista está vacía
    }

    public int nroNodos() {
        int c = 0;
        if (P != null) {
            NodoJu R = P;
            while (R.getSig() != P) {
                c++;
                R = R.getSig();
            }
            c++;  // Para contar el último nodo
        }
        return c;
    }

    public void adiFinal(Jugador Jug) {
        NodoJu nuevo = new NodoJu();
        nuevo.setJug(Jug);
        
        if (P == null) {
            P = nuevo;   // P apunta a nuevo
            P.setSig(P);
        } else {
            NodoJu R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
        }
    }

    public void adiPrincipio(Jugador Jug) {
        NodoJu nuevo = new NodoJu();
        nuevo.setJug(Jug);
        if (P == null) {
            P = nuevo;
            P.setSig(P);
        } else {
            NodoJu R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
            P = nuevo;
        }
    }

    public void mostrar() {
    	NodoJu R = P;
        do {
            R.getJug().mostrar();
            R = R.getSig();
        } while (R != P); 
    }

    public NodoJu eliPrincipio() {
        NodoJu x = null;
        if (!esVacia()) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                x = P;     // x apunta a la raíz P
                NodoJu R = P;
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

    public NodoJu eliFinal() {
        NodoJu x = null;
        if (P != null) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                NodoJu S = null;
                NodoJu R = P;
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

//    public void leer1(int n) {
//        Scanner lee = new Scanner(System.in);
//        for (int i = 1; i <= n; i++) {
//        	System.out.println("Ingrese nombre Jug");
//            String Jug = lee.next();
//            Idioma v = new Idioma(); // Crea un objeto Materia
//            v.leer();
//            Jug z = new Jug(Jug, v);  
//            adiPrincipio(z);
//        }
//    }
//
//    public void leer2(int n) {
//        Scanner lee = new Scanner(System.in);
//        for (int i = 1; i <= n; i++) {
//            System.out.println("Ingrese nombre Jug");
//            String Jug = lee.next();
//            Idioma v = new Idioma(); // Crea un objeto Materia
//            v.leer();
//            Jug z = new Jug(Jug, v);  
//            adiPrincipio(z);
//        }
//    }
}