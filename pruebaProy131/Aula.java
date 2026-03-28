
public class Aula {
	
	private String idAula;
	private int capacidad;
	private String tipoAula;
	private PilaEqui pe;
	private ColaSimpleEst cse;
	private LS_NormalHorario lh;
	
	public Aula(String idAula, int capacidad, String tipoAula, PilaEqui pe, ColaSimpleEst cse, LS_NormalHorario lh) {
		
		this.idAula = idAula;
		this.capacidad = capacidad;
		this.tipoAula = tipoAula;
		this.pe = pe;
		this.cse = cse;
		this.lh = lh;
	}

	public Aula() {
		this.idAula = "";
		this.capacidad = 0;
		this.tipoAula = "";
		this.pe = null;
		this.cse = null;
		this.lh = null;
	}
	
	public void mostrar() {
		System.out.println();
		System.out.println("\tdatos del aula");
		System.out.println("idAula: "+ idAula);
		System.out.println("cantidad de Sustos: " + capacidad);
		System.out.println("nivel energia: " + tipoAula);
		pe.mostrar();
		cse.mostrar();
		lh.mostrar();
	}

}
