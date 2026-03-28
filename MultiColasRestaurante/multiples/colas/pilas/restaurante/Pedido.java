/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiples.colas.pilas.restaurante;

/**
 *
 * @author inafh
 */
public class Pedido {
    private int nroCombo;
    private int cant;

    public Pedido(int nroCombo, int cant) {
        this.nroCombo = nroCombo;
        this.cant = cant;
    }

    public int getNroCombo() {
        return nroCombo;
    }

    public void setNroCombo(int nroCombo) {
        this.nroCombo = nroCombo;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    public void mostrar(){
        System.out.println(nroCombo+" "+cant);
    }
}
