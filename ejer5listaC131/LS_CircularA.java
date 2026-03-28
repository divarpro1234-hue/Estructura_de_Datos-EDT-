import java.util.Scanner;

public class LS_CircularA extends ListaSimpleA {

    public LS_CircularA() {
        super();  // Llama al constructor de la clase padre ListaSimpleMat
    }

    public boolean esVacia() {
        return P == null;  // Verifica si la lista está vacía
    }

    public int nroNodos() {
        int c = 0;
        if (P != null) {
            NodoA R = P;
            while (R.getSig() != P) {
                c++;
                R = R.getSig();
            }
            c++;  // Para contar el último nodo
        }
        return c;
    }

    public void adiFinal(Avion Av) {
        NodoA nuevo = new NodoA();
        nuevo.setAv(Av);
        
        if (P == null) {
            P = nuevo;   // P apunta a nuevo
            P.setSig(P);
        } else {
            NodoA R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
        }
    }

    public void adiPrincipio(Avion Av) {
        NodoA nuevo = new NodoA();
        nuevo.setAv(Av);
        if (P == null) {
            P = nuevo;
            P.setSig(P);
        } else {
            NodoA R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
            P = nuevo;
        }
    }

    public void mostrar() {
    	NodoA R = P;
        do {
            R.getAv().mostrar();
            R = R.getSig();
        } while (R != P); 
    }

    public NodoA eliPrincipio() {
        NodoA x = null;
        if (!esVacia()) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                x = P;     // x apunta a la raíz P
                NodoA R = P;
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

    public NodoA eliFinal() {
        NodoA x = null;
        if (P != null) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                NodoA S = null;
                NodoA R = P;
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
//        	System.out.println("Ingrese nombre Av");
//            String Av = lee.next();
//            Idioma v = new Idioma(); // Crea un objeto Materia
//            v.leer();
//            Av z = new Av(Av, v);  
//            adiPrincipio(z);
//        }
//    }
//
//    public void leer2(int n) {
//        Scanner lee = new Scanner(System.in);
//        for (int i = 1; i <= n; i++) {
//            System.out.println("Ingrese nombre Av");
//            String Av = lee.next();
//            Idioma v = new Idioma(); // Crea un objeto Materia
//            v.leer();
//            Av z = new Av(Av, v);  
//            adiPrincipio(z);
//        }
//    }
}