
public class NodoEst {
	private int ci;
	private int ru;
	private	String pat;
	private String mat;
	private String nom;
	
	private NodoEst sig;
	
	public NodoEst(int ci, int ru, String pat, String mat, String nom) {  //constructor
		this.ci=ci;
		this.ru=ru;
		this.pat=pat;
		this.mat=mat;
		this.nom=nom;
		sig = null;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public int getRu() {
		return ru;
	}

	public void setRu(int ru) {
		this.ru = ru;
	}

	public String getPat() {
		return pat;
	}

	public void setPat(String pat) {
		this.pat = pat;
	}

	public String getMat() {
		return mat;
	}

	public void setMat(String mat) {
		this.mat = mat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public NodoEst getSig() {
		return sig;
	}

	public void setSig(NodoEst sig) {
		this.sig = sig;
	}
	
	
}

