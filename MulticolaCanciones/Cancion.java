/**
 *
 * @author CALLISAYA
 */
public class Cancion {
    private String titulo;
    private String genero;
    private String cantante;
    private double duracion;
    
    public Cancion(String titulo, String genero, String cantante,double duracion) {
		this.titulo = titulo;
		this.genero = genero;
		this.cantante = cantante;
		this.duracion = duracion;
	}
        
	public String toString() {
		return "Cancion [titulo=" + titulo + ", genero=" + genero
				+ ", cantante=" + cantante + ", duracion=" + duracion + "]";
	}
	public void mostrar(){
		System.out.println(toString());
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCantante() {
		return cantante;
	}
	public void setCantante(String cantante) {
		this.cantante = cantante;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
    
    
    
}
