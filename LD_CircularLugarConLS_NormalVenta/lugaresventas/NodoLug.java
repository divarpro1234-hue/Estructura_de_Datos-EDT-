package lugaresventas;

public class NodoLug {
    private
        String lugar;
    	int costo;
        LS_CircularVenta LV;
        NodoLug sig;
        NodoLug ant;
    public NodoLug(){
    	sig=null;
        ant=null;
    }
    
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public LS_CircularVenta getLV() {
		return LV;
	}
	public void setLV(LS_CircularVenta lV) {
		LV = lV;
	}
	public NodoLug getSig() {
		return sig;
	}
	public void setSig(NodoLug sig) {
		this.sig = sig;
	}
	public NodoLug getAnt() {
		return ant;
	}
	public void setAnt(NodoLug ant) {
		this.ant = ant;
	}
	    
}
