
public class SuperHeroe {
	
	private String nombre;
	private String alias;
	private int nroComicComp;
	private int nivPoder;
	private String equipo;
	
	public SuperHeroe(String nombre, String alias, int nroComicComp, int nivPoder, String equipo) {
		
		this.nombre = nombre;
		this.alias = alias;
		this.nroComicComp = nroComicComp;
		this.nivPoder = nivPoder;
		this.equipo = equipo;
	}

	public SuperHeroe() {
		this.nombre = "";
		this.alias = "";
		this.nroComicComp = 0;
		this.nivPoder = 0;
		this.equipo = "";
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public int getNroComicComp() {
		return nroComicComp;
	}

	public void setNroComicComp(int nroComicComp) {
		this.nroComicComp = nroComicComp;
	}

	public int getNivPoder() {
		return nivPoder;
	}

	public void setNivPoder(int nivPoder) {
		this.nivPoder = nivPoder;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public void mostrar() {
		System.out.println();
		System.out.println("nombre: "+ nombre);
		System.out.println("alias: " + alias);
		System.out.println("nro comic comprado: " + nroComicComp);
		System.out.println("nivel de Poder: " + nivPoder);
		System.out.println("equipo: " + equipo);
		
	}

}
