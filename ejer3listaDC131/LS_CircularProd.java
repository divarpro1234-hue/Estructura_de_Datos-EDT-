import java.util.Scanner;

public class LS_CircularProd extends ListaSimpleProd {

    public LS_CircularProd() {
        super();  // Llama al constructor de la clase padre ListaSimpleMat
    }

    public boolean esVacia() {
        return P == null;  // Verifica si la lista está vacía
    }

    public int nroNodos() {
        int c = 0;
        if (P != null) {
            NodoProd R = P;
            while (R.getSig() != P) {
                c++;
                R = R.getSig();
            }
            c++;  // Para contar el último nodo
        }
        return c;
    }

    public void adiFinal(Producto Prod) {
        NodoProd nuevo = new NodoProd();
        nuevo.setProd(Prod);
        
        if (P == null) {
            P = nuevo;   // P apunta a nuevo
            P.setSig(P);
        } else {
            NodoProd R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
        }
    }

    public void adiPrincipio(Producto Prod) {
        NodoProd nuevo = new NodoProd();
        nuevo.setProd(Prod);
        if (P == null) {
            P = nuevo;
            P.setSig(P);
        } else {
            NodoProd R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
            P = nuevo;
        }
    }

    public void mostrar() {
    	NodoProd R = P;
        do {
            R.getProd().mostrar();
            R = R.getSig();
        } while (R != P); 
    }

    public NodoProd eliPrincipio() {
        NodoProd x = null;
        if (!esVacia()) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                x = P;     // x apunta a la raíz P
                NodoProd R = P;
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

    public NodoProd eliFinal() {
        NodoProd x = null;
        if (P != null) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                NodoProd S = null;
                NodoProd R = P;
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
//        	System.out.println("Ingrese nombre Prod");
//            String Prod = lee.next();
//            Idioma v = new Idioma(); // Crea un objeto Materia
//            v.leer();
//            Prod z = new Prod(Prod, v);  
//            adiPrincipio(z);
//        }
//    }
//
//    public void leer2(int n) {
//        Scanner lee = new Scanner(System.in);
//        for (int i = 1; i <= n; i++) {
//            System.out.println("Ingrese nombre Prod");
//            String Prod = lee.next();
//            Idioma v = new Idioma(); // Crea un objeto Materia
//            v.leer();
//            Prod z = new Prod(Prod, v);  
//            adiPrincipio(z);
//        }
//    }
}