//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Clinica {
	private LD_NormalH lh;
	private LD_NormalP lp;
	private ColaCircularC cc;  
	private PilaM pm;
	
	public Clinica(LD_NormalH lh, LD_NormalP lp, ColaCircularC cc, PilaM pm) {
		this.lh = lh;
		this.lp = lp;
		this.cc = cc;
		this.pm = pm;
	}
	public Clinica() {
		this.lh = null;
		this.lp = null;
		this.cc = null;
		this.pm = null;
	}
	public void mostrar() {
		System.out.println("\n\tLISTA DE HISTORIALES MEDICOS:");
		lh.mostrar();
		System.out.println("---------------------------------------");
		System.out.println("\n\tLISTA DE PACIENTES:");
		lp.mostrar();
		System.out.println("---------------------------------------");
		System.out.println("\n\tCOLA CIRCULAR DE CONSULTORIOS");
		cc.mostrar();
		System.out.println("---------------------------------------");
		System.out.println("\n\tPILA DE MEDICOS");
		pm.mostrar();
	}
	public LD_NormalH getLh() {
		return lh;
	}
	public void setLh(LD_NormalH lh) {
		this.lh = lh;
	}
	public LD_NormalP getLp() {
		return lp;
	}
	public void setLp(LD_NormalP lp) {
		this.lp = lp;
	}
	public ColaCircularC getCc() {
		return cc;
	}
	public void setCc(ColaCircularC cc) {
		this.cc = cc;
	}
	public PilaM getPm() {
		return pm;
	}
	public void setPm(PilaM pm) {
		this.pm = pm;
	}
	
	
}