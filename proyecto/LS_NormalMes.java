import java.util.Scanner;

public class LS_NormalMes extends ListaNormalMes {

    public LS_NormalMes() {
        super();  // Constructor de la clase padre ListaSimpleEst
    }

    public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

    public int nroNodos() {
		NodoMes R = P;
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

    public void adiFinal(String mes, LD_NormalCC lcc) {
    	NodoMes nuevo = new NodoMes();
        nuevo.setMes(mes);
        nuevo.setLcc(lcc);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoMes R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}

    public void adiPrincipio(String mes, LD_NormalCC lcc) {
    	NodoMes nuevo = new NodoMes();
        nuevo.setMes(mes);
        nuevo.setLcc(lcc);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}

    public void mostrar() {
    	 if (P == null) {
             System.out.println("Lista vacía");
             return;
         }
		NodoMes R = P;   //R apunta  a la raiz P
		while(R != null) {
			System.out.println("\n\t"+R.getMes());
        	R.getLcc().mostrar();
			R = R.getSig();
		}
	}
    
    public NodoMes eliPrincipio() {
		NodoMes x = new NodoMes();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
    public NodoMes eliFinal() {
		NodoMes x = new NodoMes();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoMes R = P;
				NodoMes S = P;
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
    
    public void leer1(int n){
    	Scanner lee =new Scanner(System.in);
    	String s;
    	int k;
    	for(int i = 1; i <= n; i++){
    		LS_NormalMes z = new LS_NormalMes();
    		System.out.println("Leer mes: ");
    		s=lee.next();
    		System.out.println("leer lista evento");
    		k=lee.nextInt();
    		z.leer1(k);
    		adiPrincipio(s, null);
    	}
    }
}


