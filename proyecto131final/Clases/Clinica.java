//Lic Aruquipa Marcelo
package Clases;
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
	public void llenar() {
		LD_NormalSM lsm1 = new LD_NormalSM();
		lsm1.adiFinal(new SeguimientoMedico("una vez por semana", "mejor"));
		lsm1.adiFinal(new SeguimientoMedico("una vez al año", "normal"));
		
		LD_NormalSM lsm2 = new LD_NormalSM();
		lsm2.adiFinal(new SeguimientoMedico("dos veces a la semana", "mejor"));
		lsm2.adiFinal(new SeguimientoMedico("una vez a la semana", "mejor"));
		
		LD_NormalSM lsm3 = new LD_NormalSM();
		lsm3.adiFinal(new SeguimientoMedico("una vez por semana", "normal"));
		lsm3.adiFinal(new SeguimientoMedico("una vez al año", "mejor"));
		
		LD_NormalD ld1 = new LD_NormalD();
		ld1.adiFinal(new Diagnostico("012355", "dolor de pecho", "hidratarse con liquido", "12/02/2024", lsm1));
		ld1.adiFinal(new Diagnostico("012365", "dolor de muñeca", "reposo", "12/06/2024", lsm2));
		
		LD_NormalD ld2 = new LD_NormalD();
		ld2.adiFinal(new Diagnostico("032355", "cabeza caliente", "paracetamol", "15/02/2024", lsm3));
	
		LD_NormalH lh1 = new LD_NormalH();
		lh1.adiFinal(new Historial("000012", ld1));
		lh1.adiFinal(new Historial("000015", ld2));
		
		
		LD_NormalP lp1 = new LD_NormalP();
		lp1.adiFinal(new Paciente("000012", "saul aguilar", 19, "6645215"));
		lp1.adiFinal(new Paciente("000015", "carlos mendez", 29, "6612315"));
		lp1.adiFinal(new Paciente("000018", "victor ramirez", 39, "6456215"));
		lp1.adiFinal(new Paciente("000011", "juan basquez", 21, "6789215"));
		lp1.adiFinal(new Paciente("000019", "pedro conde", 22, "6852215"));
		lp1.adiFinal(new Paciente("000025", "alex marin", 18, "6147215"));
		lp1.adiFinal(new Paciente("000035", "daniel vargas", 25, "6753215"));
               
		
		ColaSimpleIn cin1 = new ColaSimpleIn();
		cin1.adi(new PacienteEnEspera("dolor en el pecho", "000123"));
		cin1.adi(new PacienteEnEspera("taquicardia", "000120"));
		cin1.adi(new PacienteEnEspera("presion alta", "000143"));
		
		ColaSimpleIn cin2 = new ColaSimpleIn();
		cin2.adi(new PacienteEnEspera("esguince", "012345"));
		cin2.adi(new PacienteEnEspera("dolo de muñeca", "000223"));
		cin2.adi(new PacienteEnEspera("dolor de hueso", "003123"));
		cin2.adi(new PacienteEnEspera("fractura", "005349"));
		cin2.adi(new PacienteEnEspera("dolor de hueso", "04234"));
		cin2.adi(new PacienteEnEspera("tobillo dislocado", "000042"));
		
		
		ColaSimpleIn cin3 = new ColaSimpleIn();
		cin3.adi(new PacienteEnEspera("dolor de cabeza", "000323"));
		cin3.adi(new PacienteEnEspera("fiebre", "00013"));
		cin3.adi(new PacienteEnEspera("fractura", "00053"));
		cin3.adi(new PacienteEnEspera("dolor de oido", "000111"));
		
		ColaCircularC cc1 = new ColaCircularC();
		cc1.adi(new Consultorio("0022", "012355", cin1));
		cc1.adi(new Consultorio("0032", "012365", cin2));
		cc1.adi(new Consultorio("0042", "032355", cin3));
		
		PilaM pm = new PilaM();
		pm.adi(new Medico("012355", "cardiologia", "saul mayta"));
		pm.adi(new Medico("012365", "traumatologo", "carlos aguilar"));
                //pm.adi(new Medico("012355", "traumatologo", "jhamil"));
		pm.adi(new Medico("032355", "pediatra", "diego salas"));
		
		this.setLh(lh1);
		this.setLp(lp1);
		this.setCc(cc1);
		this.setPm(pm);

		
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