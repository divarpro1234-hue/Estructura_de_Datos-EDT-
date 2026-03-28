package com.mycompany.examen;
import javax.swing.JOptionPane;

class Numero {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int modificarNumero() {
        if (numero % 2 == 0) {
            numero += 1; // Sumar 1 si es par
        } else {
            numero -= 1; // Restar 1 si es impar
        }
        return numero;
    }
}

