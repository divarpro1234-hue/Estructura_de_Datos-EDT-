
import java.util.Scanner;

public class Evento {
	private String nombre;
	private String fecha;
	private String horaInicio;
	private String horaFin;
	private String organizador;
	private String tipoEvento;
	private int nroAsistentes;
	private String estado;

	
	public Evento(String nombre, String fecha,  String horaInicio, String horaFin, String organizador,
			String tipoEvento, int nroAsistentes, String estado) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.organizador = organizador;
		this.tipoEvento = tipoEvento;
		this.nroAsistentes = nroAsistentes;
		this.estado = estado;
		
	}
	
	public Evento() {
		this.nombre = "";
		this.fecha = "";
		this.horaInicio = "";
		this.horaFin = "";
		this.organizador = "";
		this.tipoEvento = "";
		this.nroAsistentes = 0;
		this.estado = "";
	}
	
	public void mostrar() {
		System.out.println("\nDATOS DEL EVENTO:");
		System.out.println();
		System.out.println("nombre: " + this.nombre);
		System.out.println("fecha: " + this.fecha);
		System.out.println("Hora Inicio: " + this.horaInicio);
		System.out.println("Hora Fin: " + this.horaFin);
		System.out.println("Organizador: " + this.organizador);
		System.out.println("Tipo Evento: " + this.tipoEvento);
		System.out.println("Numero Asistentes: " + this.nroAsistentes);
		System.out.println("Estado: " + this.estado);
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		this.nombre= lee.next();
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public String getOrganizador() {
		return organizador;
	}

	public void setOrganizador(String organizador) {
		this.organizador = organizador;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public int getNroAsistentes() {
		return nroAsistentes;
	}

	public void setNroAsistentes(int nroAsistentes) {
		this.nroAsistentes = nroAsistentes;
	}
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
