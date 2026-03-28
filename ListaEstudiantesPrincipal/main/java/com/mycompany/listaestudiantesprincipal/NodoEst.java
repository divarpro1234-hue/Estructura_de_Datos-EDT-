/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaestudiantesprincipal;

/**
 *
 * @author Fabricio
 */
public class NodoEst {
    private String ci;
	private String ru;
	private	String pat;
	private String mat;
	private String nom;
	
	private NodoEst sig;
	
	public NodoEst() {  //constructor
		sig = null;
	}

    public NodoEst(String ci, String ru, String pat, String mat, String nom) {
        this.ci = ci;
        this.ru = ru;
        this.pat = pat;
        this.mat = mat;
        this.nom = nom;
  
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getRu() {
        return ru;
    }

    public void setRu(String ru) {
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
