
public class LS_NormalV extends ListaSimpleV{

	public LS_NormalV() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Vehiculo z) {
		NodoV nuevo = new NodoV();
		nuevo.setVehiculo(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      
	}
	
	public void adiFinal(Vehiculo z) {
		NodoV nuevo = new NodoV();
		nuevo.setVehiculo(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoV R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoV R = P;   //R apunta  a la raiz P
		while(R != null) {
			R.getVehiculo().mostrar();
			
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoV R = P;
		int c = 0;
		if(this.esVacia())
			return 0;
		else {
			while(R != null) {
				c++;
				R = R.getSig();
			}
		}
		return c;
	}
	
	public NodoV eliPrincipio() {
		NodoV x = new NodoV();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoV eliFinal() {
		NodoV x = new NodoV();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoV R = P;
				NodoV S = P;
				while(R.getSig() != null) {
					S = R;         //S apunta a R
					R = R.getSig(); //R apunta al siguiente de R
				}
				x = R;
				S.setSig(null);
			}
		}
		return x;
	}
	
	
}
