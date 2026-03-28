public class LS_CircularMat extends ListaSimpleMat {

    public LS_CircularMat() {
        super();  // Constructor de la clase padre ListaSimpleEst
    }

    public boolean esVacia() {
        return P == null;   // Lista vacía
    }

    public int nroNodos() {
    	int c = 0;
		if(P != null) {
			NodoMat R = P;
			while(R.getSig() != P) {
				c++;
				R = R.getSig();
			}
			c++;  //para contar el ultimo nodo
		}
		return c;
    }

    public void adiFinal(Materia z) {
        NodoMat nuevo = new NodoMat();
        nuevo.setQ(z);

        if (P == null) {
            P = nuevo;   // La lista está vacía, el nuevo nodo se convierte en el primer nodo
            P.setSig(P); // Apunta a sí mismo
        } else {
            NodoMat R = P;
            while (R.getSig() != P) {
                R = R.getSig();  // Recorre hasta el último nodo
            }
            R.setSig(nuevo);  // El último nodo ahora apunta al nuevo nodo
            nuevo.setSig(P);  // El nuevo nodo apunta al primero (cierra el ciclo)
        }
    }

    public void adiPrincipio(Materia z) {
    	NodoMat nuevo = new NodoMat();
		nuevo.setQ(z);


		if(P == null) {
			P = nuevo;
			P.setSig(P);
		}else {
			NodoMat R = P;
			while(R.getSig() != P) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setSig(P);
			P = nuevo;
		}
    }

    public void mostrar() {
        if (P == null) {
            System.out.println("Lista vacía");
            return;
        }

        NodoMat R = P;
        do {
            R.getQ().mostrar();  // Asumo que el método mostrar de Materia muestra su información
            R = R.getSig();
        } while (R != P);  // Condición de parada: cuando volvemos al nodo inicial
    }


    public NodoMat eliPrincipio() {
        NodoMat x = null;
        if (!esVacia()) {
            if (P.getSig() == P) {  // Si hay un solo nodo
                x = P;
                P = null;
            } else {
                x = P;
                NodoMat R = P;
                while (R.getSig() != P) {  // Busca el último nodo
                    R = R.getSig();
                }
                P = P.getSig();  // Mueve P al siguiente nodo
                R.setSig(P);     // Cierra la lista circular
            }
            x.setSig(null);  // Desconecta el nodo eliminado
        }
        return x;
    }


    public NodoMat eliFinal() {
        NodoMat x = null;
        if (P != null) {
            if (P.getSig() == P) {  // Si hay un solo nodo
                x = P;
                P = null;
            } else {
                NodoMat R = P;
                NodoMat S = null;
                while (R.getSig() != P) {
                    S = R;
                    R = R.getSig();
                }
                x = R;         // R apunta al último nodo
                S.setSig(P);   // Cierra el ciclo
                x.setSig(null);  // Desconecta el nodo eliminado
            }
        }
        return x;
    }

}