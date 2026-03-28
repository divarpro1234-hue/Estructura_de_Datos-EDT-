/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaestudiantesprincipal;

/**
 *
 * @author Fabricio
 */
public class ListaSimpleEst {
    	protected NodoEst P;  //raiz de la lista
	
	public ListaSimpleEst() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoEst getP() {
		return P;
	}

	public void setP(NodoEst p) {
		P = p;
	}
	
}
