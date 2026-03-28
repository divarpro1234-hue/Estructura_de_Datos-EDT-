//Lic Aruquipa Marcelo
public class Principal {

	public static void main(String[] args) {
		//departamentos
		
		Departamento d1 = new Departamento(1, "la paz", 1000, "evo", 200000);
		Departamento d2 = new Departamento(2, "santa cruz", 2000, "catacora", 1000000);
		Departamento d3 = new Departamento(3, "cochabamba", 1500, "choque", 900000);
		Departamento d4 = new Departamento(4, "tarija", 900, "pablo", 800000);
		Departamento d5 = new Departamento(5, "pando", 500, "daniel", 700000);
		Departamento d6 = new Departamento(6, "beni", 1100, "arias", 600000);
		Departamento d7 = new Departamento(7, "oruro", 800, "fernando", 500000);
		Departamento d8 = new Departamento(8, "chuquisaca", 500, "armando", 800000);
		Departamento d9 = new Departamento(9, "potosi", 600, "eva copa", 400000);
		
		LD_NormalDep ldep = new LD_NormalDep();
		ldep.adiFinal(d1);
		ldep.adiFinal(d2);
		ldep.adiFinal(d3);
		ldep.adiFinal(d4);
		ldep.adiFinal(d5);
		ldep.adiFinal(d6);
		ldep.adiFinal(d7);
		ldep.adiFinal(d8);
		ldep.adiFinal(d9);
		System.out.println("\n\tDATOS DE LA LISTA DEP");
		ldep.mostrar();
		mostrarDepartamentosMenorprom(ldep);
	}
	static void mostrarDepartamentosMenorprom(LD_NormalDep ldep) {
	    NodoDep R = ldep.getP(); 
	    int sumaP = 0;
	    int cant = 0;
	    while (R != null) {
	        sumaP += R.getDep().getPoblacion();
	        cant++;
	        R = R.getSig();
	    }
	    int prom = sumaP / cant;
	    System.out.println("\nDepartamentos con población menor al promedio (" + prom + "):");
	    R = ldep.getP(); 
	    boolean encontrado = false;
	    while (R != null) {
	        Departamento dep = R.getDep();
	        if (dep.getPoblacion() < prom) {
	            System.out.println("Departamento: " + dep.getNombre() + ", Gobernador: " + dep.getGobernador());
	            encontrado = true;
	        }
	        R = R.getSig();
	    }
	    if (!encontrado) {
	        System.out.println("No hay departamentos con población menor al promedio.");
	    }
	}

}













