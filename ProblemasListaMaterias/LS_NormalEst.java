import java.util.Scanner;

public class LS_NormalEst extends ListaSimpleEst{
	public LS_NormalEst() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(int ci, int ru,  String pat, String mat,String nom) {
		NodoEst nuevo = new NodoEst(0,0,"","","");
		nuevo.setCi(ci);
		nuevo.setRu(ru);
		nuevo.setPat(pat);
		nuevo.setMat(mat);
		nuevo.setNom(nom);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(int ci, int ru,  String pat, String mat,String nom) {
		NodoEst nuevo = new NodoEst(0,0,"","","");
		nuevo.setCi(ci);
		nuevo.setRu(ru);
		nuevo.setPat(pat);
		nuevo.setMat(mat);
		nuevo.setNom(nom);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoEst R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoEst R = P;   //R apunta  a la raiz P
		while(R != null) {
			System.out.println(R.getCi() + " - " + R.getRu()+ " - " + R.getPat()+ " - " + R.getMat()+ " - " + R.getNom());
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoEst R = P;
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
	
	public NodoEst eliPrincipio() {
		NodoEst x = new NodoEst(0,0,"","","");    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoEst eliFinal() {
		NodoEst x = new NodoEst(0,0,"","","");
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoEst R = P;
				NodoEst S = P;
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
	
	public void llenar1(int n) {
		Scanner lee =  new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("ci - ru - apellido pat - apelligo mat - nombre ");
			int ci = lee.nextInt();
			int ru = lee.nextInt();
			String pat = lee.next();
			String mat = lee.next();
			String nom = lee.next();
			adiFinal(ci,ru,pat,mat,nom);
		}
	}
	
	public void llenar2(int n) {
		Scanner lee =  new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("ci - ru - apellido pat - apelligo mat - nombre ");
			int ci = lee.nextInt();
			int ru = lee.nextInt();
			String pat = lee.next();
			String mat = lee.next();
			String nom = lee.next();
			adiPrincipio(ci,ru,pat,mat,nom);
		}
	}
}
