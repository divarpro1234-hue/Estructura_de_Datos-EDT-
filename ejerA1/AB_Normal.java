import java.util.Scanner;
//Lic. Marcelo Aruquipa
public class AB_Normal extends ArbolBinario {
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
	//SOLUCION DEL INCISO d)
	public int contarHojas(Nodo R){
		if(R != null) {
			int c = contarHojas(R.getIzq()) + contarHojas(R.getDer());
			if(R.getIzq() == null && R.getDer() == null)
				c = c+1;
			return c;
		}else
			return 0;
	}
	//SOLUCION DEL INCISO b)
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
