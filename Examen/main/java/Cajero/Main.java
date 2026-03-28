/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cajero;

import javax.swing.JOptionPane;

/**
 *
 * @author s2dan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cajero cajero = new Cajero();
        String[] opciones = {"Depositar", "Retirar", "Salir"};
        boolean continuar = true;

        while (continuar) {
            String seleccion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una opción:",
                "Menú Cajero",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]
            );

            if (seleccion == null || seleccion.equals("Salir")) {
                cajero.salir();
                continuar = false;
            } else if (seleccion.equals("Depositar")) {
                cajero.depositar();
            } else if (seleccion.equals("Retirar")) {
                cajero.retirar();
            }
        }
    }
    
}
