

public class NodoCan {
	private Cancion z;
	
	private NodoCan sig; //definiendo el campo enlace sig
	private NodoCan ant;
	
	public NodoCan() {  //constructor
		sig = null;
		ant = null;
	}

	public NodoCan getAnt() {
		return ant;
	}

	public void setAnt(NodoCan ant) {
		this.ant = ant;
	}

	public NodoCan getSig() {
		return sig;
	}

	public void setSig(NodoCan sig) {
		this.sig = sig;
	}

	public Cancion getZ() {
		return z;
	}

	public void setZ(Cancion z) {
		this.z = z;
	}
	
}
