import java.util.Scanner;
//Lic. Marcelo Aruquipa
public class AB_Normal extends ArbolBinario {
	public void crear(Nodo R) {
		Scanner lee = new Scanner(System.in);
		if(R != null) {
			System.out.println("ingrese una letra");
			String x = lee.next();
			
			R.setLetra(x);
			System.out.println("tendra izq? s/n");
			String resp = lee.next();
			if(resp.equals("s")) {
				Nodo nuevo = new Nodo();
				R.setIzq(nuevo);
				crear(R.getIzq());
			}
			System.out.println("tendra der? s/n");
			resp = lee.next();
			if(resp.equals("s")) {
				Nodo nuevo = new Nodo();
				R.setDer(nuevo);
				crear(R.getDer());
			}
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
	
	public void mostrarHojas(Nodo R){
		if(R != null) {
			
			if(R.getIzq() == null && R.getDer() == null)
				System.out.println(R.getLetra());
			mostrarHojas(R.getIzq());
			mostrarHojas(R.getDer());
		}
	}
	public boolean verificarLetraX(Nodo R, String letrax) {
		if(R != null) {
			if(R.getLetra().equals(letrax)) {
				return true;
			}
			verificarLetraX(R.getIzq(), letrax);
			verificarLetraX(R.getDer(), letrax);
			
		}return false;
	}
	
	
	
	public int contarCuantasF(Nodo R, String x) {
		if(R != null) {
			int c = contarCuantasF(R.getIzq(), x) + contarCuantasF(R.getDer(), x);
			if(R.getLetra().equals(x)) {
				c = c+1;
			}return c;
			
		}return 0;
	}
	
//	public void crearPorDefecto() {
//		this.getRaiz().setPer(new Persona("alan", 17));
//		this.getRaiz().setIzq(new Nodo(new Persona("ruben", 20)));
//		this.getRaiz().setDer(new Nodo(new Persona("ana", 15)));
//		this.getRaiz().getIzq().setIzq(new Nodo(new Persona("elba", 18)));
//		this.getRaiz().getIzq().setDer(new Nodo(new Persona("joel", 21)));
//		this.getRaiz().getDer().setDer(new Nodo(new Persona("zoila", 18)));		
//	}
	
	public void preorden(Nodo R) {
		if(R != null) {
			System.out.println(R.getLetra());
			preorden(R.getIzq());
			preorden(R.getDer());
		}
	}
	
	public void postOrden(Nodo R) {
		if(R != null) {
			postOrden(R.getIzq());
			postOrden(R.getDer());
			System.out.println(R.getLetra());
		}
	}
	public void inorden(Nodo R) {
		if(R != null) {
			inorden(R.getIzq());
			System.out.println(R.getLetra());
			inorden(R.getDer());
		}
	}
//	public double promEdad() {
//		ColaSimpleNodo niv = new ColaSimpleNodo();
//		ColaSimpleNodo des = new ColaSimpleNodo();
//		int cnt = 0;
//		int sum = 0;
//		Nodo x = getRaiz();
//		niv.adi(x);
//		while(!niv.esVacia()) {
//			while(!niv.esVacia()) {
//				x = niv.eli();
//				Persona z =  x.getPer();
//				sum += z.getEdad();
//				cnt ++;
//				if(x.getIzq() != null) 
//					des.adi(x.getIzq());
//				if(x.getDer() != null)
//					des.adi(x.getDer());
//			}
//			niv.vaciar(des);
//		}
//		return (sum/(double)cnt);
//	}
	
}

