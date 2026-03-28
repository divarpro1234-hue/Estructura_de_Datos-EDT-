/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author inafh
 */
public class Combo {
    private int nro;
    private String descripcion;
    private int precio;
    private CSimpleProd cp;

    public Combo(int nro, String descripcion, int precio, CSimpleProd cp) {
        this.nro = nro;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cp = cp;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public CSimpleProd getCp() {
        return cp;
    }

    public void setCp(CSimpleProd cp) {
        this.cp = cp;
    }

    public void mostrar(){
        System.out.println(nro+" "+descripcion+" "+precio);
        cp.mostrar();
    }
}
