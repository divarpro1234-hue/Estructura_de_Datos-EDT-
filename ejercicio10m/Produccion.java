import java.util.Scanner;

public class Produccion {
	private String idcultivo;
	private int tonelada;
	private int hectarea;
	
	public Produccion(String idcultivo, int tonelada, int hectarea) {
		this.idcultivo = idcultivo;
		this.tonelada = tonelada;
		this.hectarea = hectarea;
		
	}
	
	public Produccion() {
		this.idcultivo = "";
		this.tonelada = 0;
		this.hectarea = 0;
	
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Datos de los cultivos: idcultivo, tonelada, hectarea");
		this.idcultivo = lee.next();
		this.tonelada = lee.nextInt();
		this.hectarea = lee.nextInt();
		
	}

	public void mostrar() {
		System.out.println();
		System.out.println("idcultivo : " + this.idcultivo);
		System.out.println("tonelada: " + this.tonelada);
		System.out.println("hectarea: " + this.hectarea);
		System.out.println();
	}

	public String getIdcultivo() {
		return idcultivo;
	}

	public void setIdcultivo(String idcultivo) {
		this.idcultivo = idcultivo;
	}

	public int getTonelada() {
		return tonelada;
	}

	public void setTonelada(int tonelada) {
		this.tonelada = tonelada;
	}

	public int getHectarea() {
		return hectarea;
	}

	public void setHectarea(int hectarea) {
		this.hectarea = hectarea;
	}
}
