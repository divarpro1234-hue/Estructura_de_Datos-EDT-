
public class NodoMes {
    private
        String mes;
        LD_NormalCC lcc;
        
        NodoMes sig;
        
    public NodoMes(){
    	sig=null;
    }
    
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	
	public LD_NormalCC getLcc() {
		return lcc;
	}
	public void setLcc(LD_NormalCC lcc) {
		this.lcc = lcc;
	}
	public NodoMes getSig() {
		return sig;
	}
	public void setSig(NodoMes sig) {
		this.sig = sig;
	}	    
}
