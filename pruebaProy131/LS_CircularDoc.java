import java.util.Scanner;

public class LS_CircularDoc extends ListaSimpleDoc {

    public LS_CircularDoc() {
        super();  // Llama al constructor de la clase padre ListaSimpleMat
    }

    public boolean esVacia() {
        return P == null;  // Verifica si la lista está vacía
    }

    public int nroNodos() {
        int c = 0;
        if (P != null) {
            NodoDoc R = P;
            while (R.getSig() != P) {
                c++;
                R = R.getSig();
            }
            c++;  // Para contar el último nodo
        }
        return c;
    }

    public void adiFinal(Docente z) {
        NodoDoc nuevo = new NodoDoc();
        nuevo.setDato(z);
        
        if (P == null) {
            P = nuevo;   // P apunta a nuevo
            P.setSig(P);
        } else {
            NodoDoc R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
        }
    }

    public void adiPrincipio(Docente z) {
        NodoDoc nuevo = new NodoDoc();
        nuevo.setDato(z);
        if (P == null) {
            P = nuevo;
            P.setSig(P);
        } else {
            NodoDoc R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
            P = nuevo;
        }
    }

    public void mostrar() {
    	NodoDoc R = P;
        do {
            R.getDato().mostrar();
            R = R.getSig();
        } while (R != P); 
    }

    public NodoDoc eliPrincipio() {
        NodoDoc x = null;
        if (!esVacia()) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                x = P;     // x apunta a la raíz P
                NodoDoc R = P;
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

    public NodoDoc eliFinal() {
        NodoDoc x = null;
        if (P != null) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                NodoDoc S = null;
                NodoDoc R = P;
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
//        	System.out.println("Ingrese nombre Ce");
//            String Ce = lee.next();
//            Idioma v = new Idioma(); // Crea un objeto Materia
//            v.leer();
//            Ce z = new Ce(Ce, v);  
//            adiPrincipio(z);
//        }
//    }
//
//    public void leer2(int n) {
//        Scanner lee = new Scanner(System.in);
//        for (int i = 1; i <= n; i++) {
//            System.out.println("Ingrese nombre Ce");
//            String Ce = lee.next();
//            Idioma v = new Idioma(); // Crea un objeto Materia
//            v.leer();
//            Ce z = new Ce(Ce, v);  
//            adiPrincipio(z);
//        }
//    }
}