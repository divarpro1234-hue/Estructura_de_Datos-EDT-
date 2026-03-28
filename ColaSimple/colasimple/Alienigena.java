/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colasimple;

/**
 *
 * @author inafh
 */
public class Alienigena {
    private String nombre;
    private int cantPla;
    private String planeta;

    public Alienigena(String nombre, int cantPla, String planeta) {
        this.nombre = nombre;
        this.cantPla = cantPla;
        this.planeta = planeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantPla() {
        return cantPla;
    }

    public void setCantPla(int cantPla) {
        this.cantPla = cantPla;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }
    
    public void mostrar(){
        System.out.println("Nombre: " + nombre + "Cant platillos: "+ cantPla + "Planeta "+ planeta);
    }
}
