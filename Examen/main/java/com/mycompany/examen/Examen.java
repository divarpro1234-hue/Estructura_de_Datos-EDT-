

package com.mycompany.examen;

import javax.swing.JOptionPane;

public class Examen {

    public static void main(String[] args) {
        try {
            String input = JOptionPane.showInputDialog("Ingrese un número:");
            int numero = Integer.parseInt(input);
            Numero checker = new Numero(numero);

            int resultado = checker.modificarNumero();
            JOptionPane.showMessageDialog(null, "El número modificado es: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
        }
    }
}
