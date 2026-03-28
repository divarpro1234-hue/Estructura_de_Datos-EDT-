import java.util.Scanner;

public class PilaEspecialidad extends VectorEspecialidad{
	private int tope;

	public PilaEspecialidad() {
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
	public void adi(Especialidad elem){
		if(!esLlena()){ //si la pila no es llena
			this.tope++;  //incrementa en una unidad  tope = tope + 1
			this.v[this.tope] = elem;
		}
		else
			System.out.println("Pila Llena!!!");
	}
	public Especialidad eli(){
		Especialidad elem = new Especialidad("", 0);
		if(!esVacia()){ //si la pila no es vacia
			elem = this.v[this.tope];
			this.tope--; //decrementamos en una unidad
		}
		else
			System.out.println("Pila es vacia!!!!");
		return elem;
	}
	
	public void mostrar(){
		PilaEspecialidad aux = new PilaEspecialidad();
		System.out.println("\nDatos de la pila: ");
		while(!esVacia()){
			Especialidad elem = eli();
			//System.out.println(elem);
			elem.mostrar();
			aux.adi(elem);
		} 
		vaciar(aux);
	}
	public void vaciar(PilaEspecialidad p){
		while(!p.esVacia()){  //mientras la pila p NO es vacia
			this.adi(p.eli());
		}
	}
	public void llenar(int n){
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr datos nombre, materia");
		for (int i = 1; i <= n; i++) {
			String nom = lee.next();
			int sala = lee.nextInt();
			
					
			Especialidad elem = new Especialidad(nom, sala);
			//char elem = lee.next().charAt(0);
			this.adi(elem);
		}
	}
	public int nroElem(){
		return tope + 1;
	}
}
