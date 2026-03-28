
public class Sistema {
	
	private ColaSimpleAula csa;
	private LS_CircularDoc ldoc;
	private ColaSimpleEst cse;
	
	public Sistema(ColaSimpleAula csa, LS_CircularDoc ldoc, ColaSimpleEst cse) {
		
		this.csa = csa;
		this.ldoc = ldoc;
		this.cse = cse;
	}

	public Sistema() {
		this.csa = null;
		this.ldoc = null;
		this.cse = null;
	}

	public void mostrar() {
		System.out.println();
		csa.mostrar();
		ldoc.mostrar();
		cse.mostrar();
	}

}
