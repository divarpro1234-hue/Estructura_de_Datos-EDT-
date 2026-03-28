import java.util.Scanner;

public class LS_CircularMag extends ListaSimpleMag {

    public LS_CircularMag() {
        super();  // Llama al constructor de la clase padre ListaSimpleMat
    }

    public boolean esVacia() {
        return P == null;  // Verifica si la lista está vacía
    }

    public int nroNodos() {
        int c = 0;
        if (P != null) {
            NodoMag R = P;
            while (R.getSig() != P) {
                c++;
                R = R.getSig();
            }
            c++;  // Para contar el último nodo
        }
        return c;
    }

    public void adiFinal(Mago mago) {
        NodoMag nuevo = new NodoMag();
        nuevo.setMago(mago);

        if (P == null) {
            // La lista está vacía, así que el nuevo nodo es el único nodo y se apunta a sí mismo
            P = nuevo;
            P.setSig(P);
        } else {
            // La lista tiene al menos un nodo, así que recorremos hasta el último
            NodoMag R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            // Ahora, R está en el último nodo, por lo que ajustamos los punteros
            R.setSig(nuevo);
            nuevo.setSig(P);
        }
    }


    public void adiPrincipio(Mago mago) {
        NodoMag nuevo = new NodoMag();
        nuevo.setMago(mago);
        if (P == null) {
            P = nuevo;
            P.setSig(P);
        } else {
            NodoMag R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
            P = nuevo;
        }
    }

    public void mostrar() {
    	NodoMag R = P;
        do {
            R.getMago().mostrar();
            R = R.getSig();
        } while (R != P); 
    }

    public NodoMag eliPrincipio() {
        NodoMag x = null;
        if (!esVacia()) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                x = P;     // x apunta a la raíz P
                NodoMag R = P;
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

    public NodoMag eliFinal() {
        NodoMag x = null;
        if (P != null) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                NodoMag S = null;
                NodoMag R = P;
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
        	System.out.println("Ingrese nombre Mago");
            String nombre = lee.next();
            String nomHechizoFav= lee.next();
            
            Mago z = new Mago(nombre, nomHechizoFav);  
            adiPrincipio(z);
        }
    }

    public void leer2(int n) {
        Scanner lee = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese nombre Mago");
            String nombre = lee.next();
            String nomHechizoFav= lee.next();
            
            Mago z = new Mago(nombre, nomHechizoFav);  
            adiPrincipio(z);
        }
    }
}