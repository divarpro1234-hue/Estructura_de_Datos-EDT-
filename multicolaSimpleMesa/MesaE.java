
import java.util.Scanner;
public class MesaE {
	private
	int numMesa;
	String tipo;
	private ColaSimpleElector elector ;
	private ColaCircularDelegado delegado ;
	private PilaVoto voto;
	public MesaE() {
		elector = new ColaSimpleElector();
        delegado = new ColaCircularDelegado();
        voto = new PilaVoto();
		
	}
	public MesaE(int numMesa, String tipo, ColaSimpleElector elector, ColaCircularDelegado delegado, PilaVoto voto) {
		super();
		this.numMesa = numMesa;
		this.tipo = tipo;
		this.elector = elector;
		this.delegado = delegado;
		this.voto = voto;
	}
	public void leer() {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Ingrese el número de la mesa:");
	    numMesa = sc.nextInt();
	    
	    System.out.println("Ingrese el tipo de la mesa:");
	    tipo = sc.next();
	    
	    System.out.println("Introduzca la cantidad de Electores:");
	    int cantE = sc.nextInt();
	    sc.nextLine(); // Consumir el salto de línea
	    
	    for (int i = 0; i < cantE; i++) {
	        System.out.println("NOMBRE del Elector " + (i + 1) + ":");
	        String nombreElector = sc.nextLine();
	        System.out.println("CI del Elector " + (i + 1) + ":");
	        int ciElector = sc.nextInt();
	        sc.nextLine(); // Consumir el salto de línea
	        elector.adi(new Elector(nombreElector, ciElector));
	    }
	    
	    System.out.println("Introduzca la cantidad de Delegados:");
	    int cantD = sc.nextInt();
	    sc.nextLine(); // Consumir el salto de línea
	    
	    for (int i = 0; i < cantD; i++) {
	        System.out.println("NOMBRE del Delegado " + (i + 1) + ":");
	        String nombreDelegado = sc.nextLine();
	        System.out.println("CI del Delegado " + (i + 1) + ":");
	        int ciDelegado = sc.nextInt();
	        sc.nextLine(); // Consumir el salto de línea
	        delegado.adi(new Delegado(nombreDelegado, ciDelegado));
	    }
	    
	    System.out.println("Introduzca la cantidad de Votos:");
	    int cantV = sc.nextInt();
	    sc.nextLine(); // Consumir el salto de línea
	    
	    for (int i = 0; i < cantV; i++) {
	        System.out.println("Voto " + (i + 1) + ":");
	        String elem = sc.next();
	        voto.adicionar(elem);
	        sc.nextLine(); 
	        
	    }
	}

	void mostrar() {
	    System.out.println("Numero de mesa: " + numMesa);
	    System.out.println("Tipo de mesa: " + tipo);
	    System.out.println("\t---Elector---");
	    elector.mostrar(); // Mostrar la cola de electores
	    System.out.println("\t---Delegado---");
	    delegado.mostrar(); // Mostrar la cola circular de delegados
	    System.out.println("\t---Voto---");
	    voto.mostrar(); // Mostrar la pila de votos
	    System.out.println();
	}

	public int getNumMesa() {
		return numMesa;
	}
	public void setNumMesa(int numMesa) {
		this.numMesa = numMesa;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public ColaSimpleElector getElector() {
		return elector;
	}
	public void setElector(ColaSimpleElector elector) {
		this.elector = elector;
	}
	public ColaCircularDelegado getDelegado() {
		return delegado;
	}
	public void setDelegado(ColaCircularDelegado delegado) {
		this.delegado = delegado;
	}
	public PilaVoto getVoto() {
		return voto;
	}
	public void setVoto(PilaVoto voto) {
		this.voto = voto;
	}
	
}
