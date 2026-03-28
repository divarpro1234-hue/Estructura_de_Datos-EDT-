//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Departamento {
	private String nomDep;
	private LD_NormalProductora lpro;
	
	public Departamento(String nomDep, LD_NormalProductora lpro) {
		this.nomDep = nomDep;
		this.setLpro(lpro);
	}
	public Departamento() {
		this.nomDep = "";
	}
	
	public void mostrar() {
		System.out.println("\tnombre departamento: " + this.nomDep);
		System.out.println("\ndatos lista productora");
		lpro.mostrar();
		System.out.println();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.nomDep= lee.next();
	}
	
	public String getNomDep() {
		return nomDep;
	}
	public void setNomDep(String nomDep) {
		this.nomDep = nomDep;
	}
	public LD_NormalProductora getLpro() {
		return lpro;
	}
	public void setLpro(LD_NormalProductora lpro) {
		this.lpro = lpro;
	}
}
