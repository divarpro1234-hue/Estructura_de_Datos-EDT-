/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaestudiantesprincipal;

/**
 *
 * @author Fabricio
 */
public class ListaSimpleMat {
    
		protected NodoMat P;  //raiz de la lista
		
		public ListaSimpleMat() {
			P = null;		// la raiz apunta a nullo es decir
							// se define una lista simple vacia
		}

    public NodoMat getP() {
        return P;
    }

    public void setP(NodoMat P) {
        this.P = P;
    }
    
                
    
}
