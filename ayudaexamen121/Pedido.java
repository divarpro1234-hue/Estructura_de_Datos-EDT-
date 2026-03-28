/**
 *
 * @author CALLISAYA
 */
public class Pedido {
    private String idPlatillo;
    private String idCliente;
    private int cantidad;
    private double montoTotal;
    
    public Pedido(String idPlatillo, String idCliente, int cantidad,double montoTotal) {
		this.idPlatillo = idPlatillo;
		this.idCliente = idCliente;
		this.cantidad = cantidad;
		this.montoTotal = montoTotal;
	}
    public Pedido() {
		this.idPlatillo = "";
		this.idCliente = "";
		this.cantidad = 0;
		this.montoTotal = 0;
	}
        
	public String toString() {
		return "Cancion [idPlatillo=" + idPlatillo + ", idCliente=" + idCliente
				+ ", cantidad=" + cantidad + ", montoTotal=" + montoTotal + "]";
	}
	public void mostrar(){
		System.out.println(toString());
	}
	
	public String getidPlatillo() {
		return idPlatillo;
	}
	public void setidPlatillo(String idPlatillo) {
		this.idPlatillo = idPlatillo;
	}
	public String getidCliente() {
		return idCliente;
	}
	public void setidCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public int getcantidad() {
		return cantidad;
	}
	public void setcantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getmontoTotal() {
		return montoTotal;
	}
	public void setmontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
    
    
    
}
