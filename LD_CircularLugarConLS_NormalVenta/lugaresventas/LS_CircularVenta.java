package lugaresventas;
import java.util.Scanner;

public class LS_CircularVenta extends ListaSimpleVenta {

    public LS_CircularVenta() {
        super();  // Llama al constructor de la clase padre ListaSimpleMat
    }

    public boolean esVacia() {
        return P == null;  // Verifica si la lista está vacía
    }

    public int nroNodos() {
        int c = 0;
        if (P != null) {
            NodoV R = P;
            while (R.getSig() != P) {
                c++;
                R = R.getSig();
            }
            c++;  // Para contar el último nodo
        }
        return c;
    }

    public void adiFinal(Venta venta) {
        NodoV nuevo = new NodoV();
        nuevo.setVenta(venta);
        
        if (P == null) {
            P = nuevo;   // P apunta a nuevo
            P.setSig(P);
        } else {
            NodoV R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
        }
    }

    public void adiPrincipio(Venta venta) {
        NodoV nuevo = new NodoV();
        nuevo.setVenta(venta);
        if (P == null) {
            P = nuevo;
            P.setSig(P);
        } else {
            NodoV R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
            P = nuevo;
        }
    }

    public void mostrar() {
        if (!esVacia()) {
            NodoV R = P;   // R apunta a la raíz P
            while (R.getSig() != P) {
                System.out.println(R.getVenta().getEquipo() + " - " + R.getVenta().getCliente());
                R = R.getSig();
            }
            System.out.println(R.getVenta().getEquipo() + " - " + R.getVenta().getCliente());
        } else {
            System.out.println("La lista está vacía.");
        }
    }

    public NodoV eliPrincipio() {
        NodoV x = null;
        if (!esVacia()) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                x = P;     // x apunta a la raíz P
                NodoV R = P;
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

    public NodoV eliFinal() {
        NodoV x = null;
        if (P != null) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                NodoV S = null;
                NodoV R = P;
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
            System.out.println("Ingrese sigla - nombre");
            String equi = lee.next();
            String cli = lee.next();
            Venta v = new Venta(equi, cli);  // Crea un objeto Materia
            adiFinal(v);
        }
    }

    public void leer2(int n) {
        Scanner lee = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese sigla - nombre");
            String equi = lee.next();
            String cli = lee.next();
            Venta v = new Venta(equi, cli);  // Crea un objeto Materia
            adiPrincipio(v);
        }
    }
}