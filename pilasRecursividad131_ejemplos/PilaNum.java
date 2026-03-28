import java.util.Scanner;

public class PilaNum extends VectorNum{
	private int tope;

	public PilaNum() {
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
	//suma de enteros
	public int suma() {
		if(!esVacia()) {
			return(eli() + suma());
		}else{
			return 0;
		}
	}
	public void adi(int elem){
		if(!esLlena()){ //si la pila no es llena
			this.tope++;  //incrementa en una unidad  tope = tope + 1
			this.v[this.tope] = elem;
		}
		else
			System.out.println("Pila Llena!!!");
	}
	public int eli(){
		int elem = 0;
		if(!esVacia()){ //si la pila no es vacia
			elem = this.v[this.tope];
			this.tope--; //decrementamos en una unidad
		}
		else
			System.out.println("Pila es vacia!!!!");
		return elem;
	}
	
	public void mostrar(){
		PilaNum aux = new PilaNum();
		System.out.println("\nDatos de la pila: ");
		while(!esVacia()){
			int elem = eli();
			System.out.println(elem);
//			elem.mostrar();
			aux.adi(elem);
		} 
		vaciar(aux);
	}
	public void vaciar(PilaNum p){
		while(!p.esVacia()){  //mientras la pila p NO es vacia
			this.adi(p.eli());
		}
	}

	public int nroElem(){
		return tope + 1;
	}
	
	
}
