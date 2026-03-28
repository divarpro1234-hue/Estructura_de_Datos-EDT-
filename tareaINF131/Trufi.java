//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Trufi {
	private Coche coche;
	private Conductor conductor;
	private Ruta ruta;
	private LS_CircularP lp;
	private LS_NormalH lh;
	
	public Trufi(Coche coche, Conductor conductor, Ruta ruta, LS_CircularP lp, LS_NormalH lh) {
		this.coche = coche;
		this.conductor = conductor;
		this.ruta = ruta;
		this.lp = lp;
		this.lh = lh;

	}
	public Trufi() {
		this.coche = null;
		this.conductor = null;
		this.ruta = null;
		this.lp = null;
		this.lh = null;;
		
	}
	public void mostrar() {
		
		coche.mostrar();
		conductor.mostrar();
		ruta.mostrar();
		lp.mostrar();
		lh.mostrar();
		System.out.println();
	}
	public Coche getCoche() {
		return coche;
	}
	public void setCoche(Coche coche) {
		this.coche = coche;
	}
	public Conductor getConductor() {
		return conductor;
	}
	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	public Ruta getRuta() {
		return ruta;
	}
	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}
	public LS_CircularP getLp() {
		return lp;
	}
	public void setLp(LS_CircularP lp) {
		this.lp = lp;
	}
	public LS_NormalH getLh() {
		return lh;
	}
	public void setLh(LS_NormalH lh) {
		this.lh = lh;
	}

}