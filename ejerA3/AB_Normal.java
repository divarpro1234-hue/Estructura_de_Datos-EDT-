import java.util.Scanner;
//Lic. Marcelo Aruquipa
public class AB_Normal extends ArbolBinario {
	
	private Nodo raiz;

    public AB_Normal() {
        this.raiz = new Nodo(); // Inicializamos el nodo raíz
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
	public void crear(Nodo R) {
		Scanner lee = new Scanner(System.in);
		if(R != null) {
			Letra x = new Letra();
			x.leer();
			R.setLetra(x);
			System.out.println("tendra izq? s/n");
			String resp = lee.next();
			if(resp.equalsIgnoreCase("s")) {
				Nodo nuevo = new Nodo();
				R.setIzq(nuevo);
				crear(R.getIzq());
			}
			System.out.println("tendra der? s/n");
			resp = lee.next();
			if(resp.equalsIgnoreCase("s")) {
				Nodo nuevo = new Nodo();
				R.setDer(nuevo);
				crear(R.getDer());
			}
		}
	}
	
	public void crearPorDefecto() {
		this.getRaiz().setLetra(new Letra("A"));
		this.getRaiz().setIzq(new Nodo(new Letra("W")));
		this.getRaiz().setDer(new Nodo(new Letra("J")));
		this.getRaiz().getIzq().setIzq(new Nodo(new Letra("E")));
		this.getRaiz().getIzq().setDer(new Nodo(new Letra("D")));
		this.getRaiz().getDer().setDer(new Nodo(new Letra("H")));		
	}
	
	public void podarDesdeNivelX(int nivx) {
	    ColaSimpleNodo niv = new ColaSimpleNodo();
	    ColaSimpleNodo des = new ColaSimpleNodo(); 
	    niv.adi(raiz);
	    int n = 1;
	    while (!niv.esVacia()) {	        
	        if (n == nivx - 1) {
	            while (!niv.esVacia()) {
	                Nodo R = niv.eli();
	                if (R.getIzq() != null) {
	                    R.setIzq(null);
	                }
	                if (R.getDer() != null) {
	                    R.setDer(null);
	                }
	            }
	            return;
	        }
	        while (!niv.esVacia()) {
	            Nodo S = niv.eli();
	            if (S.getIzq() != null) {
	                des.adi(S.getIzq());
	            }
	            if (S.getDer() != null) {
	                des.adi(S.getDer());
	            }
	        }
	        niv.vaciar(des);
	        n++;
	    }
	}



	public int contarHojas(Nodo R){
		if(R != null) {
			int c = contarHojas(R.getIzq()) + contarHojas(R.getDer());
			if(R.getIzq() == null && R.getDer() == null)
				c = c+1;
			return c;
		}else
			return 0;
	}
	
	public void inorden(Nodo R) {
		if(R != null) {
			inorden(R.getIzq());
			R.getLetra().mostrar();
			inorden(R.getDer());
		}
	}
	
	public void preorden(Nodo R) {
		if(R != null) {
			R.getLetra().mostrar();
			preorden(R.getIzq());
			preorden(R.getDer());
		}
	}
	
	
	public void postOrden(Nodo R) {
		if(R != null) {
			postOrden(R.getIzq());
			postOrden(R.getDer());
			R.getLetra().mostrar();
		}
	}
	
}
