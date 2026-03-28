package com.mycompany.listaestudiantesprincipal;

public class NodoMat {
    private String nom;  
    private NodoMat sig; 

    
    public NodoMat() {
        this.nom = "";
        this.sig = null;
    }
    public NodoMat(String nom) {
        this.nom = nom;
        this.sig = null; 
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public NodoMat getSig() {
        return sig;
    }

    public void setSig(NodoMat sig) {
        this.sig = sig;
    }
}
