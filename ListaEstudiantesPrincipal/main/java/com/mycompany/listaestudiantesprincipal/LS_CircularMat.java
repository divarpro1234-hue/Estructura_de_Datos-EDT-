package com.mycompany.listaestudiantesprincipal;

public class LS_CircularMat extends ListaSimpleMat {

    public LS_CircularMat() {
        super();  
    }

    public boolean esVacia() {
        return P == null; 
    }

    public int nroNodos() {
        int c = 0;
        if (P != null) {
            NodoMat R = P;
            do {
                c++;
                R = R.getSig();
            } while (R != P);
        }
        return c;
    }

    public void adiFinal(Materia mat) {
        NodoMat nuevo = new NodoMat();
        nuevo.setNom(mat.getNombre()); 

        if (P == null) {
            P = nuevo;  
            P.setSig(P); 
        } else {
            NodoMat R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P); 
        }
    }

    public void adiPrincipio(Materia mat) {
        NodoMat nuevo = new NodoMat();
        nuevo.setNom(mat.getNombre());

        if (P == null) {
            P = nuevo;
            P.setSig(P); 
        } else {
            NodoMat R = P;
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
            NodoMat R = P;   
            do {
                System.out.println(R.getNom()); 
                R = R.getSig();
            } while (R != P);
        }
    }

    public NodoMat eliPrincipio() {
        NodoMat x = null;    
        if (!esVacia()) {
            if (P.getSig() == P) { 
                x = P;
                P = null; 
            } else {
                x = P;    
                NodoMat R = P;
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

    public NodoMat eliFinal() {
        NodoMat x = null;
        if (P != null) {
            if (P.getSig() == P) { 
                x = P; 
                P = null; 
            } else {
                NodoMat S = P; 
                NodoMat R = P; 
                while (R.getSig() != P) {
                    S = R;         
                    R = R.getSig(); 
                }
                x = R; 
                S.setSig(P); 
            }
        }
        return x;
    }
}
