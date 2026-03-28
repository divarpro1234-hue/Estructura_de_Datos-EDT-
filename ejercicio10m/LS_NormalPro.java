
public class LS_NormalPro extends ListaSimplePro{

	public LS_NormalPro() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Produccion z) {
		NodoPro nuevo = new NodoPro();
		nuevo.setProduccion(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      
	}
	
	public void adiFinal(Produccion z) {
		NodoPro nuevo = new NodoPro();
		nuevo.setProduccion(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoPro R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoPro R = P;   //R apunta  a la raiz P
		while(R != null) {
			R.getProduccion().mostrar();
			
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoPro R = P;
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
	
	public NodoPro eliPrincipio() {
		NodoPro x = new NodoPro();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoPro eliFinal() {
		NodoPro x = new NodoPro();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoPro R = P;
				NodoPro S = P;
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
