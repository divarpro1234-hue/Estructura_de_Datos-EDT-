/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class NodoCC {
	private CentroConvencional cenCon;
	private NodoCC ant;
	private NodoCC sig;
	
	public NodoCC(){
		this.sig = null;
		this.ant = null;
	}
	
	public CentroConvencional getCenCon() {
		return cenCon;
	}

	public void setCenCon(CentroConvencional cenCon) {
		this.cenCon = cenCon;
	}

	public NodoCC getAnt() {
		return ant;
	}

	public void setAnt(NodoCC ant) {
		this.ant = ant;
	}

	public NodoCC getSig() {
		return sig;
	}

	public void setSig(NodoCC sig) {
		this.sig = sig;
	}
	
}
