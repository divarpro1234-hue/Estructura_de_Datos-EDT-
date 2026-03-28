public class NodoAdmin {
	private Admin admin;
	private NodoAdmin sig;
	
	public NodoAdmin() {  //constructor
		sig = null;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public NodoAdmin getSig() {
		return sig;
	}

	public void setSig(NodoAdmin sig) {
		this.sig = sig;
	}
	
}
