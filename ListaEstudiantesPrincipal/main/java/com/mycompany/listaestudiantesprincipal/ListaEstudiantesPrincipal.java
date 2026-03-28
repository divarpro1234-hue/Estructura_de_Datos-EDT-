/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listaestudiantesprincipal;

/**
 *
 * @author Fabricio
 */
public class ListaEstudiantesPrincipal {

    public static void main(String[] args) {
    
       
       LS_CircularMat lmat = new LS_CircularMat();

       
        Materia m1 = new Materia("MAT101", "Matemáticas", "A", "Dr. Pérez");
        Materia m2 = new Materia("FIS102", "Física", "B", "Ing. Ramírez");
        Materia m3 = new Materia("QUI103", "Química", "C", "Lic. López");
        Materia m4 = new Materia("BIO104", "Biología", "A", "Msc. Gómez");
        Materia m5 = new Materia("INF105", "Informática", "B", "Ing. Torres");

      
        m1.getLe().adiFinal(crearEstudiante("123", "RU001", "Pérez", "López", "Juan"));
        m2.getLe().adiFinal(crearEstudiante("124", "RU002", "García", "Martínez", "Ana"));
        m3.getLe().adiFinal(crearEstudiante("125", "RU003", "Fernández", "González", "Carlos"));
        m4.getLe().adiFinal(crearEstudiante("126", "RU004", "Torres", "Rodríguez", "María"));
        m5.getLe().adiFinal(crearEstudiante("127", "RU005", "Ramírez", "Vargas", "Pedro"));

       
        lmat.adiFinal(m1);
        lmat.adiFinal(m2);
        lmat.adiFinal(m3);
        lmat.adiFinal(m4);
        lmat.adiFinal(m5);

        // Mostrar materias con estudiantes
        lmat.mostrar();

        // Llamar métodos de ejemplo
        mostrarEstMat(lmat, "MAT101");  /
        mostrarMatEst(lmat, 125);       
        mostrarMatMayEst(lmat);         
    }

    public static void mostrarEstMat(LS_CircularMat lmat, String siglax) {
        int nd = lmat.nroNodos();
        NodoMat R = lmat.getP();
        for (int i = 1; i <= nd; i++) {
            Materia m = R.getMat();
            if (m.getSigla().equals(siglax)) {
                LS_NormalEst e = m.getLe();
                e.mostrar();
            }
            R = R.getSig();
        }
    }

    public static void mostrarMatEst(LS_CircularMat lmat, int cix) {
        int nd = lmat.nroNodos();
        NodoMat R = lmat.getP();
        for (int i = 1; i <= nd; i++) {
            Materia m = R.getMat();
            if (buscarEstCi(m.getLe(), cix)) {
                System.out.println("Materia: " + m.getSigla() + " - " + m.getNombre());
            }
            R = R.getSig();
        }
    }

    public static boolean buscarEstCi(LS_NormalEst le, int cix) {
        NodoEst R = le.getP();
        while (R != null) {
            if (Integer.parseInt(R.getCi()) == cix) {
                return true;
            }
            R = R.getSig();
        }
        return false;
    }

    public static void mostrarMatMayEst(LS_CircularMat lmat) {
        int may = mayorNroEst(lmat);
        NodoMat R = lmat.getP();
        int nd = lmat.nroNodos();
        for (int i = 1; i <= nd; i++) {
            Materia m = R.getMat();
            if (may == m.getLe().nroNodos()) {
                System.out.println("Materia con más estudiantes: " + m.getSigla());
            }
            R = R.getSig();
        }
    }

    public static int mayorNroEst(LS_CircularMat lmat) {
        int may = 0;
        NodoMat R = lmat.getP();
        int nd = lmat.nroNodos();
        for (int i = 1; i <= nd; i++) {
            Materia m = R.getMat();
            LS_NormalEst le = m.getLe();
            if (le.nroNodos() > may) {
                may = le.nroNodos();
            }
            R = R.getSig();
        }
        return may;
    }

    public static NodoEst crearEstudiante(String ci, String ru, String pat, String mat, String nom) {
        NodoEst estudiante = new NodoEst();
        estudiante.setCi(ci);
        estudiante.setRu(ru);
        estudiante.setPat(pat);
        estudiante.setMat(mat);
        estudiante.setNom(nom);
        return estudiante;
    }
}

