public class Main {

    public static void main(String[] args) {
    	//listaestudiante
    	LS_NormalEst l1 = new LS_NormalEst();
    	l1.adiFinal(66671, 12, "ap", "am", "alanbrito");
    	l1.adiFinal(66672, 12, "ap", "am", "elva");
    	l1.adiFinal(6674, 12, "ap", "am", "daniel");
    	l1.adiFinal(6673, 12, "ap", "am", "saul");
    	
    	LS_NormalEst l2 = new LS_NormalEst();
    	l2.adiFinal(66671, 12, "ap", "am", "nom");
    	l2.adiFinal(66672, 12, "ap", "am", "nom");
    	l2.adiFinal(6674, 12, "ap", "am", "nom");
    	l2.adiFinal(6673, 12, "ap", "am", "nom");
    	
        // Crear lista circular de materias
        LS_CircularMat lmat = new LS_CircularMat();

        // Crear materias con estudiantes predefinidos
        Materia m1 = new Materia("inf-121", "Matemáticas", "A", "Dr. Pérez", l1);
        Materia m2 = new Materia("FIS102", "Física", "B", "Ing. Ramírez", l2);
//        Materia m2 = new Materia("FIS102", "Física", "B", "Ing. Ramírez");
//        Materia m3 = new Materia("QUI103", "Química", "C", "Lic. López");
//        Materia m4 = new Materia("BIO104", "Biología", "A", "Msc. Gómez");
//        Materia m5 = new Materia("INF105", "Informática", "B", "Ing. Torres");
       lmat.adiFinal(m1);
       lmat.adiFinal(m2);
       lmat.mostrar();
        // Añadir estudiantes a las materias
//        m1.getLe().adiFinal(crearEstudiante("123", "RU001", "Pérez", "López", "Juan"));
//        m2.getLe().adiFinal(crearEstudiante("124", "RU002", "García", "Martínez", "Ana"));
//        m3.getLe().adiFinal(crearEstudiante("125", "RU003", "Fernández", "González", "Carlos"));
//        m4.getLe().adiFinal(crearEstudiante("126", "RU004", "Torres", "Rodríguez", "María"));
//        m5.getLe().adiFinal(crearEstudiante("127", "RU005", "Ramírez", "Vargas", "Pedro"));
       //a)
       String siglax="inf-121";
       mostrarEstMat(lmat, siglax);
       //b)
    int cix = 66671;
   	mostrarMatEst(lmat, cix);	
   	//c)
   	mostrarMatMayEst(lmat);
    }

    public static void mostrarEstMat(LS_CircularMat lmat, String siglax) {
        int nd = lmat.nroNodos();
        NodoMat R = lmat.getP();
        for (int i = 1; i <= nd; i++) {
            Materia m = R.getQ();
            if (m.getSigla().equalsIgnoreCase(siglax)) {
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
            Materia m = R.getQ();
            if (buscarEstCi(m.getLe(), cix)) {
                System.out.println("Materia: " + m.getSigla() + " - " + m.getNombre());
            }
            R = R.getSig();
        }
    }

    public static boolean buscarEstCi(LS_NormalEst le, int cix) {
        NodoEst R = le.getP();
        while (R != null) {
            if (R.getCi() == cix) {
                return true;
            }
            R = R.getSig();
        }
        return true;
    }

    public static void mostrarMatMayEst(LS_CircularMat lmat) {
        int may = mayorNroEst(lmat);
        NodoMat R = lmat.getP();
        int nd = lmat.nroNodos();
        for (int i = 1; i <= nd; i++) {
            Materia m = R.getQ();
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
            Materia m = R.getQ();
            LS_NormalEst le = m.getLe();
            if (le.nroNodos() > may) {
                may = le.nroNodos();
            }
            R = R.getSig();
        }
        return may;
    }

}