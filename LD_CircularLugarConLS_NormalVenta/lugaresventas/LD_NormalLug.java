package lugaresventas;
import java.util.Scanner;

public class LD_NormalLug extends ListaDobleLug{
    
   public LD_NormalLug() {
        super(); 
    }

    public boolean esVacia() {
        return P == null;
    }

    // Método para contar el número de nodos en la lista
    public int nroNodos() {
        int contador = 0;
        NodoLug actual = P;
        while (actual != null) {
            contador++;
            actual = actual.sig;
        }
        return contador;
    }

    // Método para mostrar todos los proyectos en la lista
    public void mostrar() {
        if (esVacia()) {
            System.out.println("La lista está vacía.");
        } else {
            NodoLug actual = P;
            while (actual != null) {
                System.out.println("\n+--- "+actual.getLugar()+"---+");
                System.out.println("\n---Costo del lugar: "+actual.getCosto()+"$");
                System.out.println("Equipo \t Nombre");
                actual.getLV().mostrar();
                actual = actual.sig;
            }
        }
    }

    // Método para añadir un proyecto al inicio de la lista
    public void adiPrimero(String l, int c, LS_CircularVenta v) {
        NodoLug nuevo = new NodoLug();
        nuevo.setLugar(l);
        nuevo.setCosto(c);
        if (esVacia()) {
            P = nuevo;
        } else {
            nuevo.sig = P;
            P.ant = nuevo;
            P = nuevo;
        }
    }

    // Método para añadir un proyecto al final de la lista
    public void adiFinal(String l, int c, LS_CircularVenta v) {
        NodoLug nuevo = new NodoLug();
        nuevo.setLugar(l);
        nuevo.setCosto(c);
        nuevo.setLV(v);
        if (esVacia()) {
            P = nuevo;
        } else {
            NodoLug actual = P;
            while (actual.sig != null) {
                actual = actual.sig;
            }
            actual.sig = nuevo;
            nuevo.ant = actual;
        }
    }

    // Método para eliminar el primer nodo de la lista
    public void eliPrimero() {
        if (!esVacia()) {
            if (P.sig == null) {
                P = null;
            } else {
                P = P.sig;
                P.ant = null;
            }
        }
    }

    // Método para eliminar el último nodo de la lista
    public void eliFinal() {
        if (!esVacia()) {
            if (P.sig == null) {
                P = null;
            } else {
                NodoLug actual = P;
                while (actual.sig != null) {
                    actual = actual.sig;
                }
                actual.ant.sig = null;
            }
      }
    }
    public void leer1(int n)
    {Scanner lec=new Scanner(System.in);
     String s;
     int k;
     for(int i = 1; i <= n; i++){
    	 LS_CircularVenta z = new LS_CircularVenta();
         System.out.println("Nombre de la Materia: ");
          s=lec.next();
          k=lec.nextInt();
          z.leer1(k);
          adiPrimero(s, k, null);
     }
    }
}
