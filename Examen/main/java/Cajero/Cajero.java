/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajero;
import javax.swing.JOptionPane;

public class Cajero {
    private double saldo;

    public Cajero() {
        this.saldo = 0.0; // El saldo inicial es cero
    }

    public void depositar() {
        try {
            String input = JOptionPane.showInputDialog("Ingrese el monto a depositar:");
            double monto = Double.parseDouble(input);

            if (monto > 0) {
                saldo += monto;
                JOptionPane.showMessageDialog(null, "Depósito exitoso. Saldo actual: $" + saldo);
            } else {
                JOptionPane.showMessageDialog(null, "El monto debe ser positivo.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un monto válido.");
        }
    }

    public void retirar() {
        try {
            String input = JOptionPane.showInputDialog("Ingrese el monto a retirar:");
            double monto = Double.parseDouble(input);

            if (monto > 0 && monto <= saldo) {
                saldo -= monto;
                JOptionPane.showMessageDialog(null, "Retiro exitoso. Saldo actual: $" + saldo);
            } else if (monto > saldo) {
                JOptionPane.showMessageDialog(null, "Fondos insuficientes. Saldo disponible: $" + saldo);
            } else {
                JOptionPane.showMessageDialog(null, "El monto debe ser positivo.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un monto válido.");
        }
    }

    public void salir() {
        JOptionPane.showMessageDialog(null, "Gracias por usar el cajero. Saldo final: $" + saldo);
    }
}
