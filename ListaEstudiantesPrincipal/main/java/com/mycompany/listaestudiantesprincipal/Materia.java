/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaestudiantesprincipal;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class Materia {
    private String sigla;
    private String nombre;
    private String paralelo;
    private String nomDoc;
    private LS_NormalEst le;

  public Materia(String sigla, String nombre, String paralelo, String nomDoc) {
    this.sigla = sigla;
    this.nombre = nombre;
    this.paralelo = paralelo;
    this.nomDoc = nomDoc;
    this.le = le;
}

    public void leer(){
        Scanner lee = new Scanner(System.in);
        System.out.println("Datos: sigla, nombre, paralelo, nomDoc");
        this.sigla = lee.next();
        this.nombre = lee.next();
        this.paralelo = lee.next();
        this.nomDoc = lee.next();
        
    }
  

    @Override
    public String toString() {
        return "Materia{" + "sigla=" + sigla + ", nombre=" + nombre + ", paralelo=" + paralelo + ", nomDoc=" + nomDoc + ", le=" + le + '}';
    }
    public void mostrar(){
        System.out.println(toString());
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public String getNomDoc() {
        return nomDoc;
    }

    public void setNomDoc(String nomDoc) {
        this.nomDoc = nomDoc;
    }

    public LS_NormalEst getLe() {
        return le;
    }

    public void setLe(LS_NormalEst le) {
        this.le = le;
    }
    
    
}
