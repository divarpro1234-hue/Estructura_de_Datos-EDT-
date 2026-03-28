import java.util.Scanner;

public class PilaBus extends VectorBus{
	private int tope;

	public PilaBus() {
		this.tope = -1;
	}
	public boolean esVacia(){
		if(this.tope == -1)
			return true;  //pila vacia
		else
			return false; //pila no es vacia
	}
	public boolean esLlena(){
		if(this.tope == max-1)
			return true;  //pila llena
		else 
			return false; //pila no es llena
	}
	public void adi(Bus elem){
		if(!esLlena()){ //si la pila no es llena
			this.tope++;  //incrementa en una unidad  tope = tope + 1
			this.v[this.tope] = elem;
		}
		else
			System.out.println("Pila Llena!!!");
	}
	public Bus eli(){
		Bus elem = new Bus("","",new PilaPasajero(),"","");
		if(!esVacia()){ //si la pila no es vacia
			elem = this.v[this.tope];
			this.tope--; //decrementamos en una unidad
		}
		else
			System.out.println("Pila es vacia!!!!");
		return elem;
	}
	
	public void mostrar(){
		PilaBus aux = new PilaBus();
		System.out.println("\nDatos de la pila: ");
		while(!esVacia()){
			Bus elem = eli();
			//System.out.println(elem);
			elem.mostrar();
			aux.adi(elem);
		} 
		vaciar(aux);
	}
	public void vaciar(PilaBus p){
		while(!p.esVacia()){  //mientras la pila p NO es vacia
			this.adi(p.eli());
		}
	}
	public void llenar(int n){
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr datos placa, color, datos de la pila, conductor ruta");
		for (int i = 1; i <= n; i++) {
			String placa = lee.next();
			String color= lee.next();
			PilaPasajero pj = new PilaPasajero();
			String conductor = lee.next();
			String ruta= lee.next();
			
			
			Bus elem = new Bus(placa, color, pj, conductor, ruta);
			//char elem = lee.next().charAt(0);
			this.adi(elem);
		}
	}
	public int nroElem(){
		return tope + 1;
	}
}
