/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author inafh
 */
public class InfPedCli {
    private String nom;
    private String fecha;
    private PilaP p;

    public InfPedCli(String nom, String fecha, PilaP p) {
        this.nom = nom;
        this.fecha = fecha;
        this.p = p;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public PilaP getP() {
        return p;
    }

    public void setP(PilaP p) {
        this.p = p;
    }
    public void mostrar(){
        System.out.println(nom+" "+fecha);
        p.mostrar();
    }
}
