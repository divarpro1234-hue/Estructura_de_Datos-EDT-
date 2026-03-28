//Lic Aruquipa Marcelo
import java.util.Scanner;

public class Puesto {
	private String id;
	private String nroPuesto;
	private String nomProd;
	private String idF_agro;
	

	public Puesto(String id, String nroPuesto, String nomProd, String idF_agro) {
		this.id = id;
		this.nroPuesto = nroPuesto;
		this.nomProd = nomProd;
		this.idF_agro = idF_agro;
	}
	public Puesto() {
		this.id = "";
		this.nroPuesto = "";
		this.nomProd = "";
		this.idF_agro = "";
	
	}
	public void mostrar() {
		System.out.println("id: " + id);
		System.out.println("numero de puesto: " + nroPuesto);
		System.out.println("nombre de productor" + this.nomProd);
		System.out.println("id feria agro: " + idF_agro);
		System.out.println();
	}
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.id = lee.next();
		this.nroPuesto = lee.next();
		this.idF_agro = lee.next();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNroPuesto() {
		return nroPuesto;
	}
	public void setNroPuesto(String nroPuesto) {
		this.nroPuesto = nroPuesto;
	}
	public String getNomProd() {
		return nomProd;
	}
	public void setNomProd(String nomProd) {
		this.nomProd = nomProd;
	}
	public String getIdF_agro() {
		return idF_agro;
	}
	public void setIdF_agro(String idF_agro) {
		this.idF_agro = idF_agro;
	}
	
}
